package org.example;

import org.example.Pets.Pet;

/**
 * General Veterinarian implementation.
 */
public class GeneralVeterinarian implements Veterinarian{

    private String name;

    public GeneralVeterinarian(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String examinePet(Pet pet) {
        return "General vet " + this.name + " examined " + pet.getName() + " the " + pet.getSpecies() +
                ". The pet made a sound: " + pet.makeSound();
    }


}
