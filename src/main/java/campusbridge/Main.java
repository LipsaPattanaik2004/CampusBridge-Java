package campusbridge;

import campusbridge.services.StudentManager;

public class Main {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();
        manager.loadData();  // Load saved students

        manager.addStudent("Lipsa", "CSE", 8.7f);
        manager.addStudent("Pratik", "IT", 8.1f);

        manager.displayStudents();

        manager.saveData();  // Save updated list
    }
}
