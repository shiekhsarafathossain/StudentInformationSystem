
public class Department {

    private String departmentName;
    private double departmentTotalCredit;
    private School school; // New field

    public Department() {
    }

    // Original constructor - kept for compatibility if needed
    public Department(String departmentName, double departmentTotalCredit) {
        this.departmentName = departmentName;
        this.departmentTotalCredit = departmentTotalCredit;
        this.school = null;
    }
    
    // New constructor with School
    public Department(String departmentName, double departmentTotalCredit, School school) {
        this.departmentName = departmentName;
        this.departmentTotalCredit = departmentTotalCredit;
        this.school = school;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double getDepartmentTotalCredit() {
        return departmentTotalCredit;
    }

    public void setDepartmentTotalCredit(double departmentTotalCredit) {
        this.departmentTotalCredit = departmentTotalCredit;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void display() {
        System.out.println("Department Name: " + departmentName);
        if (school != null) {
            System.out.println("School: " + school.getSchoolName());
        } else {
            System.out.println("School: Not Assigned");
        }
        System.out.println("Department Total Credit: " + departmentTotalCredit);
    }
}