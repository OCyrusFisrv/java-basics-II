package Abstraction;

public class Car extends Vehicle {

    @Override
    String drive() {
        throw new UnsupportedOperationException("'drive fast'");
    }

    @Override
    String brake() {
        throw new UnsupportedOperationException("'brake hard'");
    }
    
}
