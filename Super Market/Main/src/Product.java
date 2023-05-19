import java.util.*;
public class Product {
    

    
    
    //Id of the product
    protected String Id;
    //Name of the product
    protected String Name;
    //The category of the product
    protected String Category;
    //The money we paied for the product
    protected double Buying_price;
    //The money we got for the product
    protected double Selling_price;
    protected String Expire_date;
    protected int Items_Number;
    //the quantiy the client want on one Product
    protected int Quantity;
    
    
    public Product(String name, double selling_price, int quantity) {
        Name = name;
        Selling_price = selling_price;
        Quantity = quantity;
    }


    public Product(String category) {
        Category = category;
    }

    
    public Product() {
    }

    public Product(String Id, String Name, String Category, double Buying_price, double Selling_price, String Expire_date, int Items_Number, int Quantity) {
        this.Id = Id;
        this.Name = Name;
        this.Category = Category;
        this.Buying_price = Buying_price;
        this.Selling_price = Selling_price;
        this.Expire_date = Expire_date;
        this.Quantity=Quantity;
          Items_Number--;
       setItems_Number(Items_Number); 
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public void setBuying_price(double Buying_price) {
        this.Buying_price = Buying_price;
    }

    public void setSelling_price(double Selling_price) {
        this.Selling_price = Selling_price;
    }

    public void setExpire_date(String Expire_date) {
        this.Expire_date = Expire_date;
    }

    public void setItems_Number(int Items_Number) {
        this.Items_Number = Items_Number;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    

    public String getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getCategory() {
        return Category;
    }

    public double getBuying_price() {
        return Buying_price;
    }

    public double getSelling_price() {
        return Selling_price;
    }

    public String getExpire_date() {
        return Expire_date;
    }

    public int getItems_Number() {
        return Items_Number;
    }

    public int getQuantity() {
        return Quantity;
    }
    

public void decrease_items(int Items_Number ){
   Items_Number--;
  setItems_Number(Items_Number);
   
}
public void Checkitems(){
    if(getItems_Number()<10){
        System.out.println("The Product "+getName()+" is running out from stock\n");
        Items_Number+=10;
        setItems_Number(Items_Number);
    
}
}


@Override
public String toString() {
    return "Product [Id=" + Id + ", Name=" + Name + ", Category=" + Category + ", Buying_price=" + Buying_price
            + ", Selling_price=" + Selling_price + ", Expire_date=" + Expire_date + ", Items_Number=" + Items_Number
            + ", Quantity=" + Quantity + "]";
} 

} 
    

