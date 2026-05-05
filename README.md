# Pet Management System

## Overview
This project is a simple simulation of a Pet Clinic management system. It was developed as an assignment to demonstrate core Object-Oriented Programming (OOP) principles in Java.

The system manages different types of pets (Dogs and Cats) and their interactions with various types of veterinarians (General and Specialist), showcasing how different entities interact within a structured application.

## OOP Concepts Demonstrated
- **Abstraction:** Implemented via the `Pet` abstract class and the `Veterinarian` interface.
- **Inheritance:** The `Dog` and `Cat` classes inherit from the `Pet` superclass.
- **Polymorphism (Method Overriding & Overloading):** Subclasses override the `makeSound()` and `eat()` methods. Constructors are overloaded to provide flexible object instantiation.
- **Encapsulation:** Attributes are kept private or protected, with public getters providing controlled access. Data validation is also implemented (e.g., positive age validation).
- **Dynamic Binding:** Veterinarians process pets using polymorphic method calls, adapting the behavior based on the specific type of veterinarian and pet at runtime.

## Project Structure
- `org.example.pets`: Contains the `Pet` abstract class and its specific implementations (`Dog`, `Cat`).
- `org.example.vets`: Contains the `Veterinarian` interface and its concrete classes (`GeneralVeterinarian`, `SpecialistVeterinarian`).
- `org.example`: Contains the `PetClinic` main class, which serves as the entry point for the simulation.

## How to Run
1. Clone the repository to your local machine.
2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).
3. Navigate to `src/main/java/org/example/PetClinic.java`.
4. Run the `main` method.
5. The console will output the simulation results, displaying the interactions between the veterinarians and the pets.

## Author
Gil