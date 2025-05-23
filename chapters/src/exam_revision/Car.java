package exam_revision;

// D.1.1 - Outline the nature of an object
// D.3.1 Program Development, Define: class
// D.3.5 Program Development, Construct code related to object-oriented fundamentals
// Grouping of DATA (variables) with BEHAVIOUR (methods)
public class Car {

    // Data | State (member variables/attributes/properties)
    // Describe what the car is made up of
    
    // D.1.9 Explain the need for different data types to represent real world data items
    int mileage; // a number we can perform operations on (like line 18)

    boolean isSecondHand; // a Yes/No flag which requires little validation since it is so simple

    // Behaviour (methods)
    // Describe what the car can do
    public void drive(int miles) {
        // code to drive...
        mileage = mileage + miles;
    }

}