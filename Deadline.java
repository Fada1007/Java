import java.io.*;
import java.util.Scanner;

public class Deadline {

    public static void main(String[] args) {
        int number;
        boolean run;
        run = true;

        Scanner input = new Scanner(System.in);
        Novice novice = new Novice("100");
        // Item items = new Item();
        // Bag bag = new Bag();

        System.out.print("Please Enter your name: ");
        String name = input.nextLine();
        System.out.println("Welcome" + " " + name);

        // System.out.println();
        //

        
        run = true;

        while (run) {
            System.out.println();
            System.out.println("Menu");
            System.out.println("Enter 1 : Novice");
            System.out.println("Enter 2 : add Items");
            System.out.println("Enter 3 : show My Items");
            System.out.println("Enter 0 : Exit");
            System.out.println();

            System.out.print("Please Enter the number: ");
            int enter = input.nextInt();

            if (enter == 1) {
                System.out.println("Plese Enter Number For Novice Do");
                System.out.println("1 For Kill Monter");
                System.out.println("2 For Sleep");
                System.out.println("3 For EatHerbs");
                System.out.println("0 For End");
                int Key = input.nextInt();

                if (Key == 1) {
                    System.out.println("Your level is " + novice.killmonster());
                } else if (Key == 2) {
                    System.out.println("Your Hp is " + novice.sleep());
                } else if (Key == 3) {
                    System.out.println("Your Hp is " + novice.eatherbs());
                }
                
                if (Key == 0) {
                    run = false;
                    System.out.println("Exit");
                }
            }

            if (enter == 2) {

                System.out.println("Enter 1 : add herb");
                System.out.println("Enter 2 : add sword");
                System.out.println("Enter 3 : add knife");
                System.out.print("Please Enter the number: ");
                int key = input.nextInt();

                if (key == 1) {
                    novice.addItem("herb");
                }
                if (key == 2) {
                    novice.addItem("sword");
                }
                if (key == 3) {
                    novice.addItem("knife");
                }
                if (key == 0) {
                    run = false;
                    System.out.println("Exit");
                }

            }
            if (enter == 3) {
                System.out.println("Items in my bag : ");
                novice.showItem();

            }
            if (enter == 0) {
                run = false;
                System.out.println();
            }

        }
    }
}