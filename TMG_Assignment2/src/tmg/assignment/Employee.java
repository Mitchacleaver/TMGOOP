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
public class Employee extends Person {
    private String userName;
    private String password = "ABC123"; //Starter Password
    private String phoneExtension;
    
    //Overloaded Constructer Employee (No password)

    public Employee(String userName, String phoneExtension, int personID, String name, Date dateOfBirth, String address, String phone, char gender) {
        super(personID, name, dateOfBirth, address, phone, gender);
        this.userName = userName;
        this.phoneExtension = phoneExtension;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneExtension() {
        return phoneExtension;
    }

    public void setPhoneExtension(String phoneExtension) {
        this.phoneExtension = phoneExtension;
    }
    
    
    
}
