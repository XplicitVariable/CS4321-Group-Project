package sample;

import java.util.ArrayList;
/**
 * Authored by Andy
 */
public class SuiteHandler {
    static ArrayList<Suite> suites = new ArrayList<>();
    public static void Main(String[] args){
        suites.add(new Suite(1, "Marketing 1"));
        suites.add(new Suite(2, "Marketing 2"));
        suites.add(new Suite(3, "Maintainance and Janitorial"));


    }

}
