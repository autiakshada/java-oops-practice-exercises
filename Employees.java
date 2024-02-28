/*Consider a scenario where you are asked to model a system for managing employees 
in an organization. Implement the following:
Create a class named Employee with the following private attributes:
>id (int)
>name (String)
>salary (double)
-Provide appropriate getter and setter methods to access and modify these attributes.
-Create a subclass named Manager which inherits from the Employee class. 
-The Manager class should have an additional private attribute:
>department (String)
Provide a getter and setter method for the department attribute.
Ensure that you can create instances of both Employee and Manager classes and set their
attributes appropriately using constructors and methods.
Write a test program (a Main class) to demonstrate the functionality of both classes. 
Create instances of Employee and Manager, set their attributes, and display them.
*/
class Employees
{
	public static void main(String[] args) 
	{
		Employee emp=new Employee(0001,"jACK",1220000);
		emp.display();
		System.out.println("==========================");
		Manager man =new Manager(0002,"King",1230094,"IT");
		man.display();

	}
}
class Employee
{
	private int id;
	private String name;
	private double salary;
	//constructor
	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	//getter to get the private data
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	//setter to set or modify the private data  
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("Employee Details: ");
		System.out.println("Employee ID: "+id);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary: $ "+salary);
	}

}
class Manager extends Employee
{
	private String department;
	Manager(int id,String name,double salary,String department)
	{
		super(id,name,salary);
		this.department=department;
	}
	public String getDepartment()
	{
		return department;
	}
	public void setDepartment()
	{
		this.department=department;
	}
	@Override
	public void display()
	{
		super.display();
		System.out.println("Manager Department: "+department);
	}


}
