package com.example.AopExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student " + name + " = " + marks;
    }
}

public class StudentSorting {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("raj", 75),
                new Student("jaya", 75),
                new Student("kumar", 85),
                new Student("raju", 65),
                new Student("raja", 67)
        );

        // Sort students first by marks, then by name
        students.stream()
                .sorted(Comparator.comparingInt(Student::getMarks).thenComparing(Student::getName))
                .forEach(System.out::println);
    }
}
