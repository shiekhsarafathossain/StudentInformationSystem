

public class Semester {

    private String season; // e.g., "Spring", "Summer", "Fall"
    private int year;

    public Semester() {
    }

    public Semester(String season, int year) {
        this.season = season;
        this.year = year;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSemesterName() {
        return season + " " + year;
    }

    public void display() {
        System.out.println("Semester: " + season + " " + year);
    }
}