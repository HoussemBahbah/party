package model;

public  abstract class Animal {
    
   String name;
   String specie;
   String Song;

   public abstract String need();
    public Animal(String name, String specie, String Song) {
        this.name = name;
        this.specie = specie;
        this.Song = Song;
    }

    public String getSong() {
        return Song;
    }

  

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public String getSpecie() {
        return specie;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    @Override
    public String toString() {
        return  "the name of the animal is " + name + ", the specie=" + specie + ", The Song=" + Song +"\n";
    }
    
    
}
