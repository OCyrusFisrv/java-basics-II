package Encapsulation;

public class Employee extends Person {
    
    Employee(String firstName, String lastName, Byte age, Integer ssn) {
        super(firstName, lastName, age, ssn);
        
    }

    public String speak() {
        return "Employee name is: "+getFirstName()+" "+getLastName();
    }
}
