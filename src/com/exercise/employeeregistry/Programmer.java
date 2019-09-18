package com.exercise.employeeregistry;

import java.sql.SQLOutput;

public class Programmer extends Employee {
    private String codeLanguages;
    private String dataBase;
    private String versionManagement;

    public Programmer(String name, int socialSecNr, String address, int phoneNr, String workHistory, String codeLanguages, String dataBase, String versionManagement) {
        super(name, 900414, "Fagrabovägen 19B", 0761070320, "Industriarbetare");
        this.codeLanguages = codeLanguages;
        this.dataBase = dataBase;
        this.versionManagement = versionManagement;
    }

    public void showName() {
        System.out.println("Name of programmer: " + getName());
    }
    public void showSocialSecNr() {
        System.out.println("Social security number: " + getSocialSecNr());
    }
    public void showAddress() {
        System.out.println("Home address: " + getAddress());
    }
    public void showPhoneNr() {
        System.out.println("Phone number: " + getPhoneNr());
    }
    public void showWorkHistory() {
        System.out.println("Most recent job: " + getWorkHistory());
    }

    //Plats för eventuell Override.


    //Metoder för att visa programmerar alternativen.
    public String showCodeLanguages() {
        System.out.println("Known code languages: " + codeLanguages);
        return codeLanguages;
    }
    public String showDataBase() {
        System.out.println("Database knowledge: " + dataBase);
        return dataBase;
    }
    public String showVersionManagement() {
        System.out.println("Version management: " + versionManagement);
        return versionManagement;
    }
}
