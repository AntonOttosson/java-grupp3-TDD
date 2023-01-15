package se.nackademin;

public class Main {

    public static void main(String[] args) {
        // Test that creating Objects and retrieving info works.
        Customer cust = new Customer("Dennis", "Bygatan 15", "dennis.lunnelid@gmail.com", 
        46739648858L, 0);
        System.out.println(cust.getPhoneNumber());
        System.out.println(cust.getName());
        Cap cap = new Cap("Cap", "New Era", "Small", "Blue", 101.00f, 
        "baseball cap", "Headwear");
        System.out.println(cap.getName());
    }

}
