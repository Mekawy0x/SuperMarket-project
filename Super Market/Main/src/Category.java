import java.util.*;
import java.util.ArrayList;

public class Category extends Product {
protected ArrayList<Product> products=new ArrayList <>();


  public Category(String category) {
    super(category);
}

public Category() {
    }
  
    public void setProducts(ArrayList<Product> Produts) {
        this.products = Products;
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