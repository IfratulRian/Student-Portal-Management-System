package system;
import java.util.Scanner;

public class CampusSystem {
    private static Scanner sc = new Scanner(System.in);

    public static void start(){
        int choice;
        do{
            System.out.println("\n===== Campus Event & Club Management System =====");
            System.out.println("1. Student Management");
            System.out.println("2. Club Management");
            System.out.println("3. Event Management");
            System.out.println("4. Registration Management");
            System.out.println("5. Certificate Management");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1: System.out.println("Student Management"); break;
                case 2: System.out.println("Club Management"); break;
                case 3: System.out.println("Event Management"); break;
                case 4: System.out.println("Registration Management"); break;
                case 5: System.out.println("Certificate Management"); break;
                case 0: System.out.println("Exiting system..."); break;
                default: System.out.println("Invalid choice!");
            }
        }
        while(choice != 0);
    }
}
