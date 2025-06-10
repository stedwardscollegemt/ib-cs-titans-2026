package exam_revision.CarEntity;

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
    private int mileage; // a number we can perform operations on (like line 18)

    // D.3.3 Private modifier hides this feature from other classes
    //       Only this particular class has visibility to this feature
    private boolean isSecondHand; // a Yes/No flag which requires little validation since it is so simple

    private Engine engine; // private is a modifier to HIDE information

    private String uniqueBodyColor; // we are a unique car shop with unique colors

    // Constructor - a form of instantiating classes
    public Car(Engine engine) { // engineInput, engineInjected
        // this is a special keyword in Java to refer to a particular state
        // so here you are saying update the engine of THIS car and set it to
        // the instance of the engine that is being injected in the constructor
        // in Lenka's words, this is THE INSTANCE that is being created through the
        // constructor
        this.engine = engine;
        this.setTitle(uniqueBodyColor);
    }

    // Give write access in a controlled way so that our class is STABLE, SAFE and SECURE to use.
    // D.3.2 Mutator methods - these are methods that give special write access to hidden properties
    //                         enabling instances to change their state.
    public void setBodyColor(String bodyColorInput) {
        // error handling in the future
        this.uniqueBodyColor = bodyColorInput;
    }

    // Give read access
    public String getBodyColor() {
        return this.uniqueBodyColor;
    }

    public void setIsSecondHand(boolean isSecondHandInput) {
        this.isSecondHand = isSecondHandInput;
    }


    // Behaviour (methods)
    // Describe what the car can do
    // D.3.2 Method Signature - The header of a method containing the name, set of parameters, (return type)
    // e.x. drive(int miles)
    // D.1.10 Describe how data items can be passed to and from actions as parameters.
    // Here I am passing in miles, because when I drive, the mileage gets updated
    public void drive(int miles) {
        // D.3.6 Constructing code using selection statements (if-statements, while)
        if (CarHealthDiagnosticService.checkCapacityValue(engine.capacity)) {
            engine.start();
            // code to drive...
            mileage = mileage + miles;
        }
    }
}