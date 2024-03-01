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
9]Ensure that you can create instances of both Vehicle, Car, and Truck classes and 
set their attributes appropriately using constructors and methods.
10]Write a test program (a Main class) to demonstrate the functionality of all classes. 
Create instances of Vehicle, Car, and Truck, set their attributes, and display them.
11]Ensure that your implementation covers the hierarchical relationships between Vehicle,
Car, and Truck, and also demonstrates proper encapsulation and inheritance principles.
*/

class Vehicle
{
	private String make;
	private String model;
	private int year;
	private double rentalPricePerDay;
	//constructor
	Vehicle(String make,String model,int year,double rentalPricePerDay)
	{
		this.make=make;
		this.model=model;
		this.year=year;
		this.rentalPricePerDay=rentalPricePerDay;
	}
	//getter method to get the private data
	public String getMake()
	{
		return make;
	}
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
	public void setMake(String make)
	{
		this.make=make;
	}
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
	Car(String make,String model,int year,double rentalPricePerDay,int numSeats)
	{
		super(make,model,year,rentalPricePerDay);
		this.numSeats=numSeats;
	}
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
class Truck extends Vehicle
{
	private double cargoCapacity;
	//constructor
	Truck(String make,String model,int year,double rentalPricePerDay,double cargoCapacity)
	{
		super(make,model,year,rentalPricePerDay);
		this.cargoCapacity=cargoCapacity;
	}
	public double getCargoCapacity()
	{
		return cargoCapacity;
	}
}
class Vehicles
{
	public static void main(String[] args) 
	{
		//create the object for each class
		Vehicle vehicle=new Vehicle("Toyota", "Corolla", 2020, 50.0);
		Car car=new Car("Honda", "Civic", 2019, 60.0, 5);
		Truck truck=new Truck("Ford", "F-150", 2018, 80.0, 1500.0);
		//display Vehicle information
		System.out.println("Vehicle Information:");
		System.out.println("Make: " + vehicle.getMake());
        System.out.println("Model: " + vehicle.getModel());
        System.out.println("Year: " + vehicle.getYear());
        System.out.println("Rental Price Per Day: " + vehicle.getRentalPricePerDay());

        // Displaying car information
        System.out.println("\nCar Information:");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Rental Price Per Day: " + car.getRentalPricePerDay());
        System.out.println("Number of Seats: " + car.getNumSeats());

        // Displaying truck information
        System.out.println("\nTruck Information:");
        System.out.println("Make: " + truck.getMake());
        System.out.println("Model: " + truck.getModel());
        System.out.println("Year: " + truck.getYear());
        System.out.println("Rental Price Per Day: " + truck.getRentalPricePerDay());
        System.out.println("Cargo Capacity: " + truck.getCargoCapacity());
    }
}
