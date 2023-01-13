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

    @Test
    public void checkStockFalse() {
        Inventory inventory = new Inventory();
        inventory.addToStock("Hatt", 100);
        boolean check = inventory.checkStock("Keps");
        assertFalse(check);
    }

    @Test
    public void checkStockTrue() {
        Inventory inventory = new Inventory();
        inventory.addToStock("Keps", 100);
        boolean check = inventory.checkStock("Keps");
        assertTrue(check);
    }

    @Test
    public void shouldAddToStock() {
        Inventory inventory = new Inventory();
        inventory.addToStock("Keps", 53);
        assertEquals("{Keps=53}", inventory.productMap.toString());
    }

    @Test
    public void shouldSetNewProductName() {
        Inventory inventory = new Inventory();
        assertEquals(inventory.setProductName("Hatt 2"), inventory.productName);
    }

    @Test
    public void shouldGetProductName() {
        Inventory inventory = new Inventory();
        inventory.setProductName("Basker");
        String check = inventory.getProductName();
        assertEquals("Basker", check);
    }

    @Test
    public void shouldReturnNullOnGetProductName() {
        Inventory inventory = new Inventory();
        assertNull(inventory.getProductName());
    }
}
