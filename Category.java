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
public class Category extends Product {


protected ArrayList<Product> products=new ArrayList <>();


  public Category(String category) {
    super(category);
}

public Category() {
    }
  
    public void setProducts(ArrayList<Product> Produts) {
        this.products = products;
    }

    public ArrayList<Product> getproducts() {
        return products;
    }
    
    public void add_to_Category(Product p){
        
    
    products.add(p); 
}

    @Override
    public String toString() {
        return "Category [products=" + products + "]";
    }


 


   


    
}


 


   


    
