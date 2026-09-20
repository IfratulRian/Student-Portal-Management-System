package manager;

import model.event.Certificate;
import model.event.Event;
import model.user.Student;
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
                case 1:
                    issueCertificate();
                    break;
                case 2:
                    viewCertificates();
                    break;
                case 3:
                    searchCertificate();
                    break;
                case 4:
                    updateCertificate();
                    break;
                case 5:
                    deleteCertificate();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }while(choice != 0);
    }

    private void saveCertificates(){
        ArrayList<String> data = new ArrayList<>();

        for(Certificate certificate : certificates){
            String line =
                    certificate.getCertificateId() + "|" +
                            certificate.getStudent().getId() + "|" +
                            certificate.getEvent().getEventId() + "|" +
                            certificate.getType() + "|" +
                            certificate.getIssueDate();
            data.add(line);
        }
        FileManager.write("data/certificates.txt", data);
    }

    private void issueCertificate(){
        System.out.print("Enter Certificate ID: ");
        long certificateId = sc.nextLong();

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

        System.out.print("Enter Certificate Type: ");
        String type = sc.nextLine();

        System.out.print("Enter Issue Date: ");
        String issueDate = sc.nextLine();

        Certificate certificate = new Certificate(
                certificateId,
                student,
                event,
                type,
                issueDate
        );
        certificates.add(certificate);
        saveCertificates();
        System.out.println("Certificate issued successfully!");
    }

    private void viewCertificates(){
        if(certificates.isEmpty()){
            System.out.println("No certificates found.");
            return;
        }

        for(Certificate certificate : certificates){
            System.out.println(
                    certificate.getCertificateId() + " | " +
                            certificate.getStudent().getName() + " | " +
                            certificate.getEvent().getName() + " | " +
                            certificate.getType() + " | " +
                            certificate.getIssueDate()
            );
        }
    }

    private void searchCertificate(){

    }
    private void updateCertificate(){

    }
    private void deleteCertificate(){

    }
}