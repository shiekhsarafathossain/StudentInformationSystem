

import java.util.ArrayList;

public class Course {

    private String courseId, courseTitle;
    private double credit;
    private ArrayList<Student> studentList = new ArrayList<Student>();
    private ArrayList<ExamResult> resultList = new ArrayList<ExamResult>();
    private int numberOfStudent = 0;
    private Faculty faculty;

    // --- New Fields ---
    private Classroom classroom;
    private Semester semester;
    private Schedule schedule;
    // --------------------

    public Course() {
    }

    // Original constructor
    public Course(String courseId, String courseTitle, double credit) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
        this.classroom = null;
        this.semester = null;
        this.schedule = null;
    }

    // --- New Overloaded Constructor ---
    public Course(String courseId, String courseTitle, double credit, 
                  Classroom classroom, Semester semester, Schedule schedule) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
        this.classroom = classroom;
        this.semester = semester;
        this.schedule = schedule;
    }
    // ----------------------------------

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    // --- Getters and Setters for New Fields ---
    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
    // ------------------------------------------

    public void display() {
        System.out.println("Course Id: " + courseId);
        System.out.println("Course Title : " + courseTitle);
        System.out.println("Course Credit : " + credit);

        // --- Updated Display ---
        if (semester != null) {
            System.out.println("Semester: " + semester.getSemesterName());
        } else {
            System.out.println("Semester: Not Assigned");
        }

        if (classroom != null) {
            System.out.println("Location: " + classroom.getFullLocation());
        } else {
            System.out.println("Location: Not Assigned");
        }

        if (schedule != null) {
            System.out.println("Schedule: " + schedule.getFullSchedule());
        } else {
            System.out.println("Schedule: Not Assigned");
        }
        
        if (faculty != null) {
            System.out.println("Faculty: " + faculty.getName());
        } else {
             System.out.println("Faculty: Not Assigned (TBA)");
        }
        // -----------------------
    }

    public void addStudent(Student s) {
        // You could even update this to check against classroom.getCapacity()
        if (numberOfStudent <= 40) { 
            studentList.add(s);
            numberOfStudent++;
        } else {
            System.out.println("Student capacity reached maximum number.\n"
                    + "Cant add more");
        }
    }

    public void dropStudent(int studentId) {
        int i;
        for (i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == studentId) {
                studentList.remove(i);
                numberOfStudent--;
                break;
            }

        }

    }

    public void addMarks(ExamResult e) {
        resultList.add(e);
    }

    public void printMarks() {
        for (ExamResult i : resultList) {
            i.display();
        }
    }

    public void addFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void dropFaculty() {
        this.faculty = null;
    }

    public void printStudentList() {
        System.out.println("--- Student List for " + courseId + " ---");
        for (Student s : studentList) {
            s.display(); // Just display basic info
        }
        System.out.println("------------------------------------");
    }
}