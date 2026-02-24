/* Write a Java program that models a Car System using association. Create a class Engine that stores engine type and horsepower. Create a Car class that has car model and brand, and also contains an Engine object.
 Use constructors to initialize all variables and provide a method in the Car class to display car and engine information.
 Demonstrate the association in the main method. */


class Engine {
    private String engineType;
    private int horsePower;

    public Engine(String engineType, int horsePower) {
        this.engineType = engineType;
        this.horsePower = horsePower;
    }

    public String getEngineDetails() {
        return engineType + " (" + horsePower + " HP)";
    }
}

class Car {
    private String brand;
    private String model;
    private Engine engine;

    public Car(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public void displayInfo() {
        System.out.println("--- Car Information ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
 
        System.out.println("Engine: " + engine.getEngineDetails());
    }
}

public class Main {
    public static void main(String[] args) {

        Engine v8Engine = new Engine("V8 Turbo", 450);

        Car myCar = new Car("Ford", "Mustang", v8Engine);

        myCar.displayInfo();
        
        System.out.println("\n-----------------------\n");

        Car electricCar = new Car("Tesla", "Model S", new Engine("Electric Motor", 670));
        electricCar.displayInfo();
    }
}

