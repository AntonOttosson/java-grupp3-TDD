package se.nackademin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


import org.junit.Test;

public class CustomerTest {

    @Test

    public void CustomerSetPhoneNumber() {
        // Tests that setting a new phonenumber on Customer Object works.
        Customer cust = new Customer("Björn", "Adolffsson", "Julgränd", "bjorn@jobb.nu", 46738996655L);
        cust.setPhoneNumber(46709112233L);
        Long obj1 = cust.getPhoneNumber();
        Long obj2 = 46709112233L;
        assertEquals(obj2, obj1);
    }

    @Test

    public void NoTrailingWhitespace() {
        // Test that no trailing whitespace occurs in name-field.
        Customer cust2 = new Customer("Björn", "Adolffsson", "Julgränd", "bjorn@jobb.nu", 46738996655L);
        String name = cust2.getFirstname();
        String LastCharInName = name.substring(name.length() - 1);
        String WhiteSpace = " ";
        assertNotEquals(LastCharInName, WhiteSpace);
    }

    @Test

    public void assertEmailMatchesRegex() {
        // Test that e-mail matches valid regex-pattern.
        Customer cust3 = new Customer("Björn", "Adolffsson", "Julgränd", "bjorn@jobb.nu", 46738996655L);
        String email = cust3.getEmail();
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        assertTrue(email, email.matches(regex));
    }

    @Test
    public void CustomerObjectIsNotNull() {
        Customer cust3 = new Customer("Björn", "Adolffsson", "Julgränd", "bjorn@jobb.nu", 46738996655L);
        assertNotNull(cust3);
    }
}
