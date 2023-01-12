package exercise;

public class Main {

    public static void main(String[] args) {
        // Test that creating Objects and retrieving info works.
        Customer cust = new Customer("Dennis", "Bygatan 15", "dennis.lunnelid@gmail.com", 46739648858L);
        System.out.println(cust.getPhoneNumber());
        System.out.println(cust.getName());
        Caps cap = new Caps("Keps", "New Era", "Small", "Blue", 101.00f);
        System.out.println(cap.getName());
    }

}
