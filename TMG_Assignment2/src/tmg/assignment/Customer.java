/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tmg.assignment;

import java.util.Date;

/**
 *
 * @author mitch
 */
public class Customer extends Person
{
    private int age;
    private String licenseNumber;
    private Date licenseExpiry;

    public Customer(int age, String licenseNumber, Date licenseExpiry, int personID, String name, Date dateOfBirth, String address, String phone, char gender) {
        super(personID, name, dateOfBirth, address, phone, gender);
        this.age = age;
        this.licenseNumber = licenseNumber;
        this.licenseExpiry = licenseExpiry;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Date getLicenseExpiry() {
        return licenseExpiry;
    }

    public void setLicenseExpiry(Date licenseExpiry) {
        this.licenseExpiry = licenseExpiry;
    }
    
    
    
}
