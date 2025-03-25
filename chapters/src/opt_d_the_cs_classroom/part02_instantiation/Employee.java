package opt_d_the_cs_classroom.part02_instantiation;

public class Employee {
    
    // Member variables
    private String name;
    private int employeeId;
    private double salary;
    protected String[] complaints;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.complaints = new String[10];
        System.out.println("New Employee instance was created!");
    }

    // Mutator methods (methods to update member variables, i.e., write access)
    public void setSalary(double salary) {
        // TODO: Complete the mutator method to update the salary if it is greater than 0
    }

    // Accessor methods (methods to retreive member variable values, i.e., read access)
    public String getName() {
        return this.name;
    }

    // TODO: Write code for accessor methods to read: employeeId, salary, complaints.

    // TODO: Construct code for this method that adds a new complaint in the array.
    //       You cannot overwrite existing comments.
    public void addComplaint(String complaint) {
        
    }
}
