package com.exercise.employeeregistry;

public class Employee {
    private String name;
    private int socialSecNr;
    private String address;
    private int phoneNr;
    private String workHistory;

    public Employee(String name, int socialSecNr, String address, int phoneNr, String workHistory) {
        this.name = name;
        this.socialSecNr = socialSecNr;
        this.address = address;
        this.phoneNr = phoneNr;
        this.workHistory = workHistory;
    }

    //Metoder för Superklass.

    public String getName() {
        return name;
    }
    public int getSocialSecNr() {
        return socialSecNr;
    }
    public String getAddress() {
        return address;
    }
    public int getPhoneNr() {
        return phoneNr;
    }
    public String getWorkHistory() {
        return workHistory;
    }

}
