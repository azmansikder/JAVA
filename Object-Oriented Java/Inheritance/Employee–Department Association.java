/*Design a Java program for a Company System where an Employee class stores employee id, name, and salary. A Department class should store department name and include an Employee object as a data member.
 Implement association between Department and Employee.
 Initialize all data using constructors and display full department and employee details in the main method.
*/


class Employee{
    private int id;
    private String name;
    private double salary;
    
    public Employee(int id, String name, double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    
    public void show() {
        System.out.println(id + " " + name + " " + salary);
    }
}

class Department{
    private String dept_name;
    private Employee emp;
    
    public Department(String dept_name, Employee emp)
    {
        this.dept_name=dept_name;
        this.emp=emp;
    }
    void show() {
        System.out.println("Department: " + dept_name);
        emp.show();
    }
    
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Azman", 50000);
        Department d = new Department("CSE", e);
        d.show();
    }
}



