package se.nackademin;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CartTest {
    
    @Test
    public void shouldAddItemToCart(){
        String[] currenctCart = new String[]{"item1","item2","item3"};
        String newItem = "item4";

        String[] exp = new String[]{"item1","item2","item3","item4"};
        String[] output = Cart.addItemToCart(currenctCart, newItem);
        assertArrayEquals(exp, output);
    }

    @Test
    public void shouldNotAllowAddNullToCart(){
        String[] currenctCart = new String[]{"item1","item2","item3"};
        String newItem = null;

        String[] exp = new String[]{"item1","item2","item3","NaN"};
        String[] output = Cart.addItemToCart(currenctCart, newItem);
        assertNotNull(exp[exp.length-1], output[output.length-1]);
    }
    
    @Test
    public void shouldAddNewItemsInCart(){
        String[] newItem = new String[]{"item1","item2","item3"};
        Cart newCart = new Cart();
        ArrayList<String> out = newCart.addNewItemsInCart(newItem);
        
        assertEquals(Arrays.asList("item1","item2","item3"), out);
    };

    @Test
    public void shouldSortCart(){
        String[] newItem = new String[]{"item2","item3","item1"};
        Cart newCart = new Cart();
        newCart.addNewItemsInCart(newItem);
        ArrayList<String> sortedList = newCart.sortItemsInCart();
        assertEquals(Arrays.asList("item1","item2","item3"), sortedList);
    }
}