package kniffel;
import java.util.*;
public class dice_shaker extends dice_container {
    
    public dice_shaker() {
        super(new ArrayList<dice>(Arrays.asList()));     
    }
    void add_existing_dice(dice dice) { 
        set_dices_contained(dice);
    } 
    void add_new_dice() { 
        dice addDice = new dice();
        add_existing_dice(addDice);  
    }   
    public void roll_all_dices() {
      
        add_new_dice();
        add_new_dice();
        add_new_dice();
        
        add_new_dice();
        add_new_dice();
        add_new_dice();
        
       //OR  List<dice> diceCopy = get_dices_contained();
        for (int i=0;i<dices_contained.size();i++) 
        {
           dices_contained.get(i).roll();               
        }  
    } 
       
    
   
}//End of Class dice_shaker