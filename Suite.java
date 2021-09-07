package sample;

import java.util.ArrayList;
/**
 * Authored by Andy
 */
public class Suite {
        int id;
        String name;
        ArrayList<Room> rooms = new ArrayList<>();

        Suite(){
            this.id = 0;
            this.name = null;
        }

        Suite(int id, String name){
            this.id = id;
            this.name = name;
        }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
}
