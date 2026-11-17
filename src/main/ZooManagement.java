package main;

import entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        // Capacite reduite a 3 cages pour tester Prosit 7
        Zoo zoo = new Zoo("Friguia", "Tunis", 3);

        Animal a1 = new Animal("Lion", "Simba", 5, true);
        Animal a2 = new Animal("Tiger", "Tigrou", 4, true);
        Animal a3 = new Animal("Snake", "Kaa", 2, false);
        Animal a4 = new Animal("Elephant", "Dumbo", 6, true);
        Animal a5 = new Animal("Monkey", "Coco", -2, true);

        // Test 1: animal valide
        try {
            zoo.addAnimal(a1);
        } catch (InvalidAgeException | ZooFullException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
        System.out.println("Total animals: " + zoo.getNbrAnimals());

        // Test 2: age negatif
        try {
            zoo.addAnimal(a5);
        } catch (InvalidAgeException | ZooFullException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
        System.out.println("Total animals: " + zoo.getNbrAnimals());

        // Test 3: deuxieme animal valide
        try {
            zoo.addAnimal(a2);
        } catch (InvalidAgeException | ZooFullException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
        System.out.println("Total animals: " + zoo.getNbrAnimals());

        // Test 4: troisieme animal valide
        try {
            zoo.addAnimal(a3);
        } catch (InvalidAgeException | ZooFullException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
        System.out.println("Total animals: " + zoo.getNbrAnimals());

        // Test 5: zoo deja plein
        try {
            zoo.addAnimal(a4);
        } catch (InvalidAgeException | ZooFullException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
        System.out.println("Total animals: " + zoo.getNbrAnimals());

        System.out.println("\n--- Zoo Information ---");
        zoo.displayZoo();

        System.out.println("\n--- Animals ---");
        zoo.displayAnimals();

        // Tests Prosit 6: polymorphisme et animaux aquatiques
        Dolphin d1 = new Dolphin(
                "Dolphin", "Flipper", 5, true, "Ocean", 30
        );

        Penguin p1 = new Penguin(
                "Penguin", "Pingu", 3, true, "Antarctica", 50
        );

        Penguin p2 = new Penguin(
                "Penguin", "Polo", 4, true, "Antarctica", 70
        );

        zoo.addAquaticAnimal(d1);
        zoo.addAquaticAnimal(p1);
        zoo.addAquaticAnimal(p2);

        System.out.println("\n--- Aquatic Animals ---");
        zoo.displayAquaticAnimals();

        System.out.println("Number of dolphins: " + zoo.countDolphins());
        System.out.println("Number of penguins: " + zoo.countPenguins());
        System.out.println("Maximum penguin depth: "
                + zoo.maxPenguinSwimmingDepth());
    }
}
