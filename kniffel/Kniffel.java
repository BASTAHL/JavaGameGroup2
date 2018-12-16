/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kniffel;

import java.util.List;

/**
 *
 * @author Nour.muj
 */
public class Kniffel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dice_shaker diceShaker = new dice_shaker();
        diceShaker.roll_all_dices();
        List<dice> getDice = diceShaker.get_dices_contained();
        for (int i=0;i<getDice.size();i++) 
          {
                System.out.println("Last_Result: " + getDice.get(i).get_last_result());
                System.out.println("Side Result: " +getDice.get(i).get_side());
                System.out.println("================================================================");
                
          }

       dice_outlet diceOutlet = new dice_outlet(getDice);
       diceOutlet.discard_dice(getDice.get(0));
       //diceOutlet.discard_dice(getDice.get(1));
       diceOutlet.discard_dice(getDice.get(2));
       //diceOutlet.discard_dice(getDice.get(3));
       diceOutlet.discard_dice(getDice.get(4));
       //diceOutlet.discard_dice(getDice.get(4));

        List<dice> getDicardArr = diceOutlet.get_posible_results();

          for (int i=0;i<getDicardArr.size();i++) //man kann getDicardArr durch getDice ersetzen, weil beide gleich sind.
            {
                
                System.out.println("Last_Result After Remvoe: " + getDicardArr.get(i).get_last_result());
                System.out.println("Side Result After Remove: " +getDicardArr.get(i).get_side());
                System.out.println("================================================================");      
            }    

//           for (int i=0;i<getDicardArr.size();i++) 
//            {
//                diceOutlet.remove_nulls_from_array_result();
//                System.out.println("********************************************************************");      
//                System.out.println("Last_Result After Cleaning: " + getDicardArr.get(i).get_last_result());
//                System.out.println("Side Result After Cleaning: " +getDicardArr.get(i).get_side());
//                System.out.println("********************************************************************");      
//               
//            }

        
    }
    
}
