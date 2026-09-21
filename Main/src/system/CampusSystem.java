package system;
import manager.event.CertificateManager;
import manager.event.ClubManager;
import manager.event.EventManager;
import manager.event.RegistrationManager;
import manager.user.StudentManager;

import java.util.Scanner;

public class CampusSystem {
    private static Scanner sc = new Scanner(System.in);

    private static StudentManager studentManager = new StudentManager();
    private static ClubManager clubManager = new ClubManager();
    private static EventManager eventManager = new EventManager();
    private static RegistrationManager registrationManager = new RegistrationManager();
    private static CertificateManager certificateManager = new CertificateManager();

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
                case 1:
                    studentManager.start();
                    break;
                case 2:
                    clubManager.start();
                    break;
                case 3:
                    eventManager.start();
                    break;
                case 4:
                    registrationManager.start();
                    break;
                case 5:
                    certificateManager.start();
                    break;
                case 0:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        while(choice != 0);
    }
}