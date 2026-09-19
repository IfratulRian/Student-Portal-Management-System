package manager;

import model.Student;
import util.FileManager;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Student> students = new ArrayList<>();
    public void start(){
        int choice;

        do{
            System.out.println("\n===== Student Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("0. Back");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice){
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }while(choice != 0);
    }

    private void addStudent(){

    }
    private void viewStudents(){

    }
    private void searchStudent(){

    }
    private void updateStudent(){

    }
    private void deleteStudent(){

    }
}