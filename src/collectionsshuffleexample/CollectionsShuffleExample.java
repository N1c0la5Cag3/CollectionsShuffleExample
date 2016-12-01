/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collectionsshuffleexample;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author luoos2514
 */
public class CollectionsShuffleExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        int[] poop = new int [100];
        
        /*Fills the ArrayList with int values from 0 - 100 inclusive and 
        displays it in the output window*/
        System.out.println("Unshuffled List: ");
        for (int i = 0; i <= 100; i++){
            list.add(i);
            System.out.print(list.get(i) + " ");
        }
        
        //Shuffles the ArrayList
        Collections.shuffle(list);
        
        //Displays the ArrayList after its elements have been shuffled
        System.out.println("\n\nShuffled List: ");
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
    
}
