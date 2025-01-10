package se.kristins;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GlobalTools {
    protected static Scanner runScanner = new Scanner(System.in);
    
    protected static DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");


public static void clearScanner(){
    if (runScanner.hasNext()){
        runScanner.nextLine();
    }
}


}
