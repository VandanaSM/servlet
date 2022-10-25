package player.jpademo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="country")
@Data
public class Country {
	@Id
	@GeneratedValue
	private int cId;
	private String name;
	private String code;
	@OneToMany(cascade = CascadeType.ALL)
	private List<State> listOfState;
	
	
	

	
}
