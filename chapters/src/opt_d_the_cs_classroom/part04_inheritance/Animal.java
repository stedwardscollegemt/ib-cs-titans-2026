package opt_d_the_cs_classroom.part04_inheritance;

public class Animal {
    
    protected int legs;

    protected String sound;

    public Animal(int legs) {
        this.legs = legs;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getLegs() {
        return this.legs;
    }

    public void jump() {
        System.out.println("The animal jumps.");
    }

    public void makeSound() {
        System.out.println("The animal makes a sound " + sound + " !");
    }
}
