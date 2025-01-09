package se.kristins;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to mock-keeper, the fake news fitness app!");
        
        int runnersChoice = StartMenu.startMenu();


        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");

        Run newRun = new Run();
        newRun.setTime(LocalTime.now());
        System.out.println(newRun.getTime());
        LocalTime tempTime = newRun.getTime();
        System.out.println(tempTime.format(timeFormat));
        System.out.println(newRun.getDate());



    }
}