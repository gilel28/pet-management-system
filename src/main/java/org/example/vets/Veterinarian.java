package org.example.vets;

import org.example.pets.Pet;

/**
 * Veterinarian interface.
 * Defines the contract for any type of veterinarian.
 */
public interface Veterinarian {
    String getName();
    String examinePet(Pet pet);
}
