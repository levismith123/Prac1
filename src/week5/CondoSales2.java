package week5;

import java.util.Scanner;

public class CondoSales2 {

    public static void main (String[] args){

        double choice;
        int price;
        Scanner input = new Scanner(System.in);

        System.out.println("Choose 1 for park view, choose 2 for golf course views, choose 3 for lake views " +
                "1 - $150,000, 2 - $170,000, 3 - $210,000");
        choice = input.nextDouble();

        if (choice == 1){
            price = 150000;
        }

        else if (choice == 2){
            price = 170000;
        }

        else if (choice == 3){
            price = 210000;
        }

        else{
            price = 0;
        }

        if (price != 0){
            System.out.println("Do you want a Garage - $5,000 - 1 or a parking space? - 2");
            choice = input.nextDouble();

            if (choice == 1){
                price = price + 5000;
                System.out.println("You have chosen the garage");
            }

            else if (choice == 2){
                System.out.println("You have chosen the parking space");
            }

            else{
                System.out.println("You have selected an invalid choice");
            }
        }

        System.out.println("The price of the condominium is $" + price);
    }
}
