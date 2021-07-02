package com.toDel.Entity;

import javax.persistence.*;

@Entity
@Table( name = "USER_DECK")
public class User {

    @Column(name = "id")
    @Id

//    @GeneratedValue(strategy = GenerationType.SEQUENCE,
//            generator = "student_sequence")

    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name" )
    private String lastName;

    @Column(name = "email")
    private String email;

    public User() {
    }

    public User(String name, String firstName, String lastName, String email) {
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
