package se.nackademin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;

        int choice;
        while(mainLoop){
            System.out.println("\nWebshop Main Menu\n");
            System.out.print("1. New Customer Email \n");
            System.out.print("2. New Vendor\n");
            System.out.print("3. New Customer\n");
            System.out.print("0. Exit");
            System.out.print("\nEnter Your Menu Choice: ");
            System.out.print("\n");

            choice = input.nextInt();

            switch(choice){
                case 1:
                    Customer customer = new Customer();
                    customer.setEmail("johan@bygg.nu");
                    System.out.println(customer.getEmail());
                    Thread.sleep(1000);
                    break;
                case 2:
                    Inventory inventory = new Inventory();
                    inventory.setNewVendor("Postnord");
                    System.out.println(inventory.getVendorName(0));
                    Thread.sleep(1000);
                    break;
                case 3:
                    Customer customer2 = new Customer("Johan", "Efternamn", "Minadress 2", "Johan@bygg.nu", 07023546L);                    System.out.println(customer2.getCustomerList());
                    Thread.sleep(1000);
                    break;
                case 0:
                    mainLoop = false;
                default : 
                    break;
            }
    }
}

}
