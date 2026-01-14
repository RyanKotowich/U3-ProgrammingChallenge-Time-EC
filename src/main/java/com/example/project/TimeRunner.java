package com.example.project;
public class TimeRunner {
    public static void main(String[] args) {
        Time time1 = new Time(12, 30, 45);
        System.out.println("Time 1: " + time1.info());
        
        time1.tick();
        System.out.println("After ticking: " + time1.info());
        
        Time time2 = new Time(12, 59, 20);
        System.out.println("Time 2: " + time2.info());
        
        time1.add(time2);
        System.out.println("After adding Time 2 to Time 1: " + time1.info());
    }
}