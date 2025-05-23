package exam_revision;

// D.1.1 - Outline the nature of an object
// Grouping of DATA (variables) with BEHAVIOUR (methods)
public class Car {

    // Data | State (member variables/attributes/properties)
    // Describe what the car is made up of
    int mileage;

    boolean isSecondHand;

    // Behaviour (methods)
    // Describe what the car can do
    public void drive(int miles) {
        // code to drive...
        mileage = mileage + miles;
    }

}