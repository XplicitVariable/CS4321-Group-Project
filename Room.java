package sample;

import java.util.ArrayList;

/**
*Authored by Andy
 */
public class Room {

    ArrayList<User> users = new ArrayList<User>();
    int id;
    String name;

    public Room(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
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
}
