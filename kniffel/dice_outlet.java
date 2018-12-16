package kniffel;
import java.util.*;
public class dice_outlet extends dice_container {
   public dice_shaker dicheShakerObj;
      public dice_outlet( List<dice>  dices_contained) {
       super(dices_contained);
        dice_shaker dicheShakerObj = new dice_shaker();
    }
    public void discard_dice(dice inObj) {
        // TODO implement here
        for (int i=0;i<=dices_contained.size()-1;i++) 
            {
                if ( dices_contained.get(i).equals(inObj) ){
                    dice diceNull = new dice();
                      dices_contained.set(i,diceNull); //Ersatz die Wuerfel durch dem Nullobj.
                }
            }
    }
    public List<dice> get_posible_results() { //???????????, weil ich die get_dices_contained Function, die von father vererbt hat. sehen kann ?????////
     
        List<dice> getDicecontent = get_dices_contained();
        return dices_contained;  
    }
    
//    public void remove_nulls_from_array_result() { //Function to clean up the array but be careful the index will be changed
//        // TODO implement here
//        for (int i=0;i<=dices_contained.size()-1;i++)
//        {
//            if ( dices_contained.get(i).get_last_result() == 0  && dices_contained.get(i).get_side() == 0){
//                dices_contained.remove(i);
//         
//            }
//        }
//            
//    } 
    
    public void use_result() {
        // TODO implement here
    }
    
    @Override
    void add_existing_dice(dice dice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void add_new_dice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

} //EOF
