package exam_revision;

public class CarFactory {
    
    public static void main(String[] args) {
        // Creating an *instance* of Car
        // Instances take up memory and have a state, i.e., attributes are filled with values,
        // and the state can be changed by invoking the behaviour, i.e., calling the methods

        // Instance one
        Car carA = new Car();
        carA.mileage = 50;
        carA.isSecondHand = false;
        carA.drive(10);

    }
}
