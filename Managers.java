import java.util.Date;

public class Managers extends Employees {

	private double salary;
	private double budget;
	private double spent;
	 
	 //default constructor
	 Managers()
	 {
		 super();
		 this.salary = 0;
		 this.budget = 0;
		 this.spent = 0;
	 }
	 
	 //parameterized constructor
	 Managers(String name, Gender gender, Date dateBirth, int ID, Date dateHired, double salary, double budget, double spent)
	 {
		 super(name, gender, dateBirth, ID, dateHired);
		 this.salary = salary;
		 this.budget = budget;
		 this.spent = spent;
	 }


	 //getters and setters
	public double getSalary() {return salary;}
	public void setSalary(double salary) {this.salary = salary;}
	public double getBudget() {return budget;}
	public void setBudget(double budget) {this.budget = budget;}
	public double getSpent() {return spent;}
	public void setSpent(double spent) {this.spent = spent;} 
	
	//convert to string
	public String toString() 
	{
		return super.toString() + "manager [salary=" + salary + ", budget=" + budget + ", spent=" + spent + "]";
	}

	//pay raise calculation
	public void payRaise()
	{
	this.salary = (salary*0.05) + this.salary;
	this.budget = this.budget + 200.0;
	System.out.println("The payraise for this term is: " + this.salary + " and the budget cap is " + this.budget);
	}
	
	//reset amount spent
	public void reset()
	{
		spent = 0;
	}
	
}// class end
