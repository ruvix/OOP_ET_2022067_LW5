package LW5.Q2;

public class UniversityManagementSystem {
    public static void main(String[] args) {

        Department department1=new Department("Software Enginnering");
        Degree degree1=new Degree("Compuer Science",100);
        Degree degree2=new Degree("Enginnering Tecnology",115);

        Course course1=new Course("Object-Oriented Programming","full time",150);
        Course course2=new Course("Engineering Materials ","full time",115);
             degree2.offerCourse(course2);
             degree2.offerCourse(course1);
             //department1.offerCourse(course2);
             department1.offerCourse(course1);


        Lecturer lecturer1=new Lecturer("Dr.Kesavan","senior Lecturer",department1);
        Lecturer lecturer2=new Lecturer("Dr. Induni Siriwardane","senior Lecturer",department1);
             lecturer2.addCourse(course2);
             department1.addlecturer(lecturer2);
             department1.addlecturer(lecturer1);
             department1.appointDepartmentHead(lecturer2);
             course2.addLecturerInCharge(lecturer2);


        Student student1=new Student("ruvindu","ET/2022/067","2nd year",degree2);
              student1.enrollCourse(course2);
              student1.enrollCourse(course1);




        System.out.println("--------------------------------------------------------------");
        System.out.println("..Lecturer Info..");
        lecturer2.displayInfo();
       //lecturer2.listCoursesTeaching();
        //lecturer2.displayDepartmentInfo();

        System.out.println("--------------------------------------------------------------");
        System.out.println("..Department Info..");
        department1.displayInfo();

        System.out.println("--------------------------------------------------------------");
        System.out.println("..Student Info..");
        student1.displayInfo();
        student1.listCoursesEnrolled();

        System.out.println("--------------------------------------------------------------");
        System.out.println("..Degree Info..");
        degree1.displayInfo();
        degree1.listCoursesOffering();

        System.out.println("--------------------------------------------------------------");
        System.out.println("..Course Info..");
        course1.displayInfo();

    }
}
