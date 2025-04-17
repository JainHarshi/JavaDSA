package OOPs;

import java.util.*;

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() { return name; }
    public int getScore() { return score; }
}

public class StudentScoreManager {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Harshi", 88));
        students.add(new Student("Riya", 94));
        students.add(new Student("Aman", 76));
        students.add(new Student("Nikhil", 89));

        // Sort by descending score
        students.sort((s1, s2) -> s2.getScore() - s1.getScore());

        System.out.println("Top Students:");
        for (Student s : students) {
            System.out.println(s.getName() + " - " + s.getScore());
        }

        // Find average score
        double avg = students.stream().mapToInt(Student::getScore).average().orElse(0);
        System.out.printf("Average Score: %.2f%n", avg);
    }
}
