package com.app.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity(name = "students")
public class Student {

    // Data hiding
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rollNumber;
    private String name;
    private String address;

    // this keyword is a reference object/variable that refers to the current class
    public Student(int rollNumber, String name, String address) {
        // Constructor
        // initialize the objects
        this.rollNumber = rollNumber;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public void setRollNumber(int rollNumber) { this.rollNumber = rollNumber; }

    public int getRollNumber() { return rollNumber; }
}

