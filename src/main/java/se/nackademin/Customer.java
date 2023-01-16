package se.nackademin;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String firstname;
    private String lastname;
    private String adress;
    private String email;
    private Long phoneNumber;
    private int customerId;

    public List<String> customerList = new ArrayList<>();


    Customer(String firstname, String lastname, String adress, String email, Long phoneNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.adress = adress;
        this.email = email;
        this.phoneNumber = phoneNumber;

        customerList.add(this.firstname + " " +  this.lastname);
      
    }

    public Customer() {}

    public List<String> getCustomerList() {
        return customerList;
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

    public void setEmail(String newValue) {
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

}