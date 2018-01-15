
package model;


public class Fish extends Animal implements Needs {
    @Override
    public String need(){
        return"swimming";
    }

    public Fish(String name, String specie, String Song) {
        super(name, specie, Song);
    }

    public Fish() {
    }
    
    
}
