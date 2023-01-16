package se.nackademin;
import java.util.ArrayList;
import java.util.Collections;


public class Cart {
    private ArrayList<String> itemsInCart = new ArrayList<>();

    /*
    *Fully aware that this could/should be done with ArrayList
    *but I already made it by the time I remembered they exist
    */
    public static String[] addItemToCart(String items[], String newItem){
        int i;
        int n = items.length;
        String newItems[] = new String[n+1];

        for(i = 0; i < n; i++){
            newItems[i] = items[i];
        }
        if(newItem != null){
            newItems[n] = newItem;
        } else{
            newItems[n] = "NaN";
        }
        return newItems;
    }
    
    /*
     * Since the method above is kinda stupid im gonna redo it
     * but with ArrayList instead
     */
    public  ArrayList<String> addNewItemsInCart(String[] newItem){
        for (int i = 0; i < newItem.length; i++) {
            itemsInCart.add(newItem[i]);
        }
        return itemsInCart;
    }

    public ArrayList<String> sortItemsInCart(){
        Collections.sort(itemsInCart);
        return itemsInCart;
    }

}
