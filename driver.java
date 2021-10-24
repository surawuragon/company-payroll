import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;


public class driver {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("employeeDetails.txt");
		Scanner scan = new Scanner(fr);
		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
		Employees.Gender empGender;
		Developers.Category empCategory;
		Company c = new Company();
		c.setBalance(5000000);
		
	
	
		
		while(scan.hasNextLine())
		{
			String employee = scan.nextLine();
			String[] split = employee.split(" ");
			
			if(split[0].equals("Manager"))
			{
				Managers manager = new Managers();
					
				//name
				manager.setName(split[1]);
					
				//gender
				if(split[2].equals("male"))
				{
					empGender = Employees.Gender.male;
					manager.setGender(empGender);
				}else
				{
					empGender = Employees.Gender.female;
					manager.setGender(empGender);
				}
					
				//date of birth
				String year = split[3];
				String month = split[4];
				String day = split[5];
				String combine = year +  " " + month + " " + day; 
				Date dBirth = sdf.parse(combine);
				manager.setDateBirth(dBirth);
					
				// id
				int id = Integer.parseInt(split[6]);
				manager.setID(id);
					
				//date hired
				String year1 = split[7];
				String month1 = split[8];
				String day1 = split[9];
				String combine1 = year1 + " " + month1 + " " + day1; 
				Date dHired = sdf.parse(combine1);
				manager.setDateHired(dHired);
					
				//salary
				double sal = Double.parseDouble(split[10]);
				manager.setSalary(sal);
					
				//spent
				double sp = Double.parseDouble(split[11]);
				manager.setSpent(sp);
					
				//budget
				double bud = Double.parseDouble(split[12]);
				manager.setBudget(bud);
					
				//add to employee array	
				c.employees.add(manager);
					
			}else if(split[0].equals("Developer"))
			{
				Developers developer = new Developers();
				
				//name
				developer.setName(split[1]);
					
				//gender
				if(split[2].equals("male"))
				{
					empGender = Employees.Gender.male;
					developer.setGender(empGender);
				}else
				{
					empGender = Employees.Gender.female;
					developer.setGender(empGender);
				}
					
				//date of birth
				String year = split[3];
				String month = split[4];
				String day = split[5];
				String combine = year +  " " + month + " " + day; 
				Date dBirth = sdf.parse(combine);
				developer.setDateBirth(dBirth);
					
				// id
				int id = Integer.parseInt(split[6]);
				developer.setID(id);
					
				//date hired
				String year1 = split[7];
				String month1 = split[8];
				String day1 = split[9];
				String combine1 = year1 + " " + month1 + " " + day1; 
				Date dHired = sdf.parse(combine1);
				developer.setDateHired(dHired);
				
				//salary
				double sal = Double.parseDouble(split[10]);
				developer.setSalary(sal);
				
				//category
				if(split[11].equals("senior"))
				{
					empCategory = Developers.Category.senior;
					developer.setSection(empCategory);
				}else if(split[11].equals("junior"))
				{
					empCategory = Developers.Category.junior;
					developer.setSection(empCategory);
				}else if(split[11].equals("mid-level"))
				{
					empCategory = Developers.Category.mid;
					developer.setSection(empCategory);
				}
				
				//role title
				developer.setRoleTitle(split[12]);	
				
				//add to employee array
				c.employees.add(developer);
				
			}else if(split[0].equals("Support"))
			{
				customerSupport cs = new customerSupport();
				
				//name
				cs.setName(split[1]);
					
				//gender
				if(split[2].equals("male"))
				{
					empGender = Employees.Gender.male;
					cs.setGender(empGender);
				}else
				{
					empGender = Employees.Gender.female;
					cs.setGender(empGender);
				}
					
				//date of birth
				String year = split[3];
				String month = split[4];
				String day = split[5];
				String combine = year +  " " + month + " " + day; 
				Date dBirth = sdf.parse(combine);
				cs.setDateBirth(dBirth);
					
				// id
				int id = Integer.parseInt(split[6]);
				cs.setID(id);
					
				//date hired
				String year1 = split[7];
				String month1 = split[8];
				String day1 = split[9];
				String combine1 = year1 + " " + month1 + " " + day1; 
				Date dHired = sdf.parse(combine1);
				cs.setDateHired(dHired);
				
				//wage
				double wage = Double.parseDouble(split[10]);
				cs.setSalary(wage);
				
				//hours
				int hrs = Integer.parseInt(split[11]);
				cs.setNumHours(hrs);
				
				//add to employee array
				c.employees.add(cs);
			}//else if end
			
		}//while loop end
		fr.close();
		
		//user interface
		String number ="";
		String type= "";
		String name = "";
		boolean state = true;
		int idnumbt = 0 ;
		double sals = 0;
		
		while(state && !(number.equalsIgnoreCase("quit")))
		{
		
			System.out.println("Please choose form the number options below and when you are done write 'QUIT'");
			System.out.println("1)Add employee \n2)Remove Employee \n3)List employees \n4)Show employee \n5)Payraise \n6)Payroll");
			
			number = input.nextLine().toLowerCase();
			
			if(number.equals("1") || number.contains("add"))
			{
				System.out.println("Is your new employee a manager, developer or support?");
				type = input.nextLine().toLowerCase();
				
				c.addEmployee(type);
			
			}else if(number.equals("2"))
			{
				String sid = "";
				
					System.out.println("Please enter the ID of the employee you want to remove");
					sid = input.nextLine().toLowerCase();
					int id = Integer.parseInt(sid);
					c.removeEmployee(id);
				
					
			}else if(number.equals("3"))
			{
				c.listEmployees();
				
			}else if (number.equals("4"))
			{
				System.out.println("Please enter the employee ID");
				int id2 = Integer.parseInt(input.nextLine());
				c.showEmployee(id2);
			}else if(number.equals("5"))
			{
				System.out.println("Please enter the employee ID");
				int id3 = Integer.parseInt(input.nextLine());
				c.promotion(id3);
			}else if(number.equals("6"))
			{
				c.payroll();
			}
		
		}
		
		FileWriter fw = new FileWriter("employeeDetails.txt");
		
		for(int i = 0; i<c.employees.size(); i++)
		{
			String es = c.employees.get(i).toString();
			fw.write(es + "\n");
		}
		fw.close();  
		
		
		
		
		
	}
	


}
