package LW5.Q2;

import java.util.ArrayList;

public class Student extends Person{
    private String studentID;
    private String year;
    private Degree degree;
    private ArrayList<Course>coursesEnrolled;

    public Student(String name, String studentID, String year, Degree degree) {
        super(name);
        this.studentID = studentID;
        this.year = year;
        this.degree = degree;
        this.coursesEnrolled = new ArrayList<>();
    }



    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void registerDegree(){
        this.degree=degree;

    }

    public void displayDegreeinfo(){
        if(degree!=null){
            degree.displayInfo();
        }else {
            System.out.println("No degree registered..");
        }


    }

    public void enrollCourse(Course course){
        coursesEnrolled.add(course);

    }

    public void unenrollCourse(Course course){
        coursesEnrolled.remove(course);


    }

    public void listCoursesEnrolled(){
        System.out.println("list course enrollrd "+getName()+":");
        for (Course c:coursesEnrolled){
            System.out.println("*"+c.getName());
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + getName() + "==>" + studentID);
        System.out.println("Year: " + year);
        if (degree != null)
            System.out.println("Degree: " + degree.getName());
    }
}











