package player.jpademo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="team")
@Data
public class Team {
    @Id
	private int tId;
	private String name;
	private String code;
	
	//private List<State> listOfState;
	//@ManytoOne
	//List<players>listOfPlayers
	
	
}
