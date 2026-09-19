package util;
import java.io.*;
import java.util.ArrayList;

public class FileManager {
    public static void write(String fileName, ArrayList<String> data){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for(String line : data){
                writer.write(line);
                writer.newLine();
            }
            writer.close();
        }
        catch(IOException e){
            System.out.println("Error writing to file.");
        }
    }
    public static ArrayList<String> read(String fileName){
        ArrayList<String> data = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = reader.readLine()) != null){
                data.add(line);
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println("Error reading file.");
        }
        return data;
    }
}