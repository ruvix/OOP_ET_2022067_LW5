package LW_06.Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();
        while (true) {
            System.out.println("...............................................................................");

            System.out.println("Enter the Name of the pet(if you want to stop==>(stop)) :");
            String name = scan.nextLine();
            if (name.equalsIgnoreCase("stop")) {
                System.out.println("****System Stop****");
                break;
            }
            Pet pet;
            System.out.println("Enter the type(c/d): ");
            String typee = scan.nextLine();
            if (typee.equalsIgnoreCase("c")) {
                pet = new Cat();
                System.out.println("Enter the Coatcolor: ");
                String coatcolor=scan.nextLine();
                ((Cat) pet).setCoatColor(coatcolor);


            } else {
                pet = new Dog();

                System.out.println("Enter the weight: ");
                double weight=scan.nextDouble();
                scan.nextLine();
                ((Dog)pet).setWeight(weight);

            }
            pet.setName(name);
            pet.setType(typee);

            pets.add(pet);
        }
        System.out.println("...............................................................................");

        System.out.println("CAT list:\n");
        for (Pet pet : pets) {
            if (pet instanceof Cat) {
                System.out.println("Cat name: " + pet.getName()+"| Type: "+((Cat)pet).getType()+"| CoatColor: "+ ((Cat) pet).getCoatColor());
                System.out.println("");


            }
        }
        System.out.println("DOG list: \n");
        for (Pet pet : pets) {
            if (pet instanceof Dog) {
                System.out.println("Dog name: " + pet.getName()+"| Type: "+((Dog)pet).getType()+"| Weight: "+ ((Dog) pet).getWeight());
                System.out.println("");

            }
        }


        for(Pet pet:pets){
            if(pet instanceof Dog){
                dogs.add((Dog) pet);
            }
        }

        if(dogs.size()>0){
            double totalWeight=0;
            double minWeight=dogs.get(0).getWeight();
            double maxWeight=dogs.get(0).getWeight();

            for(Dog dog:dogs){
                double dogweight=dog.getWeight();
                totalWeight+=dogweight;
                if(dogweight<minWeight){
                    minWeight=dogweight;
                }
                if(dogweight>maxWeight){
                    maxWeight=dogweight;
                }



            }
            double avg=totalWeight/dogs.size();
            System.out.println("...............................................................................");
            System.out.println("****Weight details of Dogs****");
            System.out.println("Average of the Dog Weight: "+avg);
            System.out.println("Minimum Weight of the Dog: "+minWeight);
            System.out.println("Maximum Weight of the Dog: "+maxWeight);

        }else {
            System.out.println("...............................................................................");
            System.out.println("NO DOGS FOUND!!");
        }





    }
}