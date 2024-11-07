package com.example.employeemanagement.model;

import jakarta.persistence.*;

@Entity
//@Table(name = "employee")
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id")
    private String emailId;


    public Employee() {

    }

    public Employee(String firstName, String lastName, String emailId) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    public long getId() {return id;}
    public void setId(long Id){this.id = id;}

    public String getFirstName() { return  firstName;}
    public void setFirstName ( String FirstName){this.firstName = FirstName;}

    public String getLastName() {return lastName;}
    public void setLastName (String Lastname){this.lastName = Lastname;}

    public String getEmailId() {return emailId;}
    public void setEmailId (String EmailId){this.emailId = EmailId;}


}
