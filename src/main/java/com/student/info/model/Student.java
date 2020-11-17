package com.student.info.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "students")
public class Student {

    @Id
    private String id;
    private String fName;
    private String lName;
    private String email;
    private String address;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dob;
    private long contactNumber;
    private String department;
    private long studentNumber;
    private String role;

    public Student(String id, String fName, String lName, String email, String address, Date dob, long contactNumber, String department, long studentNumber, String role) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.address = address;
        this.dob = dob;
        this.contactNumber = contactNumber;
        this.department = department;
        this.studentNumber = studentNumber;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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
}
