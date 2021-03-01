/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.List;
import model.TShirt;

/**
 *
 * @author Leyteris
 */
public class Utility {
    
    public static void printList(List<TShirt> toPrint){
        for (TShirt t : toPrint) {
            System.out.println(t);
        }
    }
    
}
