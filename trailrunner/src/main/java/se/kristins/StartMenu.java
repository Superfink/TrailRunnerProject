package se.kristins;

public class StartMenu {
    public static int startMenu(){
        printMenu();
        //return 1;
        return GlobalTools.runScanner.nextInt();
        }



    private static void printMenu(){
        System.out.println("What's on today's agenda?");
        System.out.println("1. Register round");
        System.out.println("2. Calculate or show fitness score");
        System.out.println("3. View previous rounds and stats");
        System.out.println("4. View and adjust personal settings");
        

    }

    
}
