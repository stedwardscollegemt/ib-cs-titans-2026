package exam_revision;

/**
 * D.1.6 - Relationships 
 * Car, is-of-type CarModel, which has-a Engine, uses CarHealthDiagnosticService
 */
public class CarHealthDiagnosticService {

    public static boolean checkCapacityValue(int capacity) {
        if (capacity > 0.546) {
            return true;
        }
        return false;
    }
    
}
