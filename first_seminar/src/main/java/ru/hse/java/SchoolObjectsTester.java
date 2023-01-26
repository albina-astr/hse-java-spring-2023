package ru.hse.java;

import java.util.HashSet;
import java.util.Set;

public class SchoolObjectsTester {
    private static Set<School> schools = new HashSet<>();

    public static void main(String[] args) {
        addSchoolObjects();

        for (School school : schools) {
            System.out.println(school);
        }
    }

    // repeat without equals() and hashCode() methods in the 'School' class
    private static void addSchoolObjects() {
        schools.add(new School("HSE"));
        schools.add(new School("HSE"));
        schools.add(new School("HSE"));
    }
}
