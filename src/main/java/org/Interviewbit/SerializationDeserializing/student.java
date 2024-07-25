package org.Interviewbit.SerializationDeserializing;

import java.io.Serializable;

public class student implements Serializable{
    private String name;
    private String email;
    private String address;
    private int age;

    /**
     * @param name
     * @param email
     * @param address
     * @param age
     */
    public student(String name, String email, String address, int age) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.age = age;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }
}
