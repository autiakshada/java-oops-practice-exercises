/*Write Java code to Design the classes with the following specifications:
Animal class: Represents generic animal
Attributes: species,age
Methods :getter and setter for attributes, toString() method to display generic 
animal information.

Abstraction: To make the Animal class abstract.

Mammal class: Represents a mammal, inheriting from the Animal class
Additional attributes: furColor.
Methods: getter and setter for additional attributes,
override the toString() method to include mammal-specific information.
Input fromat-
first line represents species of mammal.
second line represents age of mammal.
Third Line represents fur color of mammal.

Sample Input-
Lion
5
Golden

Sample Output-
Mammal:Species:Lion,Age:5,Fur Color:Golden

*/

import java.util.Scanner;
// Animal class
abstract class Animal 
{
    private String species;
    private int age;

    // Constructor
    public Animal(String species, int age) 
	{
        this.species = species;
        this.age = age;
    }

    // Getter and setter method to get or to modify the private data
    public String getSpecies()
	{
        return species;
    }

    public void setSpecies(String species) 
	{
        this.species = species;
    }

    public int getAge() 
	{
        return age;
    }

    public void setAge(int age) 
	{
        this.age = age;
    }

    // Abstract method
    public abstract String toString();
}

// Mammal class inheriting from Animal
class Mammal extends Animal 
{
    private String furColor;
	// Constructor
    public Mammal(String species, int age, String furColor) 
	{
        super(species, age);
        this.furColor = furColor;
    }
	// getter methid to get the private data
    public String getFurColor() 
	{
        return furColor;
    }

    public void setFurColor(String furColor) 
	{
        this.furColor = furColor;
    }
	//Non-Static inbuilt Object class method 
    @Override
    public String toString()
	{
        return "Mammal:Species:" + getSpecies() + ",Age:" + getAge() + ",Fur Color:" + furColor;
    }
}
class Mammals
{
    public static void main(String[] args)
	{
        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter species of mammal:");
        String species = sc.nextLine();

        System.out.println("Enter age of mammal:");
        int age = sc.nextInt();

        System.out.println("Enter fur color of mammal:");
        String furColor = sc.next();
		//Create object
        Mammal mammal = new Mammal(species, age, furColor);
        System.out.println(mammal.toString());
	}
}