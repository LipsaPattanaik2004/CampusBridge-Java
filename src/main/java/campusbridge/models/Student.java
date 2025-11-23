package campusbridge.models;

public class Student {

    private String name;
    private String branch;
    private float cgpa;

    public Student(String name, String branch, float cgpa) {
        this.name = name;
        this.branch = branch;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public float getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return name + " | " + branch + " | CGPA: " + cgpa;
    }
}
