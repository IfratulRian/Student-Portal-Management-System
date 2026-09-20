package manager;

import model.Club;
import model.Event;
import model.Student;
import util.FileManager;

import java.util.ArrayList;
import java.util.Scanner;

public class EventManager {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<Event> events = new ArrayList<>();
    private ArrayList<Club> clubs = new ArrayList<>();

    public void start(){
        int choice;

        do{
            System.out.println("\n===== Event Management =====");
            System.out.println("1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Search Event");
            System.out.println("4. Update Event");
            System.out.println("5. Delete Event");
            System.out.println("6. View Participants");
            System.out.println("0. Back");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice){
                case 1:
                    addEvent();
                    break;
                case 2:
                    viewEvents();
                    break;
                case 3:
                    searchEvent();
                    break;
                case 4:
                    updateEvent();
                    break;
                case 5:
                    deleteEvent();
                    break;
                case 6:
                    viewParticipants();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        }while(choice != 0);
    }

    private void saveEvents(){
        ArrayList<String> data = new ArrayList<>();
        for(Event event : events){
            String line =
                    event.getEventId() + "|" +
                            event.getName() + "|" +
                            event.getType() + "|" +
                            event.getDate() + "|" +
                            event.getMaxParticipants() + "|" +
                            event.getRegistrationFee() + "|" +
                            event.getOrganizer().getClubId();

            data.add(line);
        }
        FileManager.write("data/events.txt", data);
    }

    private void addEvent(){
        System.out.print("Enter Event ID: ");
        long eventId = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Event Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Event Type: ");
        String type = sc.nextLine();

        System.out.print("Enter Date: ");
        String date = sc.nextLine();

        System.out.print("Enter Maximum Participants: ");
        int maxParticipants = sc.nextInt();

        System.out.print("Enter Registration Fee: ");
        int registrationFee = sc.nextInt();

        System.out.print("Enter Club ID: ");
        long clubId = sc.nextLong();

        Club organizer = null;

        for(Club club : clubs){
            if(club.getClubId() == clubId){
                organizer = club;
                break;
            }
        }
        if(organizer == null){
            System.out.println("Club not found!");
            return;
        }
        ArrayList<Student> participants = new ArrayList<>();
        Event event = new Event(
                eventId, name, type, date,
                maxParticipants, registrationFee,
                organizer, participants
        );

        events.add(event);
        saveEvents();
        System.out.println("Event added successfully!");
    }

    private void viewEvents(){
        if(events.isEmpty()){
            System.out.println("No events found.");
            return;
        }

        for(Event event : events){
            System.out.println(
                    event.getEventId() + " | " +
                            event.getName() + " | " +
                            event.getType() + " | " +
                            event.getDate() + " | " +
                            event.getMaxParticipants() + " | " +
                            event.getRegistrationFee() + " | " +
                            event.getOrganizer().getName()
            );
        }
    }

    private void searchEvent(){

    }
    private void updateEvent(){

    }
    private void deleteEvent(){

    }
    private void viewParticipants(){

    }
}