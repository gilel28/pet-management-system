package org.example.vets;

import org.example.pets.Pet;

/**
 * Specialist Veterinarian implementation.
 */
public class SpecialistVeterinarian implements Veterinarian {
    private String name;
    private String specialty;

    public SpecialistVeterinarian(String name, String specialty) {
        this.specialty = specialty;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String examinePet(Pet pet) {
        return "Specialist Vet " + this.name + " (" + this.specialty + ") performed a specialized exam on " +
                pet.getName() + ". Diet noted: " + pet.eat();
    }
}
