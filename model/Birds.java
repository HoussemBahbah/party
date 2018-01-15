
package model;


public class Birds extends Animal implements Needs {

    public Birds(String name, String specieName, String song) {
    super(name,specieName,song);
    }
    @Override
    public String need(){
        
        return("Flying");
    }

    public Birds() {
    }

   

   
}
