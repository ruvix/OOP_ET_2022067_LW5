package LW5.Q2;

public class Course {
    private String name;
    private String enrollType;
    private int numberOfStudentsEnrolled;
    private Lecturer lecturerInCharge;
    private Degree degreeBelongsTo;

    public Course(String name, String enrollType, int numberOfStudentsEnrolled) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrollType() {
        return enrollType;
    }

    public void setEnrollType(String enrollType) {
        this.enrollType = enrollType;
    }

    public int getNumberOfStudentsEnrolled() {
        return numberOfStudentsEnrolled;
    }

    public void setNumberOfStudentsEnrolled(int numberOfStudentsEnrolled) {
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }
    public void addLecturerInCharge(Lecturer lecturer){
       this.lecturerInCharge=lecturer;
    }
    public void removeLecturerInCharge(Lecturer lecturer){
        this.lecturerInCharge=null;
    }
    public void addDegreeBelongsTo(Degree degree){
        this.degreeBelongsTo=degree;
    }
    public  void removeDegreeBelongsTo(Degree degree){
        this.degreeBelongsTo=null;
    }
    public void displayInfo(){
        System.out.println("Course: "+name+"| enroll type: "+enrollType);
        if(lecturerInCharge!=null){
            System.out.println("lecturer in change: "+lecturerInCharge.getName());
        }if(degreeBelongsTo!=null){
            System.out.println("Degree: "+degreeBelongsTo.getName());
        }
    }
}
