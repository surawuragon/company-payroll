
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Company {
	
	private double balance;
	ArrayList<Employees> employees = new ArrayList<Employees>();
 
	// default constructor
	Company()
	{
		this.balance = 0; 	
	}
 
	// parameterized constructor
	Company(double balance, ArrayList<Employees> employees)
	{
	 this.balance = balance;
	}

	//getters and setters
	public double getBalance() {return balance;}
	public void setBalance(double balance) {this.balance = balance;}

	// convert to string
	@Override
	public String toString() 
	{
		return "Company [balance=" + balance + ", employees=" + employees + "]";
	}
	
	//add employee
	public void addEmployee (String type) throws Exception
	{
		Scanner input = new Scanner(System.in);
		Employees.Gender empGender;
		Developers.Category empCategory;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
	
		String name = "";
		int idnumbt = 0 ;
		double sals = 0;
		
		if(type.contains("manager"))
		{
			//set name
			Managers m = new Managers();
			System.out.println("Please enter name");
			name = input.nextLine().toLowerCase();
			m.setName(name);
			
			//set gender
			System.out.println("Please enter gender");
			String gender = input.nextLine().toLowerCase();
			if(gender.contains("male"))
			{
				empGender = Employees.Gender.male;
				m.setGender(empGender);
			}else if(gender.contains("female"))
			{
				empGender = Employees.Gender.female;
				m.setGender(empGender);
			}
			
			//set date of birth
			System.out.println("Date of birth in (YYYY MM DD) format");
			String res1 = input.nextLine();
			Date birth = sdf.parse(res1);
			m.setDateBirth(birth);
			
			//set id
			System.out.println("Please enter the ID");
			idnumbt = Integer.parseInt(input.nextLine());
			m.setID(idnumbt);
			
			//date hired
			System.out.println("Date hired in (YYYY MM DD) format");
			String res2 = input.nextLine();
			Date hired = sdf.parse(res2);
			m.setDateHired(hired);
			
			//set salary
			System.out.println("Please enter the salary");
			sals = input.nextDouble();
			m.setSalary(sals);
			
			//set budget
			System.out.println("What is the managers budget?");
			double budg = input.nextDouble();
			m.setBudget(budg);
			
			//set amount spent
			System.out.println("How much has the employee spent from budget so far?");
			double sp = input.nextDouble();
			m.setSpent(sp);
			
			//add employee to array
			this.employees.add(m);
			
		}else if(type.contains("developer"))
		{
			//set name
			Developers d = new Developers();
			System.out.println("Please enter name");
			name = input.nextLine().toLowerCase();
			d.setName(name);
			
			//set gender
			System.out.println("Please enter gender");
			String gender = input.nextLine().toLowerCase();
			if(gender.contains("male"))
			{
				empGender = Employees.Gender.male;
				d.setGender(empGender);
			}else if(gender.contains("female"))
			{
				empGender = Employees.Gender.female;
				d.setGender(empGender);
			}
			
			//set date of birth
			System.out.println("Date of birth in (YYYY MM DD) format");
			String res1 = input.nextLine();
			Date birthd = sdf.parse(res1);
			d.setDateBirth(birthd);
			
			//set id
			System.out.println("Please enter the ID");
			idnumbt = Integer.parseInt(input.nextLine());
			d.setID(idnumbt);
			
			//date hired
			System.out.println("Date hired in (YYYY MM DD) format");
			String res2 = input.nextLine();
			Date hired = sdf.parse(res2);
			d.setDateHired(hired);
			
			//set salary
			System.out.println("Please enter the salary");
			sals = Double.parseDouble(input.nextLine());
			d.setSalary(sals);
			
			//set role title
			System.out.println("What is the deveopers role title?");
			String title = input.nextLine();
			d.setRoleTitle(title);
			
			//set category
			System.out.println("Is the developer junior, mid or senior?");
			String cat = input.nextLine().toLowerCase();
			if(cat.contains("senior"))
			{
				empCategory = Developers.Category.senior;
				d.setSection(empCategory);
			}else if(cat.contains("junior"))
			{
				empCategory = Developers.Category.junior;
				d.setSection(empCategory);
			}else if(cat.contains("mid"))
			{
				empCategory = Developers.Category.mid;
				d.setSection(empCategory);
			}
			
			//add employee to array
			this.employees.add(d);
		
		}else if(type.contains("support"))
		{
			//set name
			customerSupport s = new customerSupport();
			System.out.println("Please enter name");
			name = input.nextLine().toLowerCase();
			s.setName(name);
			
			//set gender
			System.out.println("Please enter gender");
			String gender = input.nextLine().toLowerCase();
			if(gender.contains("male"))
			{
				empGender = Employees.Gender.male;
				s.setGender(empGender);
			}else if(gender.contains("female"))
			{
				empGender = Employees.Gender.female;
				s.setGender(empGender);
			}
			
			//set date of birth
			System.out.println("Date of birth in (YYYY MM DD) format");
			String res1 = input.nextLine();
			Date birthd = sdf.parse(res1);
			s.setDateBirth(birthd);
			
			//set id
			System.out.println("Please enter the ID");
			idnumbt = Integer.parseInt(input.nextLine());
			s.setID(idnumbt);
			
			//date hired
			System.out.println("Date hired in (YYYY MM DD) format");
			String res2 = input.nextLine();
			Date hired = sdf.parse(res2);
			s.setDateHired(hired);
			
			//set salary
			System.out.println("Please enter the wage");
			sals = Double.parseDouble(input.nextLine());
			s.setSalary(sals);
			
			//set hours worked
			System.out.println("How many hours do they work?");
			int hrwork = Integer.parseInt(input.nextLine());
			s.setNumHours(hrwork);
			
		this.employees.add(s);		
	}
	}

	//remove employee
	public void removeEmployee(int ID)
	{
		for(int i = 0; i<this.employees.size(); i++)
		{
			if(this.employees.get(i).getID() == ID)
			{
				this.employees.remove(i); 
			}
		} 
	}
	
	//list employee
	public void listEmployees()
	{
		for(int j = 0; j<this.employees.size(); j++)
		{
			System.out.println(this.employees.get(j) + "\n");
		}
	}
	
	//show employee
	public void showEmployee(int ID)
	{
		for(int k = 0; k<this.employees.size(); k++)
		{
			if(this.employees.get(k).getID() == ID) //how to compare id 
			{
				System.out.println(this.employees.get(k));
			}
		}
	}
	
	//payroll calculation 
	public void payroll()
	{
		double total = 0;
		double amount = 0;
		
		for(int l = 0; l<employees.size(); l++) 
		{
			// - from balance & reset support hrs & reset spent amount
			amount = employees.get(l).getSalary();
			total = total + amount;
			balance = balance - total;
			employees.get(l).reset();	
		}
		System.out.println("the total amount owed to employees is: " + total + " and the company balance is: " + balance);
	} 
	
	//pay raise
	public void promotion(int ID) 
	{
		for(int i = 0; i<employees.size(); i++)
		{
			if(employees.get(i).getID() == ID) 
			{
				employees.get(i).payRaise();
			}	
		}
	}
	
}//class end
