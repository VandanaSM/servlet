package player.jpademo.dto;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import player.jpademo.Country;
import player.jpademo.Player;
import player.jpademo.State;
import player.jpademo.Team;

public class TestDao {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("teamUnit");
		EntityManager manager=factory.createEntityManager(); //we can create many ojects of entitymanager
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		//State object
		State karnataka=new State();
		karnataka.setName("Karnataka");
		State tamil=new State();
		tamil.setName("Tamil");
		State maharastra=new State();
		maharastra.setName("Maharastra");
		State kerala=new State();
		kerala.setName("Kerala");
		//add all states to one arraylist
		
		ArrayList< State> states=new ArrayList<State>();
		states.add(kerala);
		states.add(maharastra);
		states.add(tamil);
		states.add(karnataka);
		
		//Country 
		Country india=new Country();
		india.setName("India");
		india.setCode("+91");
		india.setListOfState(states);//adding arraylist states
		
		//Team
		Team team=new Team();
		team.setName("Team India");
		team.setCode("In");
		
		Player dhoni=new Player();
		dhoni.setName("dhoni");
		dhoni.setCountry(india);
		dhoni.setSalary(40000000l);
		dhoni.setTeam(team);
		dhoni.setAge(60);
		
		/*manager.persist(karnataka);
		manager.persist(tamil);
		manager.persist(kerala);
		manager.persist(maharastra);
		manager.persist(india);
		manager.persist(team);
		manager.persist(dhoni);*/
		
		
		transaction.commit();
		
		System.out.println("-----------------player----------" +dhoni.toString());
		manager.close();
		EntityManager manager2=factory.createEntityManager();
		System.out.println("-----------player-----------" +dhoni.toString());
		manager2.close();
		factory.close();
	}
}
