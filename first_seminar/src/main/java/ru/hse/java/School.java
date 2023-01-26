package ru.hse.java;

import java.util.List;
import java.util.Objects;

public class School {
    // fields
    private String name;
    private List<String> students;

    // default constructor
    public School() {
    }

    // other constructors
    public School(String name) {
        this.name = name;
    }

    public School(String name, List<String> students) {
        this.name = name;
        this.students = students;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public List<String> getStudents() {
        return students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(name, school.name) && Objects.equals(students, school.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, students);
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
