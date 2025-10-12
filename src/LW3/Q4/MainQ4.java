package LW3.Q4;

public class MainQ4 {
    public static void main(String[] args) {
        Course course1 =new Course();
        Lecturer lecturer1=new Lecturer();
        Student student1= new Student();

        course1.setCourseName("OOP");
        course1.setCourseCode("ETEC_21062");

        lecturer1.setLecturerName("Kesavan Selvarajah");
        lecturer1.setCourseTeaching("OOP");

        student1.setStudentName("Ruvindu");
        student1.setDegreeName("Bachelor of Engineering Technology");
        student1.setCourseFollowing("OOP");

        System.out.println("Course: "+course1.getCourseName());
        System.out.println("Course code: "+course1.getCourseCode());
        System.out.println("Lecturer: "+lecturer1.getLecturerName());

        System.out.println(" ");

        System.out.println("Student: "+student1.getStudentName());
        System.out.println("Degree: "+student1.getDegreeName());
        System.out.println("Following Course: "+student1.getCourseFollowing());



    }
}
