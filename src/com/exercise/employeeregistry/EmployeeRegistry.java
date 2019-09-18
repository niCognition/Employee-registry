package com.exercise.employeeregistry;

public class EmployeeRegistry {
    public static void main(String[] args){
        Employee employee = new Employee("Employee", 000000, "Address", 0000000000, "Most recent job");

        Programmer programmer = new Programmer("Niclas Petterson", 901214, "Fagrabovägen", 0766565266, "Industriarbetare", "Java", "Some SQL", "Git");

        programmer.showName();
        programmer.showSocialSecNr();
        programmer.showAddress();
        programmer.showPhoneNr();
        programmer.showWorkHistory();
        programmer.showCodeLanguages();
        programmer.showDataBase();
        programmer.showVersionManagement();
    }
}
