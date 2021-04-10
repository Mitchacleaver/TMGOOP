/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tmg.assignment;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author mitch
 */
public class Person {
    private int personID;
    private String name;
    private Date dateOfBirth;
    private String address;
    private String phone;
    private char gender;
    
    //Constructer for person

    public Person(int personID, String name, Date dateOfBirth, String address, String phone, char gender) {
        this.personID = personID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
    }
    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        Date date = new Date();
        String strDate = sdf.format(date);


    
    //Getters and Setters -ID & DOB
    public int getPersonID() {
        return personID;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    
}
