package studentinformationsystem;

public class Schedule {

    private String days; // e.g., "MW" (Monday/Wednesday), "ST" (Sunday/Tuesday)
    private String time; // e.g., "10:00 AM - 11:30 AM"

    public Schedule() {
    }

    public Schedule(String days, String time) {
        this.days = days;
        this.time = time;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }



    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFullSchedule() {
        return days + " at " + time;
    }

    public void display() {
        System.out.println("Schedule: " + days + ", " + time);
    }
}