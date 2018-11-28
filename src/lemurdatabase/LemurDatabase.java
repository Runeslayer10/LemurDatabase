/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lemurdatabase;
import javax.swing.*;
/**
 *
 * @author blhad3491
 */
public class LemurDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String numInput, lemurChoice ;
        int numOfLemurs;
        
        numInput = JOptionPane.showInputDialog("Please enter the number of Lemurs you would "
                + "like to add to the list.");
        
        numOfLemurs = Integer.parseInt(numInput);
        
        lemurChoice = JOptionPane.showInputDialog("Please enter the type of Lemur to add:\n"
                + "1. - Tree Lemur\n"
                + "2. - Desert Lemur\n"
                + "3. - Jungle Lemur");
        
        
      
    }
}
