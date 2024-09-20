import java.util.HashMap;

public class SalesManager extends SalesRep {

	HashMap<Integer, SalesRep> salesTeam = new HashMap<>();
	
	public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationDaysTaken, int yearsWorked, double salary, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, yearsWorked, salary, salesMade);
		// TODO Auto-generated constructor stub
		
		
		
	}
	
	

}
