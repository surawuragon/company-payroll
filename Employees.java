import java.util.Calendar;
import java.util.Date;

public abstract class Employees {
	
	enum Gender {male, female};
	private String name;
	private Gender gender; 
	private Date dateBirth;
	private int ID;
	private Date dateHired;
	
	
	//default constructors
	Employees()
	{
		this.name = "";
		this.gender = gender.female;
		this.dateBirth = new Date();
		this.ID = 0;
		this.dateHired = new Date();
		
	}
	
	//parameterized constructors
	Employees(String name, Gender gender, Date dateBirth, int ID, Date dateHired)
	{
		this.name = name;
		this.gender = gender;
		this.dateBirth = dateBirth;
		this.ID = ID;
		this.dateHired = dateHired;
	}
	
	
	
	//getters and setters
	public String getName() {return name;}
	public void setName (String name) {this.name = name;}
	public Gender getGender() {return gender;}
	public void setGender (Gender gender) {this.gender = gender;}
	public Date getDateBirth() {return dateBirth;}
	public void setDateBirth (Date dateBirth) {this.dateBirth = dateBirth;}
	public int getID () {return ID;}
	public void setID (int ID) {this.ID = ID;}
	public Date getDateHired () {return dateHired;}
	public void setDateHired (Date dateHired) {this.dateHired = dateHired;}
	
	
	//convert to string
	public String toString() 
	{
		return "Employee [name=" + name + ", gender=" + gender + ", date of birth=" + (dateBirth.getYear()+1900) + " " + (dateBirth.getMonth()+1) + " " + dateBirth.getDate() + ", ID=" + ID + ", date hired=" + (dateHired.getYear()+1900) + " " + (dateHired.getMonth()+1) + " " + dateHired.getDate() + ", ";
	}
	
	//abstract functions
	public abstract void payRaise();
	public abstract double getSalary();
	public abstract void reset();


}//class end
	


