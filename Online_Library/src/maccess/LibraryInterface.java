package maccess;

import java.util.Scanner;

import test.AdultUser;
import test.KidUsers;
import test.LibraryUser;

public class LibraryInterface {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        int choice;
        System.out.println("Library System:");
        System.out.println("1. Register and Request a Book\n2. Exit");
        do{
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter your Age: ");
                    int age = scanner.nextInt();
                    if (age <= 12) {
                        System.out.print("Enter the book type for Kid User (kids/Fiction): ");
                        String bookType=scanner.next();
                        LibraryUser kidUser=new KidUsers(age,bookType);
                        kidUser.registerAccount();
                        kidUser.requestBook();
                    } else {
                        System.out.print("Enter the book type for Adult User (kids/Fiction): ");
                        String bookType=scanner.next();
                        LibraryUser adultUser=new AdultUser(age,bookType);
                        adultUser.registerAccount();
                        adultUser.requestBook();
                    }
                    break;

                case 2:
                    System.out.println("Exiting the system. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while(choice!=2);

        scanner.close();

	}
}
