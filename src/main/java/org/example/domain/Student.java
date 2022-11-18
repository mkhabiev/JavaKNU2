package org.example.domain;

public class Student implements Comparable<Student> {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (!name.equals(student.name)) return false;
        return email.equals(student.email);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + email.hashCode();
        return result;
    }

    @Override
    public String toString() {
        String result = this.name + " : " + this.email;
        return result;
    }

    @Override
    public int compareTo(Student o) {
        if (o == null) return 1;

        if (this.getClass() != o.getClass()) {
            return 1;
        }

        Student s = (Student) o;

        return name.compareTo(s.getName());
    }
}
