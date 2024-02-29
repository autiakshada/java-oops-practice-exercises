/*Create an interface named `Shape` consisting of two abstract methods named
`calculateArea()` and `calculatePerimeter()`.

1. Create a class named `Rectangle` which implements the `Shape` interface.
2. Create a class named `Circle` which implements the `Shape` interface.
3. Create an object of the `Rectangle` class and assign it to a reference variable of the `Shape` interface.
4. Create an object of the `Circle` class and assign it to a reference variable of the `Shape` interface.

The overridden methods should calculate and print the following output:

For the `Rectangle` class:
- `calculateArea()` should calculate the area of the rectangle.
- `calculatePerimeter()` should calculate the perimeter of the rectangle.

For the `Circle` class:
- `calculateArea()` should calculate the area of the circle.
- `calculatePerimeter()` should calculate the circumference of the circle.

Implement the classes and interface with appropriate method implementations.
*/
interface shape
{
	void calculateArea();
	void calculatePerimeter();

}
class Rectangles implements shape 
{
	public void calculateArea()
	{
		System.out.println("Calculate Area of rectangle: ");
	}
	public  void calculatePerimeter()
	{
		System.out.println("Calculate perimeter of rectangle ");
	}

}
class Circle implements shape
{
	public void calculateArea()
	{
		System.out.println("Calculate Area of circle: ");
	}
	public  void calculatePerimeter()
	{
		System.out.println("Calculate circumference of circle: ");
	}
}

class main
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		shape rect= new Rectangles();
		rect.calculateArea();
		rect.calculatePerimeter();
		System.out.println("===============");
		shape ref=new Circle();
		ref.calculateArea();
		ref.calculatePerimeter();
	}
}
