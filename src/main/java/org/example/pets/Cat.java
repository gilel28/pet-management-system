package org.example.pets;

/**
 * Cat class extending Pet.
 * Demonstrates Inheritance and Method Overriding.
 */
public class Cat extends Pet {
    private final String color;

    /**
     * Overloaded constructor implemented specifically to meet exercise requirements.
     */
    public Cat(String name, int age,String species, String color) {
        super(name, age, species);
        this.color = color;

    }

    public Cat(String name, int age, String color) {
        this(name, age, "Cat",color);
    }

    @Override
    public String makeSound() {
        return "Cats meow";
    }

    @Override
    public String eat() {
        return "Cats eat cat food";
    }

}

