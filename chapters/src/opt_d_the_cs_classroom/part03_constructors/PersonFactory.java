package opt_d_the_cs_classroom.part03_constructors;

public class PersonFactory {
    
    public static void main(String[] args) {

        // Create a new Person object with name "Pablo Picasso" and age 24
        Person famousArtist = new Person("Pablo Picasso", 24); // This does not work because the constructor in Person is missing
    }
}
