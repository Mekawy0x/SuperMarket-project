public class inventory extends Category {
    protected ArrayList<Category> Categorys;
    
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
