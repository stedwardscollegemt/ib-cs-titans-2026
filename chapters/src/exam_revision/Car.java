package exam_revision;

// D.1.1 - Outline the nature of an object
// D.3.1 Program Development, Define: class
// D.3.5 Program Development, Construct code related to object-oriented fundamentals
// Grouping of DATA (variables) with BEHAVIOUR (methods)

// Car is-a-type-of CarModel e.g., Car is-a Nissan Juke
// Car inherits from CarModel data like title and any behaviour
public class Car extends CarModel{

    // Data | State (member variables/attributes/properties)
    // Describe what the car is made up of
    
    // D.1.9 Explain the need for different data types to represent real world data items
    int mileage; // a number we can perform operations on (like line 18)

    boolean isSecondHand; // a Yes/No flag which requires little validation since it is so simple

    Engine engine;

    // Constructor - a form of instantiating classes
    public Car(Engine engine) {
        // this is a special keyword in Java to refer to a particular state
        // so here you are saying update the engine of THIS car and set it to
        // the instance of the engine that is being injected in the constructor
        this.engine = engine;

    }
    // Behaviour (methods)
    // Describe what the car can do
    // D.3.2 Method Signature - The header of a method containing the name, set of parameters, (return type)
    // e.x. drive(int miles)
    public void drive(int miles) {
        if (CarHealthDiagnosticService.checkCapacityValue(engine.capacity)) {
            engine.start();
            // code to drive...
            mileage = mileage + miles;
        }
    }
}