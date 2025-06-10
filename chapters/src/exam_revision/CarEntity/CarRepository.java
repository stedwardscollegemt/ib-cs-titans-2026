package exam_revision.CarEntity;

// A class that is responsible for maintaining an array of cars
// D.3.8 Program Development, Construct code related to arrays
public class CarRepository {

    // --- DATA ---------------------------
    private Car[] cars = new Car[100]; // if we have 100 cars, we also have 100 UNIQUE colors
    private int lastIndex; // by default it is 0


    // D.3.6 Program Development, Construct code related to selection statements
    // D.3.8 Program Development, Construct code related to arrays
    public void addCar(Car car) throws Exception {
        // store the car inputted in the cars array
        if (lastIndex <= 99) {
            cars[lastIndex] = car;
            lastIndex = lastIndex + 1;
        } else {
            throw new Exception("The car array is full.");
        }
    }

    public void removeCar(Car car) {

    }

    public Car[] getAll() {
        return cars;
    }

    // Linear search recipe
    // 1. We are outputting an INDEX (index >= 0 <= lastIndexOccupied)
    // 2. Lookup pointer to move through my array
    // 3. Found flag to track whether my search is over
    // 4. Input target to know what I am searching for
    // 5. While lookup <= lastIndex and !found
    // 6. Test that target input equals what I am looking at
    public int findCarByColor(String color) {
        int index = -1;
        int lookup = 0; // immediately point to the first slot
        boolean found = false;
        while((lookup <= lastIndex) && !found) {
            // get the car and check its color
            Car currentlyLookAt = cars[lookup];
            if (color.equals(currentlyLookAt.getBodyColor())) {
                found = true;
                index = lookup;
            } else {
                lookup = lookup + 1;
            }
        }
        return index;
    }
}
