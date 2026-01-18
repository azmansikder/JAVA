public class Dog
{
    // Instance Variables
    String breed;
    int age;
    String color;
 
// Default Constructor Declaration with no param
public Dog()
    {
        breed = “NA”;
        age = 0;
        color = “white”;
    }
    // Constructor Declaration of Class
    public Dog(String breed, int age, String color)
    {
        this.breed = breed;
        this.age = age;

        this.color = color;
    }
public static void main(String[] args)
    {
Dog obj = new Dog();
        Dog obj2 = new Dog(&quot;papillon&quot;, 5, &quot;white&quot;);
        
    }
}
