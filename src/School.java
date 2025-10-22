

import java.util.ArrayList;

public class School {

    private String schoolName;
    private Faculty dean; // A school can have a Dean, who is a Faculty member
    private ArrayList<Department> departmentList = new ArrayList<Department>();

    public School() {
    }

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Faculty getDean() {
        return dean;
    }

    public void setDean(Faculty dean) {
        this.dean = dean;
    }

    public ArrayList<Department> getDepartmentList() {
        return departmentList;
    }

    // This method adds a department to this school's list
    public void addDepartment(Department d) {
        departmentList.add(d);
    }

    public void display() {
        System.out.println("School Name: " + schoolName);
        if (dean != null) {
            System.out.println("Dean: " + dean.getName());
        } else {
            System.out.println("Dean: Not Assigned");
        }
    }

    public void displayDepartments() {
        System.out.println("--- Departments in " + schoolName + " ---");
        for (Department d : departmentList) {
            System.out.println("- " + d.getDepartmentName());
        }
    }
}