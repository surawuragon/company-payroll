import java.util.Date;

public class customerSupport extends Employees{

	double salary;
	int numHours;
	
	//default constructor
	customerSupport()
	{
		salary = 0.0;
		numHours = 0;
	}
	
	//parameterized constructor
	customerSupport(String name, Gender gender, Date dateBirth, int ID, Date dateHired, double salary, int numHours)
	{
		super(name, gender, dateBirth, ID, dateHired);
		this.salary = salary;
		this.numHours = numHours;
	}
	
	//getters and setters
	public double getSalary() {return salary;}
	public void setSalary(double salary) {this.salary = salary;}
	public int getNumHours() {return numHours;}
	public void setNumHours(int numHours) {this.numHours = numHours;}

	// convert to string
	@Override
	public String toString() 
	{
		return super.toString() + "customerSupport [salary=" + salary + ", numHours=" + numHours + "]";
	}
	
	//paid by hour calculation
	public void overtime () 
	{
		 double fullWage;
		 int extraHours = 48 - numHours;
		 if (extraHours <= 0) {
			 fullWage = numHours*salary;
			 System.out.println("Full wage is:  " + fullWage);
		 } else {
			fullWage = ((0.25*salary)*extraHours) + (numHours*salary);
			System.out.println("Amount paid for total overtime is " + fullWage);
		 }
	}
	
	

	//pay raise calculation
	public void payRaise() 
	{
		double payR = salary + (salary*0.02);
		System.out.println("Payraise for this wage is  " + payR);
	}
	
	//reset numb hrs worked
	public void reset()
	{
		numHours = 0;
	}
 
		
	
	
}//class end
