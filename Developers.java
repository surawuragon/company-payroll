import java.util.Date;

public class Developers extends Employees{
	
	 
	
	 enum Category {junior, mid, senior};
	 private double salary;
	 private String roleTitle;
	 private Category section;
	 
	 //default constructor
	Developers() 
	{ 
		super();
		this.salary = 0;
		this.roleTitle = "";
		this.section = section.junior;
	}
	
	//parameterized constructor
	Developers(String name, Gender gender, Date dateBirth, int ID, Date dateHired, double salary, String roleTitle, Category section)
	{
		super(name, gender, dateBirth, ID, dateHired);
		this.salary = salary;
		this.roleTitle = roleTitle;
		this.section = section;
	}
	 
	 //getters and setters
	 public double getSalary() {return salary;}
	 public void setSalary(double salary) {this.salary = salary;}
	 public String getRoleTitle() {return roleTitle;}
	 public void setRoleTitle(String roleTitle) {this.roleTitle = roleTitle;}
	 public Category getSection() {return section;}
	 public void setSection(Category section) {this.section = section;}
 
	//convert to string
	public String toString() 
	{
		return super.toString() + "developer [salary=" + salary + ", roleTitle=" + roleTitle + ", section=" + section + "]";
	}
	
	//pay raise calculation
	public void payRaise() 
	{
		
		if(this.section == section.junior )
		{
			if(salary<2000)
			{
				this.salary = (this.salary*0.03) + this.salary;
				System.out.println("Your salary is: " + this.salary);
			}else 
			{
				System.out.println("sorry you have reached maximun salary");
			}
	
		}else if(this.section == section.mid)
		{
			if(salary<4000)
			{
				this.salary = (this.salary*0.03) + this.salary;
				System.out.println("Your salary is: " + this.salary);
			}else
			{
				System.out.println("sorry you have reached maximun salary");
			}
		}else if (this.section == section.senior)
		{
			this.salary = (this.salary*0.03) + this.salary;
			System.out.println("The payraise for this term is: " + this.salary);
		}
		
	}
	
	//reset hrs empty
	public void reset()
	{};
		
		
		
		
	
}//class end
