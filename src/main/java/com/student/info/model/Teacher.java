package com.student.info.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "teachers")
public class Teacher {
    @Id
    private String id;
    private long teacherNumber;
    private String fName;
    private String lName;
    private String address;
    private long contactNumber;
    private String department;
    private String role;
    private String email;


    public Teacher(String id, long teacherNumber, String fName, String lName, String address, long contactNumber, String department, String role, String email) {
        this.id = id;
        this.teacherNumber = teacherNumber;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.department = department;
        this.role = role;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(long teacherNumber) {
        this.teacherNumber = teacherNumber;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
