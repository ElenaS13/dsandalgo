package Zoo;

public class Animal{

    int numLegs;
    boolean fur;
    String animalType;

    public Animal(int numLegs, boolean fur, String animalType) {
        this.numLegs = numLegs;
        this.fur = fur;
        this.animalType = animalType;
    }

    public void makeSound(){
        System.out.println("This is me, making sounds " + animalType );
    }
}
