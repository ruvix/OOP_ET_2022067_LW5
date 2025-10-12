package LW3;

public class Main {
    static void main() {


        Owner owner1 = new Owner();
        owner1.setOwnerName("ruvindu");
        owner1.setPhoneNo("0715940426");


        Bicycle bike1 = new Bicycle(owner1);
        System.out.println(bike1.getOwner().getOwnerName());
        System.out.println(bike1.getOwner().getPhoneNo());

        // TEMP CHANGE TO FORCE COMMIT
    }
}
