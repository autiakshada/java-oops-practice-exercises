/*Problem:
You are tasked with designing a simple Online Shopping System in Java. The system 
should allow users to browse products, add items to their shopping cart, view their 
cart, and place orders.
Instructions:
Write a Java program that consists of several classes: Product, ShoppingCart, Customer,
and OrderSystem.
The Product class should represent individual products with the following attributes and methods:
Attributes:
>id (int)
>name (String)
>price (double)
Methods:
displayDetails() to display the product's details including id, name, and price.
The ShoppingCart class should allow users to add products, remove products, and view 
the items in their cart. It should include the following methods:
Methods:
addItem(Product product) to add a product to the cart.
removeItem(Product product) to remove a product from the cart.
viewCart() to display the items in the cart.
The Customer class should represent users of the online shopping system. It should have
a name attribute and a ShoppingCart attribute.
The OrderSystem class should have the main method to interact with users. It should 
allow users to perform the following operations:
Browse products and add them to their shopping cart.
Remove items from their shopping cart.
View their shopping cart.
Place an order.
Your program should follow these specifications:
>>>The Product class should be appropriately defined with attributes and methods as 
specified above.
>>>The ShoppingCart class should have methods to add items, remove items, and view the
cart contents.
>>>The Customer class should have a name attribute and a ShoppingCart attribute.
>>>The OrderSystem class should take user input for browsing products, adding/removing
items from the cart, and placing orders.
=====================
Sample Input:
1. Add Product to Cart
Product ID: 101
Product Name: Laptop
Price: 999.99
2. Remove Product from Cart
Product ID: 101
3. View Cart
4. Place Order
======================
Sample Output:
1. Product Added to Cart Successfully.
2. Product Removed from Cart Successfully.
3. Your Shopping Cart:
   - Product ID: 101, Name: Laptop, Price: $999.99
4. Order Placed Successfully. Thank you for shopping with us!
*/

class Customers
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
