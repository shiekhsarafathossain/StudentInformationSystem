import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        try {
            // Original Lists
            ArrayList<Student> studentList = new ArrayList<Student>();
            ArrayList<Faculty> facultyList = new ArrayList<Faculty>();
            ArrayList<Course> CourseList = new ArrayList<Course>();
            ArrayList<Club> clubList = new ArrayList<Club>();
            ArrayList<ExamResult> resultList = new ArrayList<ExamResult>();
            ArrayList<Department> departmentList = new ArrayList<Department>();

            // --- New Lists ---
            ArrayList<Admin> adminList = new ArrayList<Admin>();
            ArrayList<School> schoolList = new ArrayList<School>();
            ArrayList<Classroom> classroomList = new ArrayList<Classroom>();
            ArrayList<Semester> semesterList = new ArrayList<Semester>();
            ArrayList<Schedule> scheduleList = new ArrayList<Schedule>();
            // -----------------

            boolean res = true;
            while (res) {
                System.out.println("a. Student Panel: ");
                System.out.println("b. Admin & Faculty Panel: ");
                System.out.println("0. Exit: ");
                char mainfunction = sc.next().charAt(0);
                switch (mainfunction) {
                    //case a started (STUDENT PANEL)
                    case 'a': {
                        boolean stp = true;
                        while (stp) {
                            System.out.println("\t\t\t\t-------------");
                            System.out.println("\t\t\t\tStudent Panel");
                            System.out.println("\t\t\t\t-------------");
                            System.out.println("a. Add: ");
                            System.out.println("b. Drop: ");
                            System.out.println("c. Search: ");
                            System.out.println("d. Print: ");
                            System.out.println("e. Back: ");
                            char studentpanel = sc.next().charAt(0);
                            switch (studentpanel) {
                                case 'a': { //add 
                                    boolean sp = true;
                                    while (sp) {
                                        System.out.println("a. Add a Student: ");
                                        System.out.println("b. Add Student to Course: ");
                                        System.out.println("c. Add Student to Club: ");
                                        System.out.println("d. Add Student to Department: ");
                                        System.out.println("e. Back: ");

                                        char student = sc.next().charAt(0);
                                        switch (student) {

                                            case 'a': {
                                                System.out.print("Enter Student ID: ");
                                                int sid = sc.nextInt();
                                                sc.nextLine();
                                                System.out.print("Enter Student Name: ");
                                                String sname = sc.nextLine();
                                                System.out.print("Enter Student Email:");
                                                String semail = sc.nextLine();
                                                System.out.print("Enter Student CGPA: ");
                                                double scgpa = sc.nextDouble();
                                                studentList.add(new Student(sid, sname, semail, scgpa));
                                                System.out.println("Student Added Successfully!");
                                                break;
                                            }
                                            case 'b': {
                                                System.out.print("Enter Student ID to add course: ");
                                                int id = sc.nextInt();
                                                sc.nextLine();
                                                Student sToEnroll = null;
                                                for(Student s : studentList) {
                                                    if(s.getId() == id) {
                                                        sToEnroll = s;
                                                        break;
                                                    }
                                                }
                                                if (sToEnroll == null) {
                                                    System.out.println("Student not found!");
                                                    break;
                                                }
                                                
                                                System.out.print("Enter Course ID: ");
                                                String cid = sc.nextLine();
                                                Course cToEnroll = null;
                                                for(Course c : CourseList) {
                                                    if(c.getCourseId().equals(cid)) {
                                                        cToEnroll = c;
                                                        break;
                                                    }
                                                }
                                                if (cToEnroll == null) {
                                                    System.out.println("Course not found!");
                                                    break;
                                                }
                                                
                                                sToEnroll.addCourse(cToEnroll);
                                                cToEnroll.addStudent(sToEnroll);
                                                System.out.println("Course added successfully");
                                                break;
                                            }

                                            case 'c': {
                                                System.out.print("Enter Student ID to add club: ");
                                                int sid = sc.nextInt();
                                                sc.nextLine();
                                                 Student sToEnroll = null;
                                                for(Student s : studentList) {
                                                    if(s.getId() == sid) {
                                                        sToEnroll = s;
                                                        break;
                                                    }
                                                }
                                                if (sToEnroll == null) {
                                                    System.out.println("Student not found!");
                                                    break;
                                                }
                                                
                                                System.out.print("Enter Club Name: ");
                                                String cname = sc.nextLine();
                                                Club clToEnroll = null;
                                                for(Club c : clubList) {
                                                    if(c.getClubName().equals(cname)) {
                                                        clToEnroll = c;
                                                        break;
                                                    }
                                                }
                                                if (clToEnroll == null) {
                                                    System.out.println("Club not found!");
                                                    break;
                                                }
                                                
                                                sToEnroll.addClub(clToEnroll);
                                                System.out.println("Club added successfully");
                                                break;
                                            }

                                            case 'd': {
                                                System.out.print("Enter Student ID to add Department: ");
                                                int sid = sc.nextInt();
                                                sc.nextLine();
                                                Student sToEnroll = null;
                                                for(Student s : studentList) {
                                                    if(s.getId() == sid) {
                                                        sToEnroll = s;
                                                        break;
                                                    }
                                                }
                                                if (sToEnroll == null) {
                                                    System.out.println("Student not found!");
                                                    break;
                                                }
                                                
                                                System.out.print("Enter Department Name: ");
                                                String dname = sc.nextLine();
                                                Department dToEnroll = null;
                                                for(Department d : departmentList) {
                                                    if(d.getDepartmentName().equals(dname)) {
                                                        dToEnroll = d;
                                                        break;
                                                    }
                                                }
                                                if (dToEnroll == null) {
                                                    System.out.println("Department not found!");
                                                    break;
                                                }
                                                
                                                sToEnroll.addDepartment(dToEnroll);
                                                System.out.println("Department added successfully");
                                                break;
                                            }

                                            case 'e': { //back
                                                sp = false;
                                                break;
                                            }

                                            default: {
                                                System.out.println("Invalid");
                                                sp = true;
                                                stp = true;
                                                break;
                                            }
                                        }

                                    } //add while end
                                    break;
                                } // a case end

                                case 'b': { //drop b case started
                                    boolean sp = true;
                                    while (sp) {
                                        System.out.println("a. Drop Course: ");
                                        System.out.println("b. Back: ");
                                        char drop = sc.next().charAt(0);
                                        switch (drop) {
                                            case 'a': {
                                                System.out.print("Enter Student ID: ");
                                                int sid = sc.nextInt();
                                                sc.nextLine();
                                                Student sToDrop = null;
                                                for(Student s : studentList) {
                                                    if(s.getId() == sid) {
                                                        sToDrop = s;
                                                        break;
                                                    }
                                                }
                                                if(sToDrop == null) {
                                                    System.out.println("Student not found!");
                                                    break;
                                                }
                                                
                                                System.out.print("Enter Course ID: ");
                                                String cid = sc.nextLine();
                                                Course cToDrop = null;
                                                for(Course c : CourseList) {
                                                    if(c.getCourseId().equals(cid)) {
                                                        cToDrop = c;
                                                        break;
                                                    }
                                                }
                                                if(cToDrop == null) {
                                                    System.out.println("Course not found!");
                                                    break;
                                                }
                                                
                                                cToDrop.dropStudent(sid);
                                                sToDrop.dropCourse(cid);
                                                System.out.println("Dropped Successfully!");
                                                break;
                                            }

                                            case 'b': {
                                                sp = false;
                                                break;
                                            }
                                            default: {
                                                System.out.println("Invalid Input Try Again!");
                                                sp = true;
                                                break;
                                            }
                                        }

                                    }
                                    break;
                                }

                                case 'c': { //search
                                    boolean sp = true;
                                    while (sp) {
                                        System.out.println("a. Search Course: ");
                                        System.out.println("b. Search Faculty: ");
                                        System.out.println("c. Search Club: ");
                                        System.out.println("d. Search Department: ");
                                        System.out.println("e. Search Course Result: ");
                                        System.out.println("f. Back: ");
                                        char ps = sc.next().charAt(0);
                                        switch (ps) {
                                            case 'a': {
                                                System.out.print("Enter Course ID: ");
                                                sc.nextLine();
                                                String cid = sc.nextLine();
                                                boolean found = false;
                                                for (Course i : CourseList) {
                                                    if (Objects.equals(i.getCourseId(), cid)) {
                                                        i.display();
                                                        found = true;
                                                    }
                                                }
                                                if (!found) {
                                                    System.out.println("Not Found!");
                                                }
                                                break;
                                            }

                                            case 'b': {
                                                System.out.println("Enter Faculty ID: ");
                                                int fid = sc.nextInt();
                                                boolean found = false;
                                                for (Faculty i : facultyList) {
                                                    if (fid == i.getId()) {
                                                        i.display();
                                                        found = true;
                                                    }
                                                }
                                                if (!found) {
                                                    System.out.println("Not Found!");
                                                }
                                                break;
                                            }
                                            case 'c': {
                                                System.out.print("Enter Club Name: ");
                                                sc.nextLine();
                                                String cname = sc.nextLine();
                                                boolean found = false;
                                                for (Club i : clubList) {
                                                    if (Objects.equals(i.getClubName(), cname)) {
                                                        i.display();
                                                        found = true;
                                                    }
                                                }
                                                if (!found) {
                                                    System.out.println("Not Found!");
                                                }
                                                break;
                                            }
                                            case 'd': {
                                                System.out.print("Enter Department name: ");
                                                sc.nextLine();
                                                String dname = sc.nextLine();
                                                boolean found = false;
                                                for (Department i : departmentList) {
                                                    if (Objects.equals(i.getDepartmentName(), dname)) {
                                                        i.display();
                                                        found = true;
                                                    }
                                                }
                                                if (!found) {
                                                    System.out.println("Not Found!");
                                                }
                                                break;
                                            }
                                            case 'e': {
                                                System.out.print("Enter Course ID: ");
                                                sc.nextLine();
                                                String cid = sc.nextLine();
                                                boolean found = false;
                                                for (Course i : CourseList) {
                                                    if (cid.equals(i.getCourseId())) {
                                                        System.out.println("--- Results for " + cid + " ---");
                                                        i.printMarks();
                                                        found = true;
                                                    }
                                                }
                                                if (!found) {
                                                    System.out.println("Not Found!");
                                                }
                                                break;
                                            }
                                            case 'f': {
                                                sp = false;
                                                break;
                                            }
                                            default: {
                                                System.out.println("Invalid Input Please Try Again!");
                                                break;
                                            }
                                        }

                                    }

                                    break;
                                }
                                case 'd': { //print
                                    boolean sp = true;
                                    while (sp) {
                                        System.out.println("a. Print My Information: ");
                                        System.out.println("b. Print My Department: ");
                                        System.out.println("c. Print My Courses: ");
                                        System.out.println("d. Print My Courses Result: ");
                                        System.out.println("e. Print My Club: ");
                                        System.out.println("f. Back: ");
                                        char ps = sc.next().charAt(0);
                                        
                                        // To make this panel work, we need to know *which* student is logged in.
                                        // For now, it just prints for *all* students.
                                        // A real system would have a login.
                                        System.out.println("--- (NOTE: Showing info for ALL students. Login not implemented) ---");
                                        
                                        switch (ps) {
                                            case 'a': {
                                                for (Student i : studentList) {
                                                    i.display();
                                                    System.out.println("----------");
                                                }
                                                break;
                                            }
                                            case 'b': {
                                                for (Student i : studentList) {
                                                    System.out.println("--- Dept for " + i.getName() + " ---");
                                                    i.displayAssignDepartment();
                                                    System.out.println("----------");
                                                }
                                                break;
                                            }
                                            case 'c': {
                                                for (Student i : studentList) {
                                                     System.out.println("--- Courses for " + i.getName() + " ---");
                                                    i.displayAssignCourse();
                                                    System.out.println("----------");
                                                }
                                                break;
                                            }

                                            case 'd': {
                                                for (Student i : studentList) {
                                                    System.out.println("--- Results for " + i.getName() + " ---");
                                                    i.displayAssignExamResult();
                                                     System.out.println("----------");
                                                }
                                                break;
                                            }
                                            case 'e': {
                                                for (Student i : studentList) {
                                                    System.out.println("--- Clubs for " + i.getName() + " ---");
                                                    i.displayAssignClub();
                                                     System.out.println("----------");
                                                }
                                                break;
                                            }

                                            case 'f': {
                                                sp = false;
                                                break;
                                            }

                                            default: {
                                                System.out.println("Invalid Input Please Try Again!");
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                }

                                case 'e': { //back
                                    stp = false;
                                    break;
                                }

                                default: {
                                    System.out.println("Invalid Input Please Try Again!");
                                    stp = true;
                                    break;
                                }
                            }
                        } //student panel while loop ends
                        break;
                    }
                    //case a ended

                    //case b started (Admin & Faculty Panel) - HEAVILY MODIFIED
                    case 'b': {
                        boolean stp = true;
                        while (stp) {
                            System.out.println("\t\t\t\t---------------------");
                            System.out.println("\t\t\t\tAdmin & Faculty Panel");
                            System.out.println("\t\t\t\t---------------------");
                            System.out.println("a. Add: ");
                            System.out.println("b. Drop: ");
                            System.out.println("c. Update: ");
                            System.out.println("d. Search: ");
                            System.out.println("e. Print: ");
                            System.out.println("f. Back: ");
                            char studentpanel = sc.next().charAt(0);
                            switch (studentpanel) {
                                case 'a': { //add 
                                    boolean sp = true;
                                    while (sp) {
                                        System.out.println("\n--- Create New Entities ---");
                                        System.out.println("a. Add New Faculty: ");
                                        System.out.println("b. Add New Course (Basic): ");
                                        System.out.println("c. Add New Club: ");
                                        System.out.println("d. Add New Department: ");
                                        System.out.println("j. Add New Admin: ");
                                        System.out.println("k. Add New School: ");
                                        System.out.println("l. Add New Classroom: ");
                                        System.out.println("m. Add New Semester: ");
                                        System.out.println("n. Add New Schedule: ");
                                        System.out.println("--- Assign/Link Entities ---");
                                        System.out.println("e. Add Faculty to Course: ");
                                        System.out.println("f. Add Faculty to Club: ");
                                        System.out.println("g. Add Faculty to Department: ");
                                        System.out.println("o. Assign Department to School: ");
                                        System.out.println("p. Assign Details to Course (Room, Time, Semester): ");
                                        System.out.println("--- Other ---");
                                        System.out.println("h. Add Result to Course: ");
                                        System.out.println("i. Back: ");

                                        char admin = sc.next().charAt(0);
                                        switch (admin) {
                                            case 'a': { //add faculty
                                                System.out.print("Enter Faculty ID: ");
                                                int fid = sc.nextInt();
                                                sc.nextLine();
                                                System.out.print("Enter Faculty Name: ");
                                                String fname = sc.nextLine();
                                                System.out.print("Enter Faculty Email: ");
                                                String femail = sc.nextLine();
                                                System.out.print("Enter Faculty Position: ");
                                                String fpos = sc.nextLine();
                                                facultyList.add(new Faculty(fid, fname, femail, fpos));
                                                System.out.println("Faculty Added Successfully!");
                                                break;
                                            }
                                            case 'b': { //add course (basic)
                                                sc.nextLine();
                                                System.out.print("Enter Course ID: ");
                                                String cid = sc.nextLine();
                                                System.out.print("Enter Course Title: ");
                                                String ct = sc.nextLine();
                                                System.out.print("Enter Course Credit: ");
                                                double cc = sc.nextDouble();
                                                sc.nextLine();
                                                CourseList.add(new Course(cid, ct, cc));
                                                System.out.println("Course Added Successfully!");
                                                System.out.println("Don't forget to assign details (Room, Time, Semester) later!");
                                                break;
                                            }
                                            case 'c': { //add club
                                                System.out.print("Enter Club Name: ");
                                                sc.nextLine();
                                                String cname = sc.nextLine();
                                                System.out.print("Enter Club Position (e.g., Member): ");
                                                String cp = sc.nextLine();
                                                clubList.add(new Club(cname, cp));
                                                System.out.println("Club Added Successfully!");
                                                break;
                                            }
                                            case 'd': { //add department (basic)
                                                System.out.print("Enter Department Name (e.g., CSE): ");
                                                sc.nextLine();
                                                String dname = sc.nextLine();
                                                System.out.print("Enter total Departmental Credit: ");
                                                Double dc = sc.nextDouble();
                                                departmentList.add(new Department(dname, dc));
                                                System.out.println("Department Added Successfully!");
                                                System.out.println("Don't forget to assign it to a School!");
                                                break;
                                            }
                                            case 'e': { // Add Faculty to Course
                                                System.out.print("Enter Faculty ID to add Course:");
                                                int fid = sc.nextInt();
                                                sc.nextLine();
                                                Faculty fToAssign = null;
                                                for(Faculty f : facultyList) {
                                                    if(f.getId() == fid) {
                                                        fToAssign = f;
                                                        break;
                                                    }
                                                }
                                                if(fToAssign == null) {
                                                    System.out.println("Faculty not found!");
                                                    break;
                                                }
                                                
                                                System.out.print("Enter Course ID: ");
                                                String cid = sc.nextLine();
                                                Course cToAssign = null;
                                                for(Course c : CourseList) {
                                                    if(c.getCourseId().equals(cid)) {
                                                        cToAssign = c;
                                                        break;
                                                    }
                                                }
                                                if(cToAssign == null) {
                                                    System.out.println("Course not found!");
                                                    break;
                                                }
                                                
                                                fToAssign.addCourse(cToAssign);
                                                cToAssign.addFaculty(fToAssign);
                                                System.out.println("Faculty assigned to course successfully");
                                                break;
                                            }
                                            case 'f': { // Add Faculty to Club
                                                System.out.print("Enter Faculty ID to add Club:");
                                                int fid = sc.nextInt();
                                                sc.nextLine();
                                                Faculty fToAssign = null;
                                                for(Faculty f : facultyList) {
                                                    if(f.getId() == fid) {
                                                        fToAssign = f;
                                                        break;
                                                    }
                                                }
                                                if(fToAssign == null) {
                                                    System.out.println("Faculty not found!");
                                                    break;
                                                }
                                                
                                                System.out.print("Enter Club Name: ");
                                                String cname = sc.nextLine();
                                                Club cToAssign = null;
                                                for(Club c : clubList) {
                                                    if(c.getClubName().equals(cname)) {
                                                        cToAssign = c;
                                                        break;
                                                    }
                                                }
                                                if(cToAssign == null) {
                                                    System.out.println("Club not found!");
                                                    break;
                                                }
                                                
                                                fToAssign.addClub(cToAssign);
                                                System.out.println("Faculty assigned to club successfully");
                                                break;
                                            }
                                            case 'g': { // Add Faculty to Department
                                                System.out.print("Enter Faculty ID to add Department:");
                                                int fid = sc.nextInt();
                                                sc.nextLine();
                                                Faculty fToAssign = null;
                                                for(Faculty f : facultyList) {
                                                    if(f.getId() == fid) {
                                                        fToAssign = f;
                                                        break;
                                                    }
                                                }
                                                if(fToAssign == null) {
                                                    System.out.println("Faculty not found!");
                                                    break;
                                                }
                                                
                                                System.out.print("Enter Department Name: ");
                                                String dname = sc.nextLine();
                                                Department dToAssign = null;
                                                for(Department d : departmentList) {
                                                    if(d.getDepartmentName().equals(dname)) {
                                                        dToAssign = d;
                                                        break;
                                                    }
                                                }
                                                if(dToAssign == null) {
                                                    System.out.println("Department not found!");
                                                    break;
                                                }
                                                
                                                fToAssign.addDepartment(dToAssign);
                                                System.out.println("Faculty assigned to department successfully");
                                                break;
                                            }
                                            case 'h': {//result 
                                                System.out.print("Enter Student ID: ");
                                                int sid = sc.nextInt();
                                                sc.nextLine();
                                                Student sToGrade = null;
                                                for(Student s : studentList) {
                                                    if(s.getId() == sid) {
                                                        sToGrade = s;
                                                        break;
                                                    }
                                                }
                                                if(sToGrade == null) {
                                                    System.out.println("Student not found!");
                                                    break;
                                                }
                                                
                                                System.out.print("Enter Course ID to add Exam Results:");
                                                String cid = sc.nextLine();
                                                Course cToGrade = null;
                                                for(Course c : CourseList) {
                                                    if(c.getCourseId().equals(cid)) {
                                                        cToGrade = c;
                                                        break;
                                                    }
                                                }
                                                if(cToGrade == null) {
                                                    System.out.println("Course not found!");
                                                    break;
                                                }

                                                System.out.println("Enter Mid 1 Result: ");
                                                double mid1 = sc.nextDouble();
                                                System.out.println("Enter Mid 2 Result: ");
                                                double mid2 = sc.nextDouble();
                                                System.out.println("Enter Final Result: ");
                                                double finall = sc.nextDouble();
                                                
                                                ExamResult newResult = new ExamResult(cid, mid1, mid2, finall);
                                                resultList.add(newResult); // Add to master list
                                                sToGrade.addExamMarks(newResult); // Add to student's list
                                                cToGrade.addMarks(newResult); // Add to course's list

                                                System.out.println("Result added successfully.");
                                                break;
                                            }
                                            case 'i': { //back
                                                sp = false;
                                                break;
                                            }
                                            // --- NEW CASES ---
                                            case 'j': { // Add New Admin
                                                System.out.print("Enter Admin ID: ");
                                                int aid = sc.nextInt();
                                                sc.nextLine();
                                                System.out.print("Enter Admin Name: ");
                                                String aname = sc.nextLine();
                                                System.out.print("Enter Admin Email: ");
                                                String aemail = sc.nextLine();
                                                System.out.print("Enter Admin Role (e.g., Registrar): ");
                                                String arole = sc.nextLine();
                                                adminList.add(new Admin(aid, aname, aemail, arole));
                                                System.out.println("Admin Added Successfully!");
                                                break;
                                            }
                                            case 'k': { // Add New School
                                                System.out.print("Enter School Name (e.g., School of Engineering): ");
                                                sc.nextLine();
                                                String sname = sc.nextLine();
                                                schoolList.add(new School(sname));
                                                System.out.println("School Added Successfully!");
                                                break;
                                            }
                                            case 'l': { // Add New Classroom
                                                System.out.print("Enter Building Name: ");
                                                sc.nextLine();
                                                String bname = sc.nextLine();
                                                System.out.print("Enter Room Number: ");
                                                String rnum = sc.nextLine();
                                                System.out.print("Enter Room Capacity: ");
                                                int cap = sc.nextInt();
                                                classroomList.add(new Classroom(bname, rnum, cap));
                                                System.out.println("Classroom Added Successfully!");
                                                break;
                                            }
                                            case 'm': { // Add New Semester
                                                System.out.print("Enter Season (e.g., Fall): ");
                                                sc.nextLine();
                                                String season = sc.nextLine();
                                                System.out.print("Enter Year (e.g., 2025): ");
                                                int year = sc.nextInt();
                                                semesterList.add(new Semester(season, year));
                                                System.out.println("Semester Added Successfully!");
                                                break;
                                            }
                                            case 'n': { // Add New Schedule
                                                System.out.print("Enter Days (e.g., MW or ST): ");
                                                sc.nextLine();
                                                String days = sc.nextLine();
                                                System.out.print("Enter Time (e.g., 10:00-11:30): ");
                                                String time = sc.nextLine();
                                                scheduleList.add(new Schedule(days, time));
                                                System.out.println("Schedule Added Successfully!");
                                                break;
                                            }
                                            case 'o': { // Assign Department to School
                                                System.out.print("Enter Department Name to assign: ");
                                                sc.nextLine();
                                                String dname = sc.nextLine();
                                                Department deptToAssign = null;
                                                for(Department d : departmentList) {
                                                    if(d.getDepartmentName().equals(dname)) {
                                                        deptToAssign = d;
                                                        break;
                                                    }
                                                }
                                                
                                                if(deptToAssign == null) {
                                                    System.out.println("Department not found!");
                                                    break;
                                                }
                                                
                                                System.out.print("Enter School Name to assign to: ");
                                                String sname = sc.nextLine();
                                                School schoolToAssign = null;
                                                for(School s : schoolList) {
                                                    if(s.getSchoolName().equals(sname)) {
                                                        schoolToAssign = s;
                                                        break;
                                                    }
                                                }
                                                
                                                if(schoolToAssign == null) {
                                                    System.out.println("School not found!");
                                                    break;
                                                }
                                                
                                                deptToAssign.setSchool(schoolToAssign);
                                                schoolToAssign.addDepartment(deptToAssign);
                                                System.out.println("Assigned " + dname + " to " + sname + " successfully!");
                                                break;
                                            }
                                            case 'p': { // Assign Details to Course
                                                System.out.print("Enter Course ID to update: ");
                                                sc.nextLine();
                                                String cid = sc.nextLine();
                                                Course courseToUpdate = null;
                                                for(Course c : CourseList) {
                                                    if(c.getCourseId().equals(cid)) {
                                                        courseToUpdate = c;
                                                        break;
                                                    }
                                                }
                                                if(courseToUpdate == null) {
                                                    System.out.println("Course not found!");
                                                    break;
                                                }
                                                
                                                // Find and assign Classroom
                                                System.out.print("Enter Room Number (e.g., 5101): ");
                                                String rnum = sc.nextLine();
                                                Classroom classToAssign = null;
                                                for(Classroom cr : classroomList) {
                                                    if(cr.getRoomNumber().equals(rnum)) {
                                                        classToAssign = cr;
                                                        break;
                                                    }
                                                }
                                                if(classToAssign == null) { System.out.println("Classroom not found, skipping."); }
                                                else { courseToUpdate.setClassroom(classToAssign); }
                                                
                                                // Find and assign Semester
                                                System.out.print("Enter Semester Year (e.g., 2025): ");
                                                int year = sc.nextInt();
                                                sc.nextLine(); // consume newline
                                                Semester semToAssign = null;
                                                for(Semester sem : semesterList) {
                                                    if(sem.getYear() == year) { // Simple check, could also check season
                                                        semToAssign = sem;
                                                        break;
                                                    }
                                                }
                                                if(semToAssign == null) { System.out.println("Semester not found, skipping."); }
                                                else { courseToUpdate.setSemester(semToAssign); }
                                                
                                                // Find and assign Schedule
                                                System.out.print("Enter Schedule Days (e.g., MW): ");
                                                String days = sc.nextLine();
                                                Schedule schedToAssign = null;
                                                for(Schedule sch : scheduleList) {
                                                    if(sch.getDays().equals(days)) {
                                                        schedToAssign = sch;
                                                        break;
                                                    }
                                                }
                                                if(schedToAssign == null) { System.out.println("Schedule not found, skipping."); }
                                                else { courseToUpdate.setSchedule(schedToAssign); }

                                                System.out.println("Course details updated!");
                                                break;
                                            }
                                            // --- END NEW CASES ---
                                            default: {
                                                System.out.println("Invalid Input");
                                                sp = true;
                                                stp = true;
                                                break;
                                            }
                                        }

                                    } //add while end
                                    break;
                                } // a case end
                                case 'b': { //drop b case started
                                    boolean sp = true;
                                    while (sp) {
                                        System.out.println("a. Drop Student From Course: ");
                                        System.out.println("b. Drop Faculty From Course: ");
                                        System.out.println("c. Back: ");
                                        char drop = sc.next().charAt(0);
                                        switch (drop) {
                                            case 'a': {
                                                System.out.print("Enter Student ID: ");
                                                int sid = sc.nextInt();
                                                sc.nextLine();
                                                Student sToDrop = null;
                                                for(Student s : studentList) {
                                                    if(s.getId() == sid) {
                                                        sToDrop = s;
                                                        break;
                                                    }
                                                }
                                                if(sToDrop == null) {
                                                    System.out.println("Student not found!");
                                                    break;
                                                }
                                                
                                                System.out.print("Enter Course ID: ");
                                                String cid = sc.nextLine();
                                                Course cToDrop = null;
                                                for(Course c : CourseList) {
                                                    if(c.getCourseId().equals(cid)) {
                                                        cToDrop = c;
                                                        break;
                                                    }
                                                }
                                                if(cToDrop == null) {
                                                    System.out.println("Course not found!");
                                                    break;
                                                }
                                                
                                                cToDrop.dropStudent(sid);
                                                sToDrop.dropCourse(cid);
                                                System.out.println("Dropped Successfully!");
                                                break;
                                            }

                                            case 'b': {
                                                System.out.print("Enter Faculty ID: ");
                                                int fid = sc.nextInt();
                                                sc.nextLine();
                                                Faculty facultyToDrop = null;
                                                for(Faculty f : facultyList) {
                                                    if(f.getId() == fid) {
                                                        facultyToDrop = f;
                                                        break;
                                                    }
                                                }
                                                
                                                if (facultyToDrop == null) {
                                                    System.out.println("Faculty not found!");
                                                    break;
                                                }

                                                System.out.print("Enter Course ID: ");
                                                String cid = sc.nextLine();
                                                boolean dropped = false;
                                                for(Course c : CourseList) {
                                                    if(c.getCourseId().equals(cid)) {
                                                        c.dropFaculty();
                                                        facultyToDrop.dropCourse(cid);
                                                        System.out.println("Dropped Successfully!");
                                                        dropped = true;
                                                        break;
                                                    }
                                                }
                                                if(!dropped) {
                                                    System.out.println("Course not found!");
                                                }
                                                break;
                                            }

                                            case 'c': {
                                                sp = false;
                                                break;
                                            }

                                            default: {
                                                System.out.println("Invalid Input Try Again!");
                                                sp = true;
                                                break;
                                            }
                                        }

                                    }
                                    break;
                                }

                                case 'c': { // Update
                                    boolean sp = true;
                                    while (sp) {
                                        System.out.println("\nUpdate Menu");
                                        System.out.println("a. Update Student Info: ");
                                        System.out.println("b. Update Course Info: ");
                                        System.out.println("c. Update Faculty Info: ");
                                        System.out.println("d. Update Club Info: ");
                                        System.out.println("e. Update Department Info: ");
                                        // You could add update for School, Classroom, etc. here
                                        System.out.println("f. Back: ");

                                        System.out.print("Enter your choice: ");
                                        char ucc = sc.next().charAt(0);
                                        sc.nextLine(); // Consume newline

                                        switch (ucc) {
                                            case 'a': {
                                                System.out.print("Enter Student ID to update: ");
                                                int studentId = sc.nextInt();
                                                sc.nextLine();
                                                Student sToUpdate = null;
                                                for(Student s : studentList) {
                                                    if(s.getId() == studentId) {
                                                        sToUpdate = s;
                                                        break;
                                                    }
                                                }
                                                
                                                if (sToUpdate != null) {
                                                    System.out.print("Enter Student's new ID: ");
                                                    int sid = sc.nextInt();
                                                    sc.nextLine();
                                                    sToUpdate.setId(sid);
                                                    System.out.print("Enter Student's new Name: ");
                                                    String sname = sc.nextLine();
                                                    sToUpdate.setName(sname);
                                                    System.out.print("Enter Student's new Email: ");
                                                    String smail = sc.nextLine();
                                                    sToUpdate.setEmail(smail);
                                                    System.out.print("Enter Student's new CGPA: ");
                                                    Double sCGPA = sc.nextDouble();
                                                    sToUpdate.setStudentCGPA(sCGPA);
                                                    System.out.println("ID successfully updated for: " + sid);
                                                } else {
                                                    System.out.println("Not found");
                                                }
                                                break;
                                            }
                                            case 'b': {
                                                System.out.print("Enter Course ID to update: ");
                                                String courseId = sc.nextLine();
                                                Course cToUpdate = null;
                                                for (Course c : CourseList) {
                                                    if (c.getCourseId().equals(courseId)) {
                                                        cToUpdate = c;
                                                        break;
                                                    }
                                                }
                                                
                                                if (cToUpdate != null) {
                                                    System.out.print("Enter Course's new ID:");
                                                    String cid = sc.nextLine();
                                                    cToUpdate.setCourseId(cid);
                                                    System.out.println("Enter Course's new Title: ");
                                                    String ct = sc.nextLine();
                                                    cToUpdate.setCourseTitle(ct);
                                                    System.out.println("Enter Course's new Credit: ");
                                                    double cc = sc.nextDouble();
                                                    cToUpdate.setCredit(cc);
                                                    System.out.println("ID successfully updated for: " + cid);
                                                    System.out.println("Note: Location/Time/Semester must be updated from the 'Add' menu (option 'p').");
                                                } else {
                                                    System.out.println("Not found");
                                                }
                                                break;
                                            }
                                            case 'c': {
                                                System.out.print("Enter Faculty ID to update: ");
                                                int facultyId = sc.nextInt();
                                                sc.nextLine();
                                                Faculty fToUpdate = null;
                                                for (Faculty f : facultyList) {
                                                    if (f.getId() == facultyId) {
                                                        fToUpdate = f;
                                                        break;
                                                    }
                                                }
                                                
                                                if(fToUpdate != null) {
                                                    System.out.print("Enter Faculty's new ID: ");
                                                    int fid = sc.nextInt();
                                                    sc.nextLine();
                                                    fToUpdate.setId(fid);
                                                    System.out.print("Enter Faculty's new Name: ");
                                                    String fname = sc.nextLine();
                                                    fToUpdate.setName(fname);
                                                    System.out.print("Enter Faculty's new Email: ");
                                                    String fmail = sc.nextLine();
                                                    fToUpdate.setEmail(fmail);
                                                    System.out.print("Enter Faculty's new Position: ");
                                                    String fpos = sc.nextLine();
                                                    fToUpdate.setFacultyPosition(fpos);
                                                    System.out.println("ID successfully updated for: " + fid);
                                                } else {
                                                    System.out.println("Not found");
                                                }
                                                break;
                                            }
                                            case 'd': {
                                                System.out.print("Enter Club Name to update: ");
                                                String cn = sc.nextLine();
                                                Club clToUpdate = null;
                                                for (Club cl : clubList) {
                                                    if (cl.getClubName().equals(cn)) {
                                                        clToUpdate = cl;
                                                        break;
                                                    }
                                                }
                                                
                                                if (clToUpdate != null) {
                                                    System.out.print("Enter Club's new Name:");
                                                    String cname = sc.nextLine();
                                                    clToUpdate.setClubName(cname);
                                                    System.out.println("Club name successfully updated for: " + cname);
                                                } else {
                                                    System.out.println("Not found");
                                                }
                                                break;
                                            }
                                            case 'e': {
                                                System.out.print("Enter Department Name to update: ");
                                                String dn = sc.nextLine();
                                                Department dToUpdate = null;
                                                for (Department d : departmentList) {
                                                    if (d.getDepartmentName().equals(dn)) {
                                                        dToUpdate = d;
                                                        break;
                                                    }
                                                }
                                                
                                                if (dToUpdate != null) {
                                                    System.out.print("Enter Department's new Name:");
                                                    String dname = sc.nextLine();
                                                    dToUpdate.setDepartmentName(dname);
                                                    System.out.println("Department name successfully updated for: " + dname);
                                                } else {
                                                    System.out.println("Not found");
                                                }
                                                break;
                                            }
                                            case 'f': {
                                                sp = false;
                                                break;
                                            }
                                            default: {
                                                sp = true;
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                }
                                //case c end update end
                                case 'd': { //search
                                    boolean sp = true;
                                    while (sp) {
                                        System.out.println("a. Search Course: ");
                                        System.out.println("b. Search Faculties: ");
                                        System.out.println("c. Search Club: ");
                                        System.out.println("d. Search Department: ");
                                        System.out.println("e. Search Course Result (by Student): ");
                                        System.out.println("f. Search Whether a faculty teaches a Course: ");
                                        System.out.println("h. Search Courses taken by student: ");
                                        System.out.println("i. Back: ");
                                        char ps = sc.next().charAt(0);
                                        switch (ps) {
                                            case 'a': {
                                                System.out.print("Enter Course ID: ");
                                                sc.nextLine();
                                                String cid = sc.nextLine();
                                                boolean found = false;
                                                for (Course i : CourseList) {
                                                    if (Objects.equals(i.getCourseId(), cid)) {
                                                        i.display();
                                                        found = true;
                                                    }
                                                }
                                                if(!found) { System.out.println("Not Found!"); }
                                                break;
                                            }
                                            case 'b': {
                                                System.out.println("Enter Faculty ID: ");
                                                int fid = sc.nextInt();
                                                boolean found = false;
                                                for (Faculty i : facultyList) {
                                                    if (fid == i.getId()) {
                                                        i.display();
                                                        found = true;
                                                    }
                                                }
                                                if(!found) { System.out.println("Not Found!"); }
                                                break;
                                            }
                                            case 'c': {
                                                System.out.print("Enter Club Name: ");
                                                sc.nextLine();
                                                String cname = sc.nextLine();
                                                boolean found = false;
                                                for (Club i : clubList) {
                                                    if (Objects.equals(i.getClubName(), cname)) {
                                                        i.display();
                                                        found = true;
                                                    }
                                                }
                                                if(!found) { System.out.println("Not Found!"); }
                                                break;
                                            }
                                            case 'd': {
                                                System.out.print("Enter Department Name: ");
                                                sc.nextLine();
                                                String dname = sc.nextLine();
                                                boolean found = false;
                                                for (Department i : departmentList) {
                                                    if (Objects.equals(i.getDepartmentName(), dname)) {
                                                        i.display();
                                                        found = true;
                                                    }
                                                }
                                                if(!found) { System.out.println("Not Found!"); }
                                                break;
                                            }
                                            case 'e': { //exam result search
                                                System.out.println("Enter Student ID: ");
                                                int sid = sc.nextInt();
                                                sc.nextLine(); // consume
                                                Student sToSearch = null;
                                                for(Student s : studentList) {
                                                    if(s.getId() == sid) {
                                                        sToSearch = s;
                                                        break;
                                                    }
                                                }
                                                
                                                if(sToSearch == null) {
                                                    System.out.println("Student not found!");
                                                    break;
                                                }
                                                
                                                System.out.print("Enter Course ID: ");
                                                String cid = sc.nextLine();
                                                boolean found = false;
                                                for(ExamResult er : sToSearch.getResultList()) {
                                                    if(er.getCourseName().equals(cid)) {
                                                        er.display();
                                                        found = true;
                                                    }
                                                }
                                                if(!found) { System.out.println("No result found for that course."); }
                                                break;
                                            }
                                            case 'f': {
                                                System.out.print("Enter Faculty ID: ");
                                                int fid = sc.nextInt();
                                                sc.nextLine();
                                                Faculty fToSearch = null;
                                                for (Faculty f : facultyList) {
                                                    if (fid == f.getId()) {
                                                        fToSearch = f;
                                                        break;
                                                    }
                                                }
                                                
                                                if(fToSearch == null) {
                                                    System.out.println("Faculty Not Found!");
                                                    break;
                                                }

                                                System.out.print("Enter Course ID: ");
                                                String cid = sc.nextLine();
                                                boolean found = false;
                                                for (Course c : fToSearch.getCourseList()) {
                                                    if (Objects.equals(c.getCourseId(), cid)) {
                                                        System.out.println("Yes, " + fToSearch.getName() + " teaches " + cid);
                                                        c.display();
                                                        found = true;
                                                        break;
                                                    }
                                                }
                                                if(!found) { System.out.println("No, faculty does not teach that course.");}
                                                break;
                                            }
                                            case 'h': {
                                                System.out.print("Enter Student ID: ");
                                                int sid = sc.nextInt();
                                                sc.nextLine(); // consume
                                                Student sToSearch = null;
                                                for (Student s : studentList) {
                                                    if (sid == s.getId()) {
                                                        sToSearch = s;
                                                        break;
                                                    }
                                                }
                                                
                                                if(sToSearch == null) {
                                                    System.out.println("Student not found!");
                                                    break;
                                                }
                                                
                                                System.out.println("--- Courses for " + sToSearch.getName() + " ---");
                                                sToSearch.displayAssignCourse();
                                                break;
                                            }
                                            case 'i': {
                                                sp = false;
                                                break;
                                            }
                                            default: {
                                                System.out.println("Invalid Input Please Try Again!");
                                                break;
                                            }
                                        }

                                    }

                                    break;
                                }
                                case 'e': { //print
                                    boolean sp = true;
                                    while (sp) {
                                        System.out.println("a. Print All Student Details: ");
                                        System.out.println("b. Print All Faculty Details: ");
                                        System.out.println("c. Print All Course Details: ");
                                        System.out.println("d. Print All Department Details: ");
                                        System.out.println("e. Print All School Details: ");
                                        System.out.println("f. Print All Admin Staff: ");
                                        System.out.println("g. Back: ");
                                        char ps = sc.next().charAt(0);
                                        switch (ps) {
                                            case 'a': {
                                                System.out.println("--- All Students ---");
                                                for (Student s : studentList) {
                                                    s.display();
                                                    s.displayAssignDepartment();
                                                    s.displayAssignCourse();
                                                    s.displayAssignClub();
                                                    System.out.println("--------------------");
                                                }
                                                break;
                                            }
                                            case 'b': {
                                                System.out.println("--- All Faculty Members ---");
                                                for (Faculty f : facultyList) {
                                                    f.display();
                                                    f.displayAssignCourse();
                                                    f.displayAssignClub();
                                                    f.displayAssignDepartment();
                                                    System.out.println("--------------------");
                                                }
                                                break;
                                            }
                                            case 'c': {
                                                System.out.println("--- All Courses ---");
                                                for (Course c : CourseList) {
                                                    c.display();
                                                    System.out.println("Enrolled Students: " + c.getNumberOfStudent());
                                                    c.printStudentList(); // Print students in this course
                                                    System.out.println("--------------------");
                                                }
                                                break;
                                            }
                                            case 'd': {
                                                System.out.println("--- All Departments ---");
                                                for(Department d : departmentList) {
                                                    d.display();
                                                    System.out.println("--------------------");
                                                }
                                                break;
                                            }
                                            case 'e': {
                                                System.out.println("--- All Schools ---");
                                                for(School s : schoolList) {
                                                    s.display();
                                                    s.displayDepartments(); // Show depts in this school
                                                    System.out.println("--------------------");
                                                }
                                                break;
                                            }
                                            case 'f': {
                                                System.out.println("--- All Admin Staff ---");
                                                for(Admin a : adminList) {
                                                    a.display();
                                                    System.out.println("--------------------");
                                                }
                                                break;
                                            }
                                            case 'g': {
                                                sp = false;
                                                break;
                                            }
                                            default: {
                                                System.out.println("Invalid Input Please Try Again!");
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                }
                                case 'f': { //back
                                    stp = false;
                                    break;
                                }

                                default: {
                                    System.out.println("Invalid Input Please Try Again!");
                                    stp = true;
                                    break;
                                }
                            }
                        } //admin panel while loop ends
                        break;
                    }
                    //case b ended

                    //Case 0 started (Exit)
                    case '0': {
                        res = false;
                        break;
                    }
                    //Case 0 Ended

                    default: {
                        System.out.println("Invalid Input Try Again!");
                        res = true;
                        break;
                    }
                } // main switch ended
            } // main while loop ended
        } catch (Exception e) {
            System.out.println("An error occurred: " + e);
            e.printStackTrace(); // Good for debugging
        }
    }
}