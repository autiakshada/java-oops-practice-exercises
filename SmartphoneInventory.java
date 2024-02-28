/*You are tasked with designing a system to manage a store's inventory of Smartphones.
Implement a Java program that includes the following:
The Smartphone class with private attributes for brand, model, and price, 
along with appropriate constructor, getter, and setter methods.
The Smartphone Inventory class that manages a collection of smartphones, 
display the details of all smartphones in the inventory.
In the Smartphoneinventory class:
			Create an instance of Smartphone.
			Add at least two different smartphones to the inventory.
			Display the Initial inventory details.
			Change the details of the smartphones.
			Display the updated inventory details.
			Make sure to demonstrate the proper encapsulation and use of getter and setter methods.
Sample input: 
			samsung 
			Galaxy S21
			999.09
			=======
			Google
			Pixel 6
			899.99
Sample Output :
			Initial Smartphone Information:
			Brand: Samsung
			Model: Galaxy S21
			Price: $999.99
			===============================
			Updated Smartphone Information:
			Brand: Apple
			Model: iPhone 13.
			Price: $1099.99
			===============================
			Initial Smartphone Information:
			Brand: Google
			Model: Pixel 6
			Price: $899.99
			===============================
			Updated Smartphone information:
			Brand: Mi
			Model: Note 9 Pro
			Price: $399,99
*/
//super class
class Smartphone
{
	private String brand;
	private String model;
	private double price;
	//constructor
	Smartphone(String brand,String model,double price)
	{
		this.brand=brand;
		this.model=model;
		this.price=price;
	}

	//getter is used to get the private data
	public String getBrand()
	{
		return brand;
	}
	public String getModel()
	{
		return model;
	}
	public double getPrice()
	{
		return price;
	}
	//setter is used to set/modify the private data
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public void setModel(String model)
	{
		this.model=model;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
}
//subclass
class SmartphoneInventory
{
	public static void main(String[] args)
	{
		Smartphone ref= new Smartphone("Samsung","Galaxy S21",999.99);
		System.out.println("Initial Smartphone Information: ");
		System.out.println("Brand : "+ref.getBrand());
		System.out.println("Model : "+ref.getModel());
		System.out.println("Price : $"+ref.getPrice());
		System.out.println("===========================");

		ref.setBrand("Apple");
		ref.setModel("iPhone 13");
		ref.setPrice(1099.99);

		System.out.println("Updated Smartphone Information: ");
		System.out.println("Brand : "+ref.getBrand());
		System.out.println("Model : "+ref.getModel());
		System.out.println("Price : $"+ref.getPrice());
		System.out.println("===========================");


		Smartphone ref1= new Smartphone("Google","Pixel 6",899.99);
		System.out.println("Initial Smartphone Information: ");
		System.out.println("Brand : "+ref1.getBrand());
		System.out.println("Model : "+ref1.getModel());
		System.out.println("Price : $"+ref1.getPrice());
		System.out.println("===========================");

		ref1.setBrand("Mi");
		ref1.setModel("Note 9 Pro");
		ref1.setPrice(399.99);

		System.out.println("Updated Smartphone Information: ");
		System.out.println("Brand : "+ref1.getBrand());
		System.out.println("Model : "+ref1.getModel());
		System.out.println("Price : $"+ref1.getPrice());
		System.out.println("===========================");
	}
}
