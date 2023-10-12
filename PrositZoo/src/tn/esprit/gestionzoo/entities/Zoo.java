package tn.esprit.gestionzoo.entities;

public class Zoo {
    private static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private String name;
    private String city;
    private int numberOfAnimals;

    public static boolean compareZoo(Zoo zoo1, Zoo zoo2) {
        return zoo1.getNumberOfAnimals() == zoo2.getNumberOfAnimals();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Zoo name cannot be empty.");
        }
    }
    public String getCity() {
        return city;
    }

    public void setCity(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Zoo name cannot be empty.");
        }
    }

    public int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public void setNumberOfAnimals(int numberOfAnimals) {
        this.numberOfAnimals = numberOfAnimals;
    }

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            return false;
        }
        if (searchAnimal(animal) != -1) {
            return false;
        }
        animals[numberOfAnimals] = animal;
        numberOfAnimals++;
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1) {
            return false;
        }
        for (int i = indexAnimal; i < numberOfAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[numberOfAnimals - 1] = null;
        numberOfAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals in " + name + ":");
        for (int i = 0; i < numberOfAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < numberOfAnimals; i++) {
            if (animal.getName().equals(animals[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean isZooFull() {
        return numberOfAnimals == NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", Number of Cages: " + NUMBER_OF_CAGES + ", Number of Animals: " + numberOfAnimals;
    }
}
