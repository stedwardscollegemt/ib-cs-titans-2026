package exam_revision;

/**
 * D.1.6 - Relationships 
 * Car, is-of-type CarModel, which has-a Engine, uses CarHealthDiagnosticService
 */
public class CarHealthDiagnosticService {

    // D.1.10 Describe how data items can be passed to and from actions as parameters.
    // I am passing in the capacity so that it can be checked for safety
    public static boolean checkCapacityValue(float capacity) {
        if (capacity > 0.546) {
            return true;
        }
        return false;
    }
    
}
