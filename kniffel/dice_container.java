package kniffel;
import java.util.*;
 public abstract class dice_container {  
     
    public List<dice> dices_contained = new ArrayList<dice>();
    
    public dice_container( List<dice>  dices_contained) {
           this.dices_contained = dices_contained;
    }
    
   abstract void add_existing_dice(dice dice);
   abstract void add_new_dice();
   
   public List<dice> get_dices_contained(){
        return dices_contained;
    }
   public void set_dices_contained(dice dice){
       dices_contained.add(dice);
   }

} // End of Class