package manager;

import model.Certificate;
import model.Event;
import model.Student;
import util.FileManager;

import java.util.ArrayList;
import java.util.*;

public class CertificateManager {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Certificate>certificates = new ArrayList<>();
    private ArrayList<Student>students = new ArrayList<>();
    private ArrayList<Event>events = new ArrayList<>();

    public void start(){
        int choice;

        do{
            System.out.println("\n===== Certificate Management =====");
            System.out.println("1. Issue Certificate");
            System.out.println("2. View Certificates");
            System.out.println("3. Search Certificate");
            System.out.println("4. Update Certificate");
            System.out.println("5. Delete Certificate");
            System.out.println("0. Back");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice){

            }while(choice != 0);
        }
    }
}