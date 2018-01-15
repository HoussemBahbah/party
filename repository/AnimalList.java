
package repository;

import model.Animal;
import java.util.ArrayList;
import java.util.Iterator;


public class AnimalList {
private ArrayList<Animal> animalList;  


  public ArrayList<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(ArrayList<Animal> animalList) {
        this.animalList = animalList;
    }

    
    public AnimalList() {
            animalList = new ArrayList<Animal>();
       
    }
    
    
    public void addAnimalList(Animal animal){
        animalList.add(animal);
    }
    
    public int howManyAnimalList(){
        return animalList.size();
    }



public boolean exist(String name){
    Animal animal;
    for (int i=0;i<animalList.size();i++){
        animal=animalList.get(i);
        if(animal.getName().equalsIgnoreCase(name))
            return true;
    }
    return false;
}


public Animal getAnimalByName(String name){
    Animal animal;
    for (int i=0;i<animalList.size();i++){
        animal=animalList.get(i);
        if(animal.getName().equalsIgnoreCase(name))
            return animal;
    }
    return null;
}


public Animal getAnimalBySpecie(String specie){
    Animal animal;
    for (int i=0;i<animalList.size();i++){
        animal=animalList.get(i);
        if(animal.getSpecie().equalsIgnoreCase(specie))
            return animal;
    }
    return null;
}



    @Override
    public String toString() {
        return "AnimalList \n" + animalList +"\n";
    }

    public void removeAnimal(String animal) {
for (Iterator<Animal> it = animalList.iterator(); it.hasNext(); ) {

    Animal a = it.next();
    if (a.getName().equalsIgnoreCase(animal)) {
       it.remove();
    }
}
}


}
