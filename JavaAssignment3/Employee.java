package java_assignment_3;

public class Employee {
	private double sal;
	private int workingHours;
	private String name;
	private int empId;
	
	public void getInfo(String name,int empID,int hours,double sal)
	{
		this.empId=empID;
		this.name=name;
		this.workingHours=hours;
		this.sal=sal;
	}
	
	public void addSalary()
	{
		if(sal<500)
		{
			sal+=100;
		}
	}
	
	public void addWork()
	{
		if(workingHours>6)
		{
			sal+=50;
		}
	}
	
	public void display()
	{
		System.out.println("\n****Employee Details****");
		System.out.println("Name : " + name);
		System.out.println("Emp id : "+empId);
		System.out.println("Working hours : "+workingHours);
		System.out.println("Salary : " + sal );
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.getInfo("Shivam Gosavi", 1, 7, 2500);
		emp.addSalary();
		emp.addWork();
		emp.display();
		
		Employee emp2= new Employee();
		emp2.getInfo("Manoj Kumar", 2, 4, 2900);
		emp2.addSalary();
		emp2.addWork();
		emp2.display();
		
		
		

	}

}
