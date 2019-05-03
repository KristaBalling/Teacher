package com.theironyard;

public abstract class Teacher {

    public abstract void teach();

    private void makeAnnouncements() {
        System.out.println("made announcements...");
        }

    private void takeAttendaence(){
        System.out.println("took attendence...");
        }

     private void collectPaperWork(){
         System.out.println("collected paperWork...");
     }

     private void conductHallwayDuties(){
         System.out.println("conducted hallway duties...");
     }

     public void performOtherResponsibilities(){
        makeAnnouncements();
        takeAttendaence();
        collectPaperWork();
        conductHallwayDuties();
        performOtherResponsibilities();
    }
}
