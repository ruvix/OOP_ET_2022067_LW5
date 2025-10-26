package LW_06.Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        ArrayList<Pet>pets=new ArrayList<>();
        while (true){
            System.out.println("Enter the Name of the pet(if you want to stop==>(stop)) :");
            String name =scan.nextLine();
            if(name.equalsIgnoreCase("stop")){
                System.out.println("System Stop...");
                break;
            }
            Pet pet;
            System.out.println("Enter the type(c/d): ");
            String type=scan.nextLine();
            if(type.equalsIgnoreCase("c")){
                pet=new Cat();

            }else {
                pet=new Dog();
            }
            pet.setName(name);
            pets.add(pet);
        }
        System.out.println("Pet list:\n");
        for(Pet pet:pets){
            String type=(pet instanceof Dog)?"Dog": "Cat";
            System.out.println("pet name: "+pet.getName()+"  Type: "+type);


        }
        }





    }

