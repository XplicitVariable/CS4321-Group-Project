package sample;

import java.util.ArrayList;

/**
 * Authored by Andy
 */
public class RoomHandler {
    static ArrayList<Room> rooms = new ArrayList<>();
    public static void Main(String[] args){
        rooms.add(new Room(01, "Marketing Director's Office"));
        rooms.add(new Room(02, "Marketing Office 1"));
        rooms.add(new Room(03, "Marketing Office 2"));
        rooms.add(new Room(04, "Marketing Office 3"));
        rooms.add(new Room(05, "Marketing Manager's Office"));
    }
}
