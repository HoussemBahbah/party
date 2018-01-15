
import model.Animal;
import model.Birds;
import model.Fish;
import model.Mammals;
import model.Song;
import repository.AnimalList;
import repository.SongList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program started");
       Scanner sc = new Scanner(System.in);
       String userCommand;
       String name;
       String specieName;
       String song;
       AnimalList animalList =new AnimalList();
       SongList songList =new SongList();
       SongList playedList=new SongList();
       do{
       System.out.println("*** MENU *** \n 'exit' 'add' 'remove animal 'list songs'  'song selection' 'list played songs' 'check animal' 'list animal' 'animal needs by name' 'animal needs by specie' \n");
       userCommand = sc.nextLine();
       switch(userCommand.toLowerCase()){
           case "add":{
               System.out.println("example:name:dog,specie=mammals,song=Faded");
               do{
           System.out.println("name");
           name=sc.nextLine();
           }while (animalList.exist(name));
               do{
               System.out.println("specie 'Birds' 'Mammals' 'Fish' ");
           specieName=sc.nextLine().toLowerCase();
               }while ((!specieName.equalsIgnoreCase("Birds"))&&(!specieName.equalsIgnoreCase("Mammals"))&&(!specieName.equalsIgnoreCase("Fish")));
           System.out.println("song");
           song=sc.nextLine();
               
                    switch(specieName.toLowerCase()){
                        case "birds":{
                            Animal bird =new Birds(name,specieName,song);
                           animalList.addAnimalList(bird);
                    }break;
                        case "mammals":{
                            Animal mammal =new Mammals(name,specieName,song);
                           animalList.addAnimalList(mammal);
                    }break;
                        case "fish":{
                            Animal fish =new Fish(name,specieName,song);
                           animalList.addAnimalList(fish);
                    }
                    }
                    songList.addSongList(new Song(song));
                    }break;
           case "list songs":{
               System.out.println(songList.toString());
               
           }break;
            case "list played songs":{
               System.out.println(playedList.toString());
               
           }break;
            case "list animal":{
               System.out.println(animalList.toString());
               
           }break;
            case "song selection":{
                Random rn = new Random();
                int i = rn.nextInt(songList.getSongList().size());
              Song selectedSong=songList.getSongList().get(i);
              System.out.println("the selected song is "+selectedSong.getName());
              playedList.addSongList(selectedSong);
              songList.removeSong(selectedSong);
              
               
           }break;
           case"check animal":{
               System.out.println("enter the name of animal");
               String nameAnimal =sc.nextLine();
               if (animalList.exist(nameAnimal))
                   System.out.println("yes the guest is in the list");
               else
                   System.out.println("no this animal doesn't exist in the list");
           }break;
           case"remove animal":{
              System.out.println("enter the name of animal");
               String nameAnimal =sc.nextLine();
               animalList.removeAnimal(nameAnimal);
           }break;
           case "animal needs by name":{
                 System.out.println("enter the name of animal");
                   String nameAnimal =sc.nextLine();
                 if(animalList.exist(nameAnimal)){
                    Animal animal=animalList.getAnimalByName(nameAnimal);
                     System.out.println(animal.need());
                 }
                     
           }break;
            case "animal needs by specie":{
                 System.out.println("enter the specie of animal 'Birds' 'Mammals' 'Fish' ");
                   String specieAnimal =sc.nextLine();
                
                    Animal animal=animalList.getAnimalBySpecie(specieAnimal);
                     System.out.println(animal.need());
                 
                     
           }break;
           
           
         }
                        
           
           }while(!userCommand.equalsIgnoreCase("exit"));
    }
}
