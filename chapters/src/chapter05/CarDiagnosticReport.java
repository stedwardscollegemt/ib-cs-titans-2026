package chapter05;

import helpers.Keyboard;

public class CarDiagnosticReport {

    static String make;
    static String model;
    static int year;

    public static void main(String[] args) {

        System.out.println("*** Car Diagnostic Report ***");

        // TODO: Construct code that creates a diagnostic report for a car.
        //       Use the methods constructed for you.
    }

    private static void displayReportSummary(double batteryHealth, double averageTirePressure) {
        // print a summary report
        System.out.println("\n--- Summary ---");
        System.out.printf("Car: %s %s (%s)%n", make, model, year);
        System.out.printf("Battery Health: %.2f%%%n", batteryHealth);
        System.out.printf("Average Tire Pressure: %.2f PSI%n", averageTirePressure);
        System.out.println("--------------------");
    }
    
    public static double checkBatteryHealth() {
        // Simulate a battery health check
        System.out.println("Performing battery health check...");
        double health = Math.random() * 100; // Random percentage for simplicity
        System.out.printf("Battery health is %.2f%%%n", health);
        return health;
    }

    public static double checkTirePressure() {
        // Simulate a tire pressure check
        System.out.println("Checking tire pressure...");
        double pressure = 30 + Math.random() * 10; // Random pressure between 30 and 40 PSI
        System.out.printf("Average tire pressure is %.2f PSI%n", pressure);
        return pressure;
    }

    public static void collectCarDetails() {
        System.out.println("Enter make:");
        make = Keyboard.readString();
        System.out.println("Enter model:");
        make = Keyboard.readString();
        System.out.println("Enter year:");
        year = Keyboard.readInt();
    }
}
