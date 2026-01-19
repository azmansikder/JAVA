/* Write a program to print the area and perimeter of a circle having radius of 5 units by
creating a class named 'Circle_by_parameter' with parameters in its constructor. Give another attribute
named “color” then print the value of color in the console. */

public class Circle_by_parameter{
  final double pi=3.14;
  String color;
  int radius;
  
  public Circle_by_parameter(int r)
  {
    color="Blue";
    this.radius=r;
  }
  
  void calculateArea()
  {
    double area=pi*radius*radius;
    System.out.println("The area is: "+area);
  }
  
  void calculatePerimeter()
  {
    double perimeter=2*pi*radius;
    System.out.println("The perimeter is: "+perimeter);
  }
  
  public static void main(String[] args)
  {
    Circle_by_parameter obj= new Circle_by_parameter(5);
    obj.calculateArea();
    obj.calculatePerimeter();
    System.out.println("Color of the object is: "+obj.color);
  }
}
