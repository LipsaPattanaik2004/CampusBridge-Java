package campusbridge.services;

import campusbridge.models.Student;
import campusbridge.storage.StorageManager;

import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();
    private StorageManager storage = new StorageManager();

    public void addStudent(String name, String branch, float cgpa) {
        students.add(new Student(name, branch, cgpa));
    }

    public void displayStudents() {
        System.out.println("---- Student List ----");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void saveData() {
        storage.save(students);
    }

    public void loadData() {
        students = storage.load();
    }
}
