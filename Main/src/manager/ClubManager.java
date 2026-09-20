package manager;

import model.user.Student;
import util.FileManager;
import java.util.ArrayList;
import java.util.Scanner;

public class ClubManager {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<Student> clubMember = new ArrayList<>();

    public void start(){
        int choice;

        do{
            System.out.println("\n===== Club Management =====");
            System.out.println("1. Add Member");
            System.out.println("2. View Members");
            System.out.println("3. View President details");
            System.out.println("4. Search Members");
            System.out.println("5. Update Details");
            System.out.println("6. Delete Details");
            System.out.println("0. Back");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice){
                case 1:
                    addMember();
                    break;
                case 2:
                    viewMembers();
                    break;
                case 3:
                    viewPresidentDetails();
                    break;
                case 4:
                    searchMember();
                    break;
                case 5:
                    updateDetails();
                    break;
                case 6:
                    deleteDetails();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        }while(choice != 0);
    }

    private void saveMembers(){
        ArrayList<String> data = new ArrayList<>();

        for(Student student : clubMember){
            String line =
                    student.getId() + "|" +
                            student.getName() + "|" +
                            student.getEmail() + "|" +
                            student.getPhone() + "|" +
                            student.getDepartment() + "|" +
                            student.getSemester() + "|" +
                            student.getCgpa() + "|" +
                            student.getPoints();

            data.add(line);
        }
        FileManager.write("data/clubs.txt", data);
    }

    private void addMember(){
        System.out.print("Enter ID: ");
        long id = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Semester: ");
        int semester = sc.nextInt();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.print("Enter Points: ");
        int points = sc.nextInt();

        Student student = new Student(
                id, name, email, phone,
                department, semester, cgpa, points
        );

        clubMember.add(student);
        saveMembers();
        System.out.println("Member added successfully!");
    }

    private void viewMembers(){
        if(clubMember.isEmpty()){
            System.out.println("No members found.");
            return;
        }

        for(Student student : clubMember){
            System.out.println(
                    student.getId() + " | " +
                            student.getName() + " | " +
                            student.getEmail() + " | " +
                            student.getPhone() + " | " +
                            student.getDepartment() + " | " +
                            student.getSemester() + " | " +
                            student.getCgpa() + " | " +
                            student.getPoints()
            );
        }
    }

    private void viewPresidentDetails(){

    }
    private void searchMember(){

    }
    private void updateDetails(){

    }
    private void deleteDetails(){

    }
}