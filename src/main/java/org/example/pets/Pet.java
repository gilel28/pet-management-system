package org.example.pets;
/**
 * Abstract class representing a general Pet.
 * Demonstrates Abstraction and Encapsulation.
 */
public abstract class Pet {
    private final String name;
    private final int age;
    protected final String species;

    public Pet(String name, int age, String species) {
        this.name = name;
        if (age<=0){
            throw new IllegalArgumentException("The age of " +name + " the " + species + " must be positive");
        }
        this.age = age;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public abstract String makeSound();

    public abstract String eat();

}
