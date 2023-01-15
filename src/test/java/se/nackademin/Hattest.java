package se.nackademin;

import static org.junit.Assert.assertSame;

import org.junit.Test;

public class Hattest {
    
    @Test
    public void assertpriceisfloat(){
        Hat hat = new Hat("Cool cap", "Nike", "XL", "Red", 105, 
        "Red trucker cap", "Headwear");
        
        assertSame(float.class, hat.price);
    }
    @Test
    public void assertisheadwear(){
        Hat hat = new Hat("Top hat", "Fancy", "M", "black"
        , 5000, "A top hat", "Headwear");
        String hw = "Headwear";
        assertSame("Not headwear", hat.producttype, hw);
    }


}
