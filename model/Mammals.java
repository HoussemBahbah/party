
package model;


public class Mammals extends Animal implements Needs {
    @Override
    public String need(){
        return("Number of paws = 4");
    }

    public Mammals(String name, String specie, String Song) {
        super(name, specie, Song);
    }

    public Mammals() {
    }
    
    
    
}
