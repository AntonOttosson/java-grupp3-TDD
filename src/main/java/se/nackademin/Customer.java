package se.nackademin;

public class Customer {
    private String firstname;
    private String lastname;
    private String adress;
    private String email;
    private Long phoneNumber;
    private int customerId;

    Customer(String name, String adress, String email, Long phoneNumber) {
        this.name = name;
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