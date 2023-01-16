package se.nackademin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HatTest {
    

    @Test
    public void assertNamenotNull(){
        Hat ahat = new Hat("Slick top hat", "Fancy hat company", "XL", "purple", 
        250.5f, "Hat", "Headwear");

        assertNotNull(ahat.name);
      
    }

    @Test
    public void assertBrandnotNull(){
        Hat ahat = new Hat("Slick top hat", "Fancy hat company", "XL", "purple", 
        250.5f, "Hat", "Headwear");

        assertNotNull(ahat.brand);
    }

    @Test
    public void assertSizenotNull(){
        Hat ahat = new Hat("Slick top hat", "Fancy hat company", "XL", "purple", 
        250.5f, "Hat", "Headwear");

        assertNotNull(ahat.size);
    }

    @Test
    public void assertColornotNull(){
        Hat ahat = new Hat("Slick top hat", "Fancy hat company", "XL", "purple", 
        250.5f, "Hat", "Headwear");

        assertNotNull(ahat.color);
    }

    @Test
    public void assertPricenotNull(){
        Hat ahat = new Hat("Slick top hat", "Fancy hat company", "XL", "purple", 
        250.5f, "Hat", "Headwear");

        assertNotNull(ahat.price);
    }

    @Test
    public void assertProductnameNotNull(){
        Hat ahat = new Hat("Slick top hat", "Fancy hat company", "XL", "purple", 
        250.5f, "Hat", "Headwear");

        assertNotNull(ahat.productname);
    }

    @Test
    public void assertProducttypeNotNull(){
        Hat ahat = new Hat("Slick top hat", "Fancy hat company", "XL", "purple", 
        250.5f, "Hat", "Headwear");

        assertNotNull(ahat.producttype);
    }

    @Test 
    public void assertIsheadwear(){
        Hat ahat = new Hat("Slick top hat", "Fancy hat company", "XL", "purple", 
        250.5f, "Hat", "Headwear");
        assertEquals("Headwear", ahat.producttype);
    }

}