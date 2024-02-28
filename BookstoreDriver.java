/*Instructions:Create a Java program for managing customer information and book orders in an online store. Implement two classes: Customer and BookOrder.
Customer Class:
				 Include fields for Customer Name (customerName) and Customer ID (customerID).
				 Create a parameterized constructor to initialize these fields during customer registration. Implement getter methods for both fields by making them private.
BookOrder class: Inherit from the Customer class.
				 Include an additional field for Order Amount (orderAmount).
				 Create a parameterized constructor to initialize all fields during the book order placement
				 Implement a getter method for the Order Amount by making it private.
BookstoreDriver Class:
				 In the main method, create Book Orders for a customer.
				 Ensure that all the order details, including Customer Name, Customer ID, and Order Amount, are initialized during the order placement. and print Book Order Details for Customer as per expected output.
Sample Input-
			Deepak Jha
			TYP00145
			452.35
Sample Output-
			Book Order Details for Customer:
			Customer Name: Deepak Jha
			Customer ID: TYP00145
			Order Amount: $452.35
*/
class Customer
{
	private String customerName;
	private String customerID;
	// constructor 
	Customer(String customerName, String customerID)
	{
		this.customerName=customerName;
		this.customerID=customerID;
	}
	//getter is used to get the private data
	public String getcustomerName()
	{
		return customerName;
	}
	public String getcustomerID()
	{
		return customerID;
	}
}
class BookOrder extends Customer 
{
	private double orderAmount;
	//getter to get the private data
	public double getorderAmount()
	{
		return orderAmount;
	}
	//constructor 
	BookOrder(String customerName, String customerID,double orderAmount)
	{
		super(customerName,customerID);
		this.orderAmount=orderAmount;
	}
}
//Driver class 
class BookstoreDriver 
{
	public static void main(String[] args) 
	{
		BookOrder ref= new BookOrder("Deepak Jha","TYP00145",452.35);
		System.out.println("Book Order Details for Customer: "); 
		System.out.println("Customer Name: "+ref.getcustomerName());
		System.out.println("Customer ID: "+ref.getcustomerID());
		System.out.println("Order Amount: $"+ref.getorderAmount());
	}
}
