package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
*Authored by Andy and Daniel
 **/
public class BuildingHandler {
    static ArrayList<Building> buildings = new ArrayList<>();
    public void main(String[] args){
        buildings.add(new Building("10", "Administrative Center"));
        buildings.add(new Building("11", "Cafeteria"));
        buildings.add(new Building("03", "Sales Offices"));
        buildings.add(new Building("01", "IT and Engineering"));
        buildings.add(new Building("02", "Clerical"));
        buildings.add(new Building("07", "Human Resources"));


    }
    public static void saveBuildings() throws IOException {
        FileWriter file = new FileWriter("buildings.txt");
        for(Building b: buildings) {
            file.write(b.getId() + "," + b.getName() + System.lineSeparator());
        }
        file.close();
    }


    public static void loadBuildings() throws IOException {
        Scanner filescanner = new Scanner(new File("buildings.txt"));
        Building loaded = new Building();

        while (filescanner.hasNextLine()) {
            loaded.setId(filescanner.nextLine());
            loaded.setName(filescanner.nextLine());
            while(filescanner.hasNextLine()){
                String line = filescanner.nextLine();
                loaded.getSuites().add(new Suite(Integer.parseInt(line.substring(0, line.indexOf(","))), line.substring(line.indexOf(","), line.length())));

            }
        }
        filescanner.close();
    }
}
