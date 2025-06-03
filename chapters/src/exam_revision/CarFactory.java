package exam_revision;

import exam_revision.CarEntity.Car;
import exam_revision.CarEntity.Engine;

// D.3.5 Program Development, Construct code related to object-oriented fundamentals
public class CarFactory {
    
    public static void main(String[] args) {

        // D.3.1 Program Development, Define: instance
        // Instances take up memory and have a state, i.e., attributes are filled with values,
        // and the state can be changed by invoking the behaviour, i.e., calling the methods

        // Creating an *instance* of Car which *has an* Engine
        Engine engineA = new Engine();
        // D.1.10 Describe how data items can be passed to and from actions as parameters.
        // I am passing in an instance of an engine to create a new car
        Car carA = new Car(engineA); // constructor is a special method that instantiates a class with a state
        
        //carA.mileage = 50; // D.3.2 this is not possible anymore because of private
        
        carA.setIsSecondHand(false); // D.3.3 we are writing/changing the state of the property
                                                       // through mutator methods, it is safer this way.
        carA.drive(10);

        // carA.setTitle(null); // this is not possible either because of protected
    }
}
