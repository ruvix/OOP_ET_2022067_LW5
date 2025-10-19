package LW5.Q2;

import java.util.ArrayList;

public class Lecturer extends Person {

    private String position;
    private  Department department;
    private ArrayList<Course> coursesTeaching;

    public Lecturer(String name, String position, Department department) {
        super(name);
        this.position = position;
        this.department = department;
        this.coursesTeaching = new ArrayList<>();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void displayDepartmentInfo(){
          if(department!=null){
              department.displayInfo(); }
          else {
              System.out.println("No deparment assigned yet...");
          }
    }

    public void addCourse(Course course){
        coursesTeaching.add(course);

    }
    public void removeCourse(Course course){
        coursesTeaching.remove(course);
    }
    public void listCoursesTeaching(Course course){
        System.out.println("Details of Course "+getName()+" : ");
        for(Course c:coursesTeaching){
            System.out.println("*"+c.getName());  //getname or getclass
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("lecturer: "+getName()+"==>"+position);
        if(department!=null){
            System.out.println("Department: "+department.getName());
        }

    }
}
