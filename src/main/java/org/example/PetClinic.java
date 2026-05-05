package org.example;

import org.example.pets.*;
import org.example.vets.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Main class to test the Pet Management System.
 */
public class PetClinic {

    public static void main(String[] args){

        try {
            List<Pet> petArrayList = new ArrayList<>();
            petArrayList.add(new Dog("Rex", 4, "Dog", "Golden Retriever"));
            petArrayList.add(new Cat("Zoey", 2, "Black"));
            petArrayList.add(new Dog("Bella", 1, "Bigel"));

            Veterinarian drEliav = new GeneralVeterinarian("Gil Eliav");
            Veterinarian drRozenfeld = new SpecialistVeterinarian("Yael Rozenfeld", "Cardiology");

            System.out.println("Welcome to the Pet Clinic:");

            for (Pet currentPet : petArrayList) {

                System.out.println(drEliav.examinePet(currentPet));
                System.out.println(drRozenfeld.examinePet(currentPet));

            }
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }



    }
}
