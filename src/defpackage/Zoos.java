package defpackage;


public class Zoos {
    
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("Safary");
        
        //initialize cages to the zoo
        Cage cats = new Cage("Cats");
        Cage fishes = new Cage("Fishes");
        Cage birds = new Cage("Birds");
        
        //add animals to cages
        cats.addAnimal(new Animal("Lion"));
        cats.addAnimal(new Animal("Leopard"));
        fishes.addAnimal(new Animal("Salmon"));
        fishes.addAnimal(new Animal("Clownfish"));
        birds.addAnimal(new Animal("Mockingbird"));
        birds.addAnimal(new Animal("Parrot"));
        
        //add cages to the zoo
        zoo1.addCage(cats);
        zoo1.addCage(fishes);
        zoo1.addCage(birds);
        
        //add animal directly to the zoo,
        //not through cage
        zoo1.addAnimal(new Animal("Panthera"), cats);
        zoo1.addAnimal(new Animal("Pitta"), birds);
        
        Cage tmp_cage = zoo1.getCages().get(0); 
        tmp_cage.moveAnimalToAnotherCage(tmp_cage.getAnimals().get(0), birds);
    
        zoo1.printInfo();
    }
    
}
