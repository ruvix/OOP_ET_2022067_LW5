package LW_06.Q1.Q6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        ArrayList<Pets> pets = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();

        while (true) {
            System.out.println("__________________________________________________________");
            System.out.println("****PET MENU****");
            System.out.println("1.Add Cat");
            System.out.println("2.Add Dog");
            System.out.println("3.Remove Cat");
            System.out.println("4.Remove Dog");
            System.out.println("0.Quit");

            System.out.print("Enter the Option(1,2,3,4,0): \n");
            int option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    System.out.println("__________________________________________________________");

                    System.out.print("Enter the Cat name: ");
                    String catName = scan.nextLine();
                    System.out.print("Enter the CoatColor: ");
                    String color = scan.nextLine();

                    Cat cat = new Cat(catName, color);
                    cats.add(cat);
                    pets.add(cat);
                    System.out.println(cat.getName() + " | color: " + cat.getCoatColor() + "was added\n");
                    break;

                case 2:
                    System.out.println("__________________________________________________________");

                    System.out.print("Enter the Dog name: ");
                    String dogName = scan.nextLine();
                    System.out.print("Enter the weight: ");
                    double weight = scan.nextDouble();

                    Dog dog = new Dog(dogName, weight);
                    dogs.add(dog);
                    pets.add(dog);
                    System.out.println(dog.getName() + " | weight: " + dog.getWeight() + "was added\n");
                    break;

                case 3:
                    System.out.println("__________________________________________________________");

                    System.out.print("Enter the cat name to remove: ");
                    String removeCat = scan.nextLine();

                    Cat catToRemove = null;
                    for (Cat c : cats) {
                        if (c.getName().equalsIgnoreCase(removeCat)) {
                            catToRemove = c;
                            break;
                        }
                    }

                    if (catToRemove != null) {
                        cats.remove(catToRemove);
                        pets.remove(catToRemove);
                        System.out.println(catToRemove + " was removed \n");
                    } else {
                        System.out.println("can't find !!");
                    }
                    break;

                case 4:
                    System.out.println("__________________________________________________________");

                    System.out.print("Enter the dog name to remove: ");
                    String removeDog = scan.nextLine();

                    Dog dogToRemove = null;
                    for (Dog d : dogs) {

                        if (d.getName().equalsIgnoreCase(removeDog)) {
                            dogToRemove = d;
                            break;
                        }

                    }
                    if (dogToRemove != null) {
                        dogs.remove(dogToRemove);
                        pets.remove(dogToRemove);
                        System.out.println(removeDog + " was removed \n");
                    } else {
                        System.out.println("can't find !!");
                    }
                    break;

                case 0:
                    System.out.println("__________________________________________________________");

                    System.out.println("****Program END****");
                    return;


                default:
                    System.out.println("__________________________________________________________");

                    System.out.println("****wrong option****");
            }
            System.out.println("\n--- Current CAT List ---");
            for (Cat c : cats) {
                System.out.println("Name: " + c.getName() + " | Coat Color: " + c.getCoatColor());
            }
            System.out.println("\n--- Current DOG List ---");
            for (Dog d : dogs) {
                System.out.println("Name: " + d.getName() + " | weight: " + d.getWeight());
            }

        }


    }
}
