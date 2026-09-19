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
        students.add(student);
        saveStudents();
        System.out.println("Student added successfully!");
    }

    private void viewStudents(){
        if(students.isEmpty()){
            System.out.println("No students found.");
            return;
        }

        for(Student student : students){
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

    private void saveStudents(){
        ArrayList<String> data = new ArrayList<>();

        for(Student student : students){
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
        FileManager.write("data/students.txt", data);
    }
    private void searchStudent(){

    }
    private void updateStudent(){

    }
    private void deleteStudent(){

    }
}