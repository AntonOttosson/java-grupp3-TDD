package se.nackademin;

import org.junit.Test;
import static org.junit.Assert.*;

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

/*     @Test
    public void shouldAddToStock() {
        Inventory inventory = new Inventory();
        assertThat(inventory.addToStock("Beanie", 100), IsMapContaining.hasEntry("Beanie", 100));
    } */
}
