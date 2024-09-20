
public class Employee {
	
	private String firstName;
	private String lastName;
	private int registration, age, daysWorked, vacationDaysTaken, yearsWorked;
	private double salary;
	
	public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			int yearsWorked, double salary) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.age = age;
		this.daysWorked = daysWorked;
		this.vacationDaysTaken = vacationDaysTaken;
		this.yearsWorked = yearsWorked;
		this.salary = salary;
	}
	
	public int timeToRetirement() {
		
		return (60-this.age)>(40-this.yearsWorked)?30-this.yearsWorked:60-this.age;
		
	}
	
	public int vacationTimeLeft(){
	       // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
		return (this.daysWorked/360)*(30-this.vacationDaysTaken);
		
	}
	
	public double calculateBonus(){
	       return 2.2*this.salary;
	  }
	

}
