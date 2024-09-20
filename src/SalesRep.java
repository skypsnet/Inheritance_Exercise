
public class SalesRep extends Employee {
	
	private double salesMade;

	public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			int yearsWorked, double salary, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, yearsWorked, salary);
		// TODO Auto-generated constructor stub
		
		this.salesMade = salesMade;
		
	}
	
	public double calculateComission(){
		return 0.1*salesMade;
	}
	
	public double getSales(){
		return this.salesMade;
	}
	

}
