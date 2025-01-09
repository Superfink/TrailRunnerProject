package se.kristins;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    
    
    public static void main(String[] args) {
        System.out.println("Hello and welcome to mock-keeper, the fake news fitness app!");
        int runnersChoice = StartMenu.startMenu();
        switch (runnersChoice) {
            case 1: //OM 1: registrera runda
                break;
            case 2: //OM 2: Fitness score
                break;
            case 3: //OM 3: View prev. rounds and stats
                break;
            case 4: //OM 4: View/adjust personal settings
                startUp();
                break;
            default:
                break;
        }


    
    
    
    

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");

        Run newRun = new Run();
        newRun.setTime(LocalTime.now());
        System.out.println(newRun.getTime());
        LocalTime tempTime = newRun.getTime();
        System.out.println(tempTime.format(timeFormat));
        System.out.println(newRun.getDate());

    }

    public static void startUp(){
        Runner runner = new Runner();
        runner.adjustPersonalSettings();
    }
    

}