package se.kristins;
import java.util.Scanner;

public class GlobalTools {
    protected static Scanner runScanner = new Scanner(System.in);



public static void clearScanner(){
    if (runScanner.hasNext()){
        runScanner.nextLine();
    }
}


}
