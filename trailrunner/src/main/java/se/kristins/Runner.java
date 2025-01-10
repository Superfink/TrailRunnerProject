package se.kristins;
import java.util.ArrayList;

public class Runner {
    private int age = 0;
    private int weight = 0;
    private int height = 0;
    private String name = "";


    protected ArrayList<Run> runList = new ArrayList<>();

    public Runner(){
/*        name = "";
        height = 0;
        weight = 0;
        age = 0;
*/
    }


    public Runner(String name, int height, int weight, int age){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

// -------- methods ---------

public void registerRound(){

    int dataEntry = 0; 
    Run newRun = new Run();
    do{
    dataEntry = registrationMenu(newRun);
    if(dataEntry == 4){
        this.runList.add(newRun);
        printLatestRoundInfo();
        continue;
    }

 //   GlobalTools.clearScanner();
        switch (dataEntry) {
            case 1:
                System.out.println("Enter elapsed run time.");
                System.out.println("Hours:");
                newRun.setHours(GlobalTools.runScanner.nextInt());
                System.out.println("Minutes:");
                newRun.setMinutes(GlobalTools.runScanner.nextInt());
                System.out.println("Seconds:");
                newRun.setSeconds(GlobalTools.runScanner.nextInt());
                newRun.setTimeString("Time: " + newRun.getHours() + "h " + newRun.getMinutes() + "m " + newRun.getSeconds() + "s");
                System.out.println(newRun.getTimeString());
                break;
            case 2:
            //nytt datum
                break;
            case 3: 
            //ny kommentar
                break;
            default:
                break;
        }
    }while (dataEntry != 4);
}


private int registrationMenu(Run run){
    System.out.println("Which data would you like to enter?");
    System.out.println("1. Time: " + run.getHours() + "h " + run.getMinutes() + "m " + run.getSeconds() + "s");
    System.out.println("2. Date: " + run.getDate());
    System.out.println("3. Comment: " + run.getComment());
    System.out.println("4. Back to main menu");
    return GlobalTools.runScanner.nextInt();
}

    private void printLatestRoundInfo(){
        Run tempRun = new Run();
        tempRun = this.runList.get(this.runList.size() -1);
        System.out.println("Round registered:");
        System.out.println("Round ID: " + tempRun.getRoundID());
        System.out.println("Time:" + tempRun.getTime());
        System.out.println("Date:" + tempRun.getDate());
        if(tempRun.getComment() != ""){
            System.out.println("Comment: " + tempRun.getComment());
        }
    }

    protected void adjustPersonalSettings(){

        int adjustSetting = 0; 
        do{
        adjustSetting = adjustSettingsOptionMenu(this);
        if(adjustSetting == 5){continue;}
        System.out.println("Please set your new " + optionToSet(adjustSetting));
        GlobalTools.clearScanner();
            switch (adjustSetting) {
                case 1:
                    this.setName(GlobalTools.runScanner.nextLine());
                    System.out.println("New name is " + this.getName());
                    break;
                case 2:
                    this.setHeight(GlobalTools.runScanner.nextInt());
                    System.out.println(this.getName() + "'s height is set to " + this.getHeight() + " cm");
                    break;
                case 3: 
                    this.setWeight(GlobalTools.runScanner.nextInt());
                    System.out.println(this.getName() + "'s weight is set to " + this.getHeight() + " cm");
                    break;
                case 4:
                    this.setAge(GlobalTools.runScanner.nextInt());
                    System.out.println(this.getName() + "'s age is set to " + this.getHeight() + " cm");
                    break;

                default:
                    break;
            }
        }while (adjustSetting != 5);
    }


    private static int adjustSettingsOptionMenu(Runner runner){
        System.out.println("Which setting would you like to change?");
        System.out.println("1. Name, now set at " + runner.name );
        System.out.println("2. Height, now set at " + runner.height + " cm");
        System.out.println("3. Weight, now set at " + runner.weight + " kg");
        System.out.println("4. Age, now set at " + runner.age );
        System.out.println("5. Back to main menu");
        return GlobalTools.runScanner.nextInt();
    }

    private static String optionToSet(int option){
        switch (option) {
            case 1:
                return "name";
            case 2: 
                return "height (cm)";
            case 3:
                return "weight (kg)";
            case 4:
                return "age (years)";
            default:
                return "unknown";
        }
    }

//    ----- Getters and Setters -------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

