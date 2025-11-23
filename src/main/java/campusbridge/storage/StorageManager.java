package campusbridge.storage;

import campusbridge.models.Student;

import java.io.*;
import java.util.ArrayList;

public class StorageManager {

    private static final String FILE_NAME = "students.dat";

    public void save(ArrayList<Student> students) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(students);
            System.out.println("Data saved to " + FILE_NAME);
        } catch (Exception e) {
            System.out.println("Error saving: " + e.getMessage());
        }
    }

    public ArrayList<Student> load() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (ArrayList<Student>) in.readObject();
        } catch (Exception e) {
            System.out.println("No saved data found. Starting fresh.");
            return new ArrayList<>();
        }
    }
}
