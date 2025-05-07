package advanced.ch15.sec05.exercise;

public class Student implements Comparable<Student> {
    private int studentId;
    private String name;
    private String email;
    private String github;

    public Student(int studentId, String name, String email, String github) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.github = github;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGithub() {
        return github;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.studentId, o.studentId); // ID 기준 오름차순 정렬
    }

    @Override
    public String toString() {
        return studentId + " | " + name + " | " + email + " | " + github;
    }
}
