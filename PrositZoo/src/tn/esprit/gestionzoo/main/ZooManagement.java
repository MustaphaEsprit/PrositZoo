package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
// Create some Animal objects
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Animal dog = new Animal("Canine", "Snoopy", 2, true);

        // Create two Zoo objects
        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("Water Park", "Siliana");

        // Add animals to myZoo
        System.out.println(myZoo.addAnimal(lion)); // true
        System.out.println(myZoo.addAnimal(dog));  // true

        // Display animals in myZoo
        myZoo.displayAnimals();

        // Search for an animal in myZoo
        System.out.println("Index of Dog: " + myZoo.searchAnimal(dog));  // 1 (index of the dog)
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println("Index of Dog2: " + myZoo.searchAnimal(dog2));  // -1 (not found)

        // Remove animals from myZoo
        myZoo.displayAnimals();
        System.out.println("Removed Lion: " + myZoo.removeAnimal(lion));  // true
        myZoo.displayAnimals();
        System.out.println("Removed Dog2: " + myZoo.removeAnimal(dog2));  // false (not found)
        myZoo.displayAnimals();
        System.out.println("Removed Dog: " + myZoo.removeAnimal(dog));  // true
        myZoo.displayAnimals();

        // Compare two Zoo objects
        System.out.println("Comparing Zoos: " + Zoo.compareZoo(myZoo, notMyZoo));  // false

        // Check if myZoo is full
        System.out.println("Is myZoo Full? " + myZoo.isZooFull());  // false

        Aquatic A = new Aquatic("string","string",4,false,"string");
        Terrestre T = new Terrestre("string","string",4,false,4);
        Dolphin D = new Dolphin("string","string",4,false,"string",4.0f);
        Penguin P = new Penguin("string","string",4,false,"string",4.0f);

        A.swim(); // Classe mere dans laquelle la methode a ete implemente
        D.swim();  //Cette methode a ete implemente dans cette classe (redefinition)
        P.swim(); // Classe fille qui  herite l methode swim() de sa classe mere Aquatic

    }
}
