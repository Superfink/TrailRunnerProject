package se.kristins;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Run {
    private int distance;
    private LocalTime time;
    private LocalDate date;
    private int hours;
    private int minutes;
    private int seconds;
    private int roundID;
    private String timeString;


    private double avgSpeed; //beräknas
    private double avgTimePerKm; //besräknas
    private double fitnessScore; //beräknas
    private int totalDistance; //beräknas
    private int avgDistance; //beräknas
    private String comment = ""; 

    


    

    public Run(){
        this(0, 0, 0, LocalDate.now());
    }

    public Run(int hours, int minutes, int seconds){
        this(hours, minutes, seconds, LocalDate.now());
    }


    public Run(int hours, int minutes, int seconds, LocalDate date){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.date = date;

    }

// ---------- Methods -----------






// --------  Getters and setters -------

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getDistance() {
        return this.distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public LocalTime getTime() {
        return this.time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    public int getRoundID() {
        return roundID;
    }
    
    public void setRoundID(int roundID) {
        this.roundID = roundID;
    }

    public String getTimeString() {
        return timeString;
    }

    public void setTimeString(String timeString) {
        this.timeString = timeString;
    }




    
}
