package exercise;

public class Customer {
    private String name;
    private String adress;
    private String email;
    private Long phoneNumber;

    Customer(String name, String adress, String email, Long phoneNumber) {
        this.name = name;
        this.adress = adress;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Long getPhoneNumber() {
        return this.phoneNumber;
    }

    private void setPhoneNumber(Long NewValue) {
        this.phoneNumber = NewValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}