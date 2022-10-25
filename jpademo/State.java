
  package player.jpademo;
  
  import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

  @Entity
  @Table(name="state")
  @Data
  public class State {
  
  @Id
  @GeneratedValue
  private int sId;
  private String name; 
  //@manyToOne
  //Country country
  
  
  }
 