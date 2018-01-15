
package repository;

import model.Song;
import java.util.ArrayList;
import java.util.Iterator;


public class SongList {
private ArrayList<Song> songList;  


  public ArrayList<Song> getSongList() {
        return songList;
    }

    public void setSongList(ArrayList<Song> songList) {
        this.songList = songList;
    }

    public SongList() {
            songList = new ArrayList<Song>();
       
    }
    
    
    public void addSongList(Song song){
        songList.add(song);
    }
    
    public int howManysongList(){
        return songList.size();
    }

    @Override
    public String toString() {
        return "SongList \n" + songList.toString() + "\n";
    }

    public void removeSong(Song song) {
for (Iterator<Song> it = songList.iterator(); it.hasNext(); ) {

    Song s = it.next();
    if (s.getName().equalsIgnoreCase(song.getName())) {
       it.remove();
    }
}
}




}

