/*Q: Programming Question: Simulating Student Classes
Objective:
		Create a program that simulates different student classes, allowing users to input
		detalls for Science and Arts students. Utilize abstract classes and concrete
		implementations to demonstrate Interaction with these students through abstraction.
Task:
	Write a Java program that includes an abstract class Student and concrete classes 
	ScienceStudent and ArtsStudent. The abstract class Student includes methods for 
	attending class and studying, which are implemented differently in the concrete 
	classes.
Requirements:
	1. The Student class should be abstract, containing:
		A constructor to initialize the name and age of the student.
Abstract methods:
	attendClass() to denote the student attending a specific class.
	study() to represent the student's studying routine.
Concrete methods:
	introduce() to print Hello, my name is + name + "and I am" + age + "years old.
	2. The concrete class ScienceStudent should extend the Student class and implement 
	the abstract methods:
	attendClass() for attending a Science class.
	study() for studying Science subjects.
3. The concrete class ArtsStudent should also extend the Student class and Implement 
	the abstract methods:
	attendClass() for attending an Arts class. study() for studying Arts subjects.
4. In the Main class:
	Prompt the user to input details for a Science student (name and age). 
	Create an instance of the ScienceStudent using the provided input. Prompt the user 
	to input details for an Arts student (name and age). Create an instance of the 
	ArtsStudent using the provided input.
	Display the introduction and activities (attending class and studying) for both 
	students.
Sample Input -
		Alex
		19
		Emma
		21
Sample Output -
		Hello, my name is Alex and I am 19 years old.
		Attending Science class
		Studying Science subjects
		Hello, my name is Emma and I am 21 years old.
		Attending Arts class
		Studying Arts subjects
*/
import java.util.Scanner;
class Students 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String sciName=sc.next();
		int sciAge=sc.nextInt();
		Student ref1=new ScienceStudent(sciName,sciAge);
		String artName=sc.next();
		int artAge=sc.nextInt();
	    Student ref2=new ArtsStudent(artName,artAge);
		ref1.introduce();
		ref1.attendClass();
		ref1.study();

		ref2.introduce();
		ref2.attendClass();
		ref2.study();
	}
}
abstract class Student
{
	String name;
	int age;
	public Student(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	//abstract methods
	//abstract methods is prefix with the abstract keyword and ends with ;
	public abstract void attendClass();
	public abstract void study();

	//concrete method
	public void introduce()
	{
		System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
	}
}
class ScienceStudent extends Student
{
	public ScienceStudent(String name, int age)
	{
		super(name, age);
	}
	public void attendClass()
	{
		System.out.println("Attending a Science class.");
	}
	public void study()
	{
		System.out.println("Studying Science subjects.");
	}
}
class ArtsStudent extends Student
{
	public ArtsStudent(String name, int age)
	{
		super(name, age);
	}
	public void attendClass()
	{
		System.out.println("Attending a Arts class.");
	}
	public void study()
	{
		System.out.println("Studying Arts subjects.");
	}
}
