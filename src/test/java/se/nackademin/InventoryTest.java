package se.nackademin;

import org.junit.Test;
import static org.junit.Assert.*;
/* import org.hamcrest.collection.IsMapContaining;

import java.util.HashMap;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat; */

public class InventoryTest {
    Inventory inventory = new Inventory();

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
        boolean checkVendor = inventory.checkVendorAvailability();
        assertTrue(checkVendor);
    }

    @Test
    public void shouldCheckVendorAvailanilityFalse() {
        boolean checkVendor = inventory.checkVendorAvailability();
        assertFalse(checkVendor);
    }
}
