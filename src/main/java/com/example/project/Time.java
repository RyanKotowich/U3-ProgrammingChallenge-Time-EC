package com.example.project;


public class Time{
    //PRIVATE INSTANCE VARIABLES HERE
private int numHrs;
private int numMins;
private int numSecs;

    //CONSTRUCTOR HERE 
    //constructure should take in 3 parameters (int hour, int minute, int seconds)
public Time(int hour, int minute, int seconds) {
    numHrs = hour;
    numMins = minute;
    numSecs = seconds;
}

    //GETTERS 
 public int getHours() {
    return numHrs;
 }
 public int getMinutes() {
    return numMins;
 }
 public int getSeconds() {
    return numSecs;
 }

    public String info(){
    String info = "";
        if (numHrs < 10) {
        info += "0" + numHrs + ":";
      } else {
        info += numHrs + ":";
      }
      if (numMins < 10) {
        info += "0" + numMins + ":";
      } else {
        info += numMins + ":";
      }
        if (numSecs < 10) {
        info += "0" + numSecs;
      } else {
        info += numSecs;
      }
return info;

    }


    public void tick(){
      numSecs += 1;
      if (numSecs == 60) {
        numSecs = 0;
        numMins += 1;
      }
      if (numMins == 60) {
        numMins = 0;
        numHrs += 1;
          }
        if (numHrs == 24) {
            numHrs = 0;
            numMins = 0;
            numSecs = 0;
        }
    }


    public void add(Time time2){
       numHrs = numHrs + time2.getHours();
       numMins = numMins + time2.getMinutes();
       numSecs = numSecs + time2.getSeconds();
          if (numSecs >= 60) {
        numSecs -= 60;
        numMins += 1;
      }
      if (numMins >= 60) {
        numMins -= 60;
        numHrs += 1;
          }
        if (numHrs >= 24) {
            numHrs -= 24;
        }
    }
}

