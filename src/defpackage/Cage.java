package defpackage;

import java.util.ArrayList;


public class Cage {
    private String name;
    private ArrayList<Animal> animals;
    private int capacity;
    
    public Cage(String name) {
        this.name = name;
        animals = new ArrayList<>();
        capacity = 5;
    }
    
    public boolean addAnimal(Animal animal) {
        if(isFree()) {
            animals.add(animal);
            capacity--;
            return true;
        } else {
            return false;
        }
    }
    
    public void moveAnimalToAnotherCage(Animal animal, Cage cage) {
        cage.addAnimal(animal);
        getAnimals().remove(animal);
    }
    
    public boolean isFree() {
        return (capacity > 0)?true:false;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public int getCapacity() {
        return capacity;
    }
}
