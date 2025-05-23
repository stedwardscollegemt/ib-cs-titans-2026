package exam_revision;

// D.3.5 Program Development, Construct code related to object-oriented fundamentals
public class CarFactory {
    
    public static void main(String[] args) {

        // D.3.1 Program Development, Define: instance
        // Instances take up memory and have a state, i.e., attributes are filled with values,
        // and the state can be changed by invoking the behaviour, i.e., calling the methods

        // Creating an *instance* of Car
        Car carA = new Car();
        carA.mileage = 50;
        carA.isSecondHand = false;
        carA.drive(10);
    }
}
