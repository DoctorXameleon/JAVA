package org.example.Models;

public class Human {
    private String firstName;
    private String secondName;
    private String fatherName;
    private Gender gender;
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public  String getSecondName()
    {
        return secondName;
    }
    public void setSecondName(String secondName)
    {
        this.secondName = secondName;
    }
    public String getFatherName()
    {
        return fatherName;
    }
    public void setFatherName(String fatherName)
    {
        this.fatherName = fatherName;
    }
    public Gender getGender()
    {
        return gender;
    }
    public void setGender(Gender gender)
    {
        this.gender = gender;
    }
    public String getFullInfoString()
    {
        return this.firstName + " " + this.secondName + " " + this.fatherName + " Gender:" + this.gender;
    }
}
