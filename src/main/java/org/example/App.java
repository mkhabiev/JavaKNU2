package org.example;

import org.example.domain.Student;

import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Application started...");

        Collection<Student> students;
        students = new LinkedList<>();

        Student a = new Student();
        a.setName("I'm student A");
        a.setEmail("a@gmail.com");

        Student b = new Student();
        b.setName("I'm student A");
        b.setEmail("a@gmail.com");

        Student c = new Student();
        c.setName("I'm student A");
        c.setEmail("a@gmail.com");

        students.add(a);
        students.add(b);
        students.add(c);

        Set<Student> studentsSet = new HashSet<>();
        studentsSet.addAll(students);

        Set<Student> treeSet = new TreeSet<>();
        treeSet.addAll(students);

        System.out.println("Linked lists: ");
        printCollection(students);

        System.out.println("HashSet: ");
        printCollection(studentsSet);

        System.out.println("TreeSet: ");
        printCollection(treeSet);

        List<Student> studentList = new ArrayList<>(students);
        studentList.sort(Student::compareTo);
        System.out.println("Sorted list: ");
        printCollection(studentList);

        System.out.println("Application finished...");
    }

    private static void printCollection(Collection<Student> students) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext())
        {
            Student s = iterator.next();
            System.out.println(s);
        }
    }
}
