package se.kristins;

import java.util.*;

public class TestFeatures {
    
    


    public static int add(int a, int b){
        return a+b;
    }




    public static double calculateAvgSpeed(){

            return 0.0;
    
    
    }


    public static ArrayList<Run> createMockRunList(int numberOfRuns){
        ArrayList<Run> mockRunList = new ArrayList<>();
        for (int i = 0; i < numberOfRuns; i++){
            Run run = new Run();
            mockRunList.add(run);
        }
        return mockRunList;
    }


}
