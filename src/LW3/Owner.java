package LW3;

public class Owner {
    // Data Member
    private String ownerName;
    private String phoneNo;
    //Constructor: Initializes the data member
    public Owner() {
        ownerName = "Unknown";

    }
    public Owner(String name,String num) {
        this.ownerName = name;
        this.phoneNo = num;
    }
    //Returns the name of this bicycle's owner
    public String getOwnerName() {
        return ownerName;
    }
    //Assigns the name of this bicycle's owner
    public void setOwnerName(String name) {
        this.ownerName = name;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    //Assigns the name of this bicycle's owner
    public void setPhoneNo(String num) {
        this.phoneNo = num;
    }
}
