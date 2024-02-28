/*Q: Programming Task: Soccer Player Information
Problem:
You are tasked with writing a Java program to manage and display Information about 
soccer players using method overriding. You'll create classes to represent players
and specifically, soccer players, and use method overriding to display their information.
Instructions:
	Write a Java program that consists of three classes: Player, SoccerPlayer, and 
	SoccerGame.
	1. The Player class should have the following attributes and methods:
	Attributes:
		name (String)	
		position (String)
	Methods:
		getinfo() that displays the player's name and position.
	2. The SoccerPlayer class should extend the Player class and override the getinfo() method to display the player's information in a soccer- specific format.
	3. The SoccerGame class should have the main method to take user input for a player's name and position, create a SoccerPlayer object and initialize data during object creation, and display the player's information using method overriding.
Your program should follow these specifications:
	The Player and SoccerPlayer classes should be appropriately defined with attributes
	and methods as specified above. The SoccerPlayer class should override the getInfo()
	method to display soccer player-specific information.
	The SoccerGame class should take user input for the player's name and position and 
	display the player's information using method overriding.
Sample Input -
		John Doe
		Forward
Output:
		Soccer Player's Information:
		Name: John Doe
		Position: Forward
*/
import java.util.Scanner;
class Players
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String pname=sc.nextLine();
		String positon=sc.nextLine();
		SoccerPlayer ref= new SoccerPlayer(pname,positon);
		ref.getInfo();
	}
}
class Player
{
	String name;
	String position;
	public void getInfo()
	{
		System.out.println("Soccer Player's Information: ");
		System.out.println("Name: "+name);
		System.out.println("Position: "+position);
	}
}
class SoccerPlayer extends Player
{
	SoccerPlayer(String name,String position)
	{
		this.name=name;
		this.position=position;
	}
	//Override method
	@Override
	public void getInfo()
	{
		System.out.println("Soccer Player's Information: ");
		System.out.println("Name: "+name);
		System.out.println("Position: "+position);
	}
}
