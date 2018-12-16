package kniffel;
import java.util.*;
public  class dice {
    private int sides;
    private int last_result;
   public dice() {
        this.sides = 0;
        this.last_result = 0;       
    } //End of constructor
   
    public void roll() {
        this.last_result =(int)((Math.random()*6)+1);
        this.sides =(int)((Math.random()*6)+1); 
    }

    public int get_last_result() {
        return this.last_result;
    }
    public int get_side() {
        return this.sides;
    }

}//EOF