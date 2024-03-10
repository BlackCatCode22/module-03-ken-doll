package myanimals;

public class Animal {
    static int numOfAnimals = 0;

    public Animal() {
        numOfAnimals++;
        System.out.println("Number of animals: " + numOfAnimals);
    }
}
