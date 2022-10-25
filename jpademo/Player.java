
  package player.jpademo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="player")
@Data
public class Player {
  
  @Id
  @GeneratedValue
  private int pId; 
  private String name; 
  @OneToOne(cascade = CascadeType.ALL)
  private Country country;
  private long salary; 
  private int age;
  @OneToOne(cascade = CascadeType.ALL)
  private Team team;
 
 
 }
