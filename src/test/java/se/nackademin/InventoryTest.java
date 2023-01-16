package se.nackademin;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;
import org.hamcrest.collection.IsEmptyCollection;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

//import java.io.IOException;

import org.junit.Rule;

public class InventoryTest {
    Inventory inventory = new Inventory();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldTestNullValues() {
        Inventory inventoryy = new Inventory(null, null, null, false, 0);
        String vendorName = inventoryy.getVendorName(0);
        assertNull(vendorName);
    }

    @Test
    public void shouldTestListIsEmpty() {
        assertThat(inventory.vendorList, IsEmptyCollection.empty());
    }

    @Test
    public void shouldTestMapIsCreatedAndEmpty() {
        assertThat(inventory.productMap.size(), is(0));
    }

    @Test
    public void shouldTestListIsCreated() {
        assertThat(inventory.vendorList.size(), is(0));
    }

    @Test
    public void shouldTestVendorNameEqual() {
        Inventory inventoryy = new Inventory("Postnord", "Hat", true, true, 100);
        String vendorName = inventoryy.getVendorName(0);
        assertEquals("Postnord", vendorName);
    }

    @Test
    public void shouldTestVendorNameNotEqual() {
        Inventory inventoryy = new Inventory("Postnord", "Hat", true, true, 100);
        String vendorName = inventoryy.getVendorName(0);
        assertNotEquals("Instabox", vendorName);
    }

    @Test
    public void shouldTestCorrectProductName() {
        Inventory inventoryy = new Inventory("Postnord", "Hat", true, true, 100);
        String productName = inventoryy.getProductName();
        assertEquals("Hat", productName);
    }

    @Test
    public void shouldTestNotExistingProductName() {
        Inventory inventoryy = new Inventory("Postnord", "Hat", true, true, 100);
        String productName = inventoryy.getProductName();
        assertNotEquals("Beanie", productName);
    }

    @Test
    public void shouldTestCorrectAmount() {
        Inventory inventoryy = new Inventory("Postnord", "Hat", true, true, 100);
        int amount = inventoryy.getAmount();
        assertEquals(100, amount);
    }

    @Test
    public void shouldTestWrongAmount() {
        Inventory inventoryy = new Inventory("Postnord", "Hat", true, true, 100);
        int amount = inventoryy.getAmount();
        assertNotEquals(200, amount);
    }

    @Test
    public void checkStockFalse() {
        inventory.addToStock("Hatt", 100);
        boolean check = inventory.checkStock("Keps");
        assertFalse(check);
    }

    @Test
    public void checkStockTrue() {
        inventory.addToStock("Keps", 100);
        boolean check = inventory.checkStock("Keps");
        assertTrue(check);
    }

    @Test
    public void shouldAddToStock() {
        inventory.addToStock("Keps", 53);
        assertEquals("{Keps=53}", inventory.productMap.toString());
    }

    @Test
    public void shouldSetNewProductName() {
        assertEquals(inventory.setProductName("Hatt 2"), inventory.productName);
    }

    @Test
    public void shouldGetProductName() {
        inventory.setProductName("Basker");
        String check = inventory.getProductName();
        assertEquals("Basker", check);
    }

    @Test
    public void shouldReturnNullOnGetProductName() {
        assertNull(inventory.getProductName());
    }

    @Test
    public void shouldSetNewVendor() {
        String vendor = inventory.setNewVendor("Postnord");
        assertEquals("Postnord", vendor);
    }

    @Test
    public void shouldGetVendorName() {
        inventory.setNewVendor("Postnord");
        String vendorName = inventory.getVendorName(0);
        assertEquals("Postnord", vendorName);
    }

    @Test
    public void shouldCheckVendorAvailabilityTrue() {
        inventory.setNewVendor("Postnord");
        String vendorName = inventory.getVendorName(0);
        boolean checkVendor = inventory.checkVendorAvailability(vendorName);
        assertTrue(checkVendor);
    }

    @Test
    public void shouldCheckVendorAvailabilityFalse() {
        inventory.setNewVendor("");
        String vendorName = inventory.getVendorName(0);
        boolean checkVendor = inventory.checkVendorAvailability(vendorName);
        assertFalse(checkVendor);
    }
}
