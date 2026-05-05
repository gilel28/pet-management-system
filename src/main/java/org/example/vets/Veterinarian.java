package org.example;

import org.example.Pets.Pet;

/**
 * Veterinarian interface.
 * Defines the contract for any type of veterinarian.
 */
public interface Veterinarian {
    String getName();
    String examinePet(Pet pet);
}
