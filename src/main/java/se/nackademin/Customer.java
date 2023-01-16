package se.nackademin;

import java.util.ArrayList;

public class Customer {
    private String firstname;
    private String lastname;
    private String adress;
    private String email;
    private Long phoneNumber;

    Customer(String firstname, String lastname, String adress, String email, Long phoneNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.adress = adress;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Long getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(Long NewValue) {
        this.phoneNumber = NewValue;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getlastname(String lastname) {
        return lastname;
    }

    public void setlastname(String newValue) {
        this.lastname = newValue;
    }

    private void setEmail(String newValue) {
        this.email = newValue.trim();
    }

    public String getEmail() {
        return email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String changeEmail(String newValue) {
        String newEmail = newValue;
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        if (newEmail.matches(regex)) {
            setEmail(newValue);
            return newEmail;
        } else {
            return null;
        }

    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}