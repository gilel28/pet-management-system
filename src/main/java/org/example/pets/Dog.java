package org.example;
/**
 * Dog class extending Pet.
 * Demonstrates Inheritance and Method Overriding.
 */
public class Dog extends Pet  {
   private String breed;

    public Dog(String name, int age, String species, String breed) {
        super(name, age, species);
        this.breed = breed;
    }

    public Dog(String name, int age, String breed) {
        this(name, age, "Dog",breed);

    }


    @Override
    public String makeSound() {
        return "Dogs bark";
    }

    @Override
    public String eat() {
        return "Dogs eat dog food";
    }
}

