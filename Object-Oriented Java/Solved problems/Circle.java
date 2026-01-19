/* Write a program to print the area and perimeter of a circle having radius of 5 units by
creating a class named 'Circle' without any parameter in its constructor. Give another
attribute named “color” then print the value of color in the console. */

public class Circle{
  final double pi=3.14;
  String color;
  int radius;
  
  public Circle()
  {
    radius=5;
    color="Blue";
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
    Circle obj= new Circle();
    obj.calculateArea();
    obj.calculatePerimeter();
  }
}
