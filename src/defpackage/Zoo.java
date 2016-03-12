package defpackage;

import java.util.ArrayList;


public class Zoo {
    private String name;
    private ArrayList<Cage> cages;

    public Zoo(String name) {
        this.name = name;
        cages = new ArrayList<>();
    }
    
    public void addCage(Cage cage) {
            cages.add(cage);
    }

    public void addAnimal(Animal animal, Cage cage) {
        cages.get(cages.indexOf(cage)).addAnimal(animal);
    }
    
    public String getName() {
        return name;
    }

    public ArrayList<Cage> getCages() {
        return cages;
    }
    
    public void printInfo() { 
        System.out.println("Information about zoo \"" + name + "\"\n");
        
        cages.iterator().forEachRemaining((c)->{
            System.out.println(c.getName() + ":");
            c.getAnimals().iterator().forEachRemaining((a)->{
                System.out.println("\t" + a.getName());
            });
            System.out.println();
        });
    }
}
