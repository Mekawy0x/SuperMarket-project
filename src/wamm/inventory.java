/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wamm;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class inventory extends Category {
    ArrayList<Category> Categorys=new ArrayList <>();

      public inventory() {
    }
    
      public void setcategorys(ArrayList<Category> Categorys) {
        this.Categorys=Categorys;
    }

    public ArrayList<Category> getcategorys(){
        return Categorys;
    }

    public void add_to_inventory(Category c){
        
    
Categorys.add(c);

    
   
            
            
    }   
}
