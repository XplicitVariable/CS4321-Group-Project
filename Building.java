package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Authored by Andy and Daniel

 */
public class Building {
    private String id;
    private String name;
    //Changed arrayList to Suites instead of Buildings
    public ArrayList<Suite> suites = new ArrayList<Suite>();

    Building(){
    }

    public Building(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Suite> getSuites() {
        return suites;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuites(ArrayList<Suite> suites) {
        this.suites = suites;
    }
    @Override
    public String toString() {
        return "name=" + name + " id=" + id;
    }
}
