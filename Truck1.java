/*Consider a scenario where you are tasked with developing a system for managing 
vehicles in a car rental company. Implement the following:
1]Create a class named Vehicle with the following private attributes:
>make (String)
>model (String)
>year (int)
>rentalPricePerDay (double)
2]Provide appropriate getter and setter methods to access and modify these attributes.
3]Create a subclass named Car which inherits from the Vehicle class.
4]The Car class should have an additional private attribute:
>>numSeats (int)
5]Provide a getter and setter method for the numSeats attribute.
6]Create a subclass named Truck which also inherits from the Vehicle class.
7]The Truck class should have an additional private attribute:
>>cargoCapacity (double)
8]Provide a getter and setter method for the cargoCapacity attribute.
Ensure that you can create instances of both Vehicle, Car, and Truck classes and 
9]set their attributes appropriately using constructors and methods.
10]Write a test program (a Main class) to demonstrate the functionality of all classes. 
Create instances of Vehicle, Car, and Truck, set their attributes, and display them.
11]Ensure that your implementation covers the hierarchical relationships between Vehicle,
Car, and Truck, and also demonstrates proper encapsulation and inheritance principles.
*/

class Vehicle
{
	private String model;
	private int year;
	private double rentalPricePerDay;
	//getter method to get the private data
	public String getModel()
	{
		return model;
	}
	public int getYear()
	{
		return year;
	}
	public double getRentalPricePerDay()
	{
		return rentalPricePerDay;
	}
	//setter method to set/modify private data
	public void setModel(String model)
	{
		this.model=model;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public void setRentalPricePerDay(double rentalPricePerDay)
	{
		this.rentalPricePerDay=rentalPricePerDay;
	}
}
//sub class 
class Car extends Vehicle
{
	private int numSeats;
	//getter method to get the private data
	public int getNumSeats()
	{
		return numSeats;
	}
	public void setNumSeats(int NumSeats)
	{
		this.numSeats=numSeats;
	}
}
class Truck
{
	private double cargoCapacity;
	public double getCargoCapacity()
	{
		return cargoCapacity;
	}
}
class Truck1
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
