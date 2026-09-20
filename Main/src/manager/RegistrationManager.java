package manager;

import model.event.Event;
import model.event.Registration;
import model.user.Student;
import util.FileManager;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistrationManager {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Registration>registrations = new ArrayList<>();
    private ArrayList<Student>students = new ArrayList<>();
    private ArrayList<Event>events = new ArrayList<>();

    public void start(){
        int choice;

        do{
            System.out.println("\n===== Registration Management =====");
            System.out.println("1. Register Student");
            System.out.println("2. View Registrations");
            System.out.println("3. Search Registration");
            System.out.println("4. Update Registration");
            System.out.println("5. Delete Registration");
            System.out.println("6. Mark Attendance");
            System.out.println("7. Give Score");
            System.out.println("0. Back");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    registerStudent();
                    break;
                case 2:
                    viewRegistrations();
                    break;
                case 3:
                    searchRegistration();
                    break;
                case 4:
                    updateRegistration();
                    break;
                case 5:
                    deleteRegistration();
                    break;
                case 6:
                    markAttendance();
                    break;
                case 7:
                    giveScore();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }while(choice != 0);
    }

    private void saveRegistrations(){
        ArrayList<String> data = new ArrayList<>();
        for(Registration registration : registrations){
            String line =
                    registration.getRegistrationId() + "|" +
                            registration.getStudent().getId() + "|" +
                            registration.getEvent().getEventId() + "|" +
                            registration.getRegistrationDate() + "|" +
                            registration.getStatus() + "|" +
                            registration.isAttendance() + "|" +
                            registration.getScore();

            data.add(line);
        }
        FileManager.write("data/registrations.txt", data);
    }

    private void registerStudent(){
        System.out.print("Enter Registration ID: ");
        long registrationId = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Student ID: ");
        long studentId = sc.nextLong();
        Student student = null;
        for(Student s : students){
            if(s.getId() == studentId){
                student = s;
                break;
            }
        }
        if(student == null){
            System.out.println("Student not found!");
            return;
        }
        System.out.print("Enter Event ID: ");
        long eventId = sc.nextLong();
        sc.nextLine();
        Event event = null;
        for(Event e : events){
            if(e.getEventId() == eventId){
                event = e;
                break;
            }
        }
        if(event == null){
            System.out.println("Event not found!");
            return;
        }
        System.out.print("Enter Registration Date: ");
        String registrationDate = sc.nextLine();

        System.out.print("Enter Status: ");
        String status = sc.nextLine();

        Registration registration = new Registration(
                registrationId,
                student,
                event,
                registrationDate,
                status,
                false,
                0
        );

        registrations.add(registration);
        saveRegistrations();
        System.out.println("Student registered successfully!");
    }

    private void viewRegistrations(){
        if(registrations.isEmpty()){
            System.out.println("No registrations found.");
            return;
        }

        for(Registration registration : registrations){
            System.out.println(
                    registration.getRegistrationId() + " | " +
                            registration.getStudent().getName() + " | " +
                            registration.getEvent().getName() + " | " +
                            registration.getRegistrationDate() + " | " +
                            registration.getStatus() + " | " +
                            registration.isAttendance() + " | " +
                            registration.getScore()
            );
        }
    }

    private void searchRegistration(){

    }
    private void updateRegistration(){

    }
    private void deleteRegistration(){

    }
    private void markAttendance(){

    }
    private void giveScore(){

    }
}