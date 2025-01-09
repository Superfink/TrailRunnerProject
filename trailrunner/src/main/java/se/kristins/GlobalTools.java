package se.kristins;
import java.util.Scanner;

public class GlobalTools {
    protected static Scanner runScanner = new Scanner(System.in);


            // -------Convenient choice handler-------
/*
            public static int intInputFilter(int max) {

                int choice = 0;
                boolean invalidChoice = true;
        
                while (invalidChoice) {
        
                        if (runScanner.hasNextInt()) {
                            choice = runScanner.nextInt();
                            invalidChoice = ((choice < 1) || (max < choice));
                            if (invalidChoice) {
                                System.out.println("Du måste välja ett av alternativen från 1 - " + max + ".");
                                runScanner.nextLine();
                                continue;
                            }
                            else {
                                runScanner.nextLine();
                                break;
                            }
                        }
                    
                        else {
                            System.out.println("Du måste välja ett av alternativen från 1 - " + max + ".");
                            runScanner.nextLine();
                            continue;
                        }
        
                }
                return choice;
            }

*/
            }
