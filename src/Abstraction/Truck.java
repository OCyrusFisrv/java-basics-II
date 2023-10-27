package Abstraction;

public class Truck extends Vehicle {

    @Override
    String drive() {
        throw new UnsupportedOperationException("'drive slow'");
    }

    @Override
    String brake() {
        throw new UnsupportedOperationException("'brake long'");
    }
    
}
