/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wamm;


/**
 *
 * @author Lenovo
 */
public class Wamm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//the Categorys in the Market:

    Category c1 = new Category();
    Category c2 = new Category();
    Category c3 = new Category();
    Category c4 = new Category();
    Category c5 = new Category();
    Category c6 = new Category();
    Category c7 = new Category();
    Category c8 = new Category();
    Category c9 = new Category();
    Category c10 = new Category();
    
    
    c1.Category="Milk";
    c2.Category="Fruits and vegetables";
    c3.Category="Drinks";
    c4.Category="Detergents";
    c5.Category="Grocery";    
    c6.Category="Baby care";
    c7.Category="personal Care";
    c8.Category="Frozen Foods";
    c9.Category="chocolates";
    c10.Category="Chipsy";
    
    
    
    inventory i1 =new inventory();
    i1.add_to_inventory(c1);
    i1.add_to_inventory(c2);
    i1.add_to_inventory(c3);  
    i1.add_to_inventory(c4);
    i1.add_to_inventory(c5);    
    i1.add_to_inventory(c6);
    i1.add_to_inventory(c7);   
    i1.add_to_inventory(c8);
    i1.add_to_inventory(c9);
    i1.add_to_inventory(c10);    
      
        System.out.println("The Category in The Market:\n");
  
    for(int g=0;g<i1.Categorys.size();g++){
        System.out.println(i1.Categorys.get(g).getCategory()); 
      
    }  
    Product p1=new Product();
    Product p2=new Product();
    Product p3=new Product();
    Product p4=new Product();  
    Product p5=new Product(); 
    Product p6=new Product();
    Product p7=new Product();
    Product p8=new Product();
    Product p9=new Product();
    Product p10=new Product();
    Product p11=new Product();
    Product p12=new Product();
    Product p13=new Product();
    Product p14=new Product();  
    Product p15=new Product(); 
    Product p16=new Product();
    Product p17=new Product();
    Product p18=new Product();
    Product p19=new Product();
    Product p20=new Product();
    
        System.out.println("");
        System.out.println("");
        System.out.println("The Products in The Category "+c1.Category+":\n");
 
   p1.Name="المراعي" ;
   p1.Id="220624";
   p1.Expire_date="30/12/2024";
   p1.Items_Number=5;
   p1.Checkitems();
   p1.Buying_price=35.35;
   p1.Selling_price=40.35;
   //
   p2.Name="جهينة";
   p2.Id="220625";
   p2.Expire_date="30/12/2024";
   p2.Items_Number=15;
   p2.Checkitems();
   p2.Buying_price=35.95;
   p2.Selling_price=40.95;
   //
   p3.Name="بخيرة";
   p3.Id="220626";
   p3.Expire_date="30/12/2024";
   p3.Items_Number=7;
   p3.Checkitems();
   p3.Buying_price=25.95;
   p3.Selling_price=30.95;
   
   c1.add_to_Category(p1);
   c1.add_to_Category(p2);
   c1.add_to_Category(p3);
   
        
     for(int i=0;i<c1.products.size();i++){
 System.out.println(i+1+"_Name: "+c1.products.get(i).getName()+"\nID: "+c1.products.get(i).getId()+"\nExpire Date: "+c1.products.get(i).getExpire_date()+
         "\nItems Number in Stock: "+c1.products.get(i).getItems_Number()+"\nThe price= "+c1.products.get(i).getSelling_price()+"\nThe Buying Price= "+c1.products.get(i).getBuying_price()+"\n"); 

    }  
  
     
   ////
  //// 
  System.out.println("The Products in The Category "+c2.Category+":\n");
  
  
   p4.Name="Mango";
   p4.Id="22060";
   p4.Expire_date="30/6/2023";
   p4.Items_Number=30;
   p4.Checkitems();
   p4.Buying_price=13;
   p4.Selling_price=18;  
    
   p5.Name="Apple";
   p5.Id="22061";
   p5.Expire_date="30/6/2023";
   p5.Items_Number=30;
   p5.Checkitems();
   p5.Buying_price=10;
   p5.Selling_price=15;  
    
    
   p6.Name="Orange";
   p6.Id="22061";
   p6.Expire_date="30/6/2023";
   p6.Items_Number=30;
   p6.Checkitems();
   p6.Buying_price= 7;
   p6.Selling_price=12;    
   
   
   c2.add_to_Category(p4);
   c2.add_to_Category(p5);
   c2.add_to_Category(p6);
    
    
            
     for(int i=0;i<c2.products.size();i++){
 System.out.println(i+1+"_Name: "+c2.products.get(i).getName()+"\nID: "+c2.products.get(i).getId()+"\nExpire Date: "+c2.products.get(i).getExpire_date()+
         "\nItems Number in Stock: "+c2.products.get(i).getItems_Number()+"\nThe price= "+c2.products.get(i).getSelling_price()+"\nThe Buying Price= "+c2.products.get(i).getBuying_price()+"\n"); 
      
    }  
    ////
   ////
   System.out.println("The Products in The Category "+c3.Category+":\n");
    
   p7.Name="Pepci";
   p7.Id="22070";
   p7.Expire_date="31/12/2025";
   p7.Items_Number=20;
   p7.Checkitems();
   p7.Buying_price=8;
   p7.Selling_price=5;  
    
   p8.Name="Merinda";
   p8.Id="22071";
   p8.Expire_date="31/12/2025";
   p8.Items_Number=20;
   p8.Checkitems();
   p8.Buying_price=5;
   p8.Selling_price=8;  
    
    
   p9.Name="7 up";
   p9.Id="22072";
   p9.Expire_date="31/12/2025";
   p9.Items_Number=20;
   p9.Checkitems();
   p9.Buying_price= 5;
   p9.Selling_price=8;    
   
   
   c3.add_to_Category(p7);
   c3.add_to_Category(p8);
   c3.add_to_Category(p9);
    
    
              
     for(int i=0;i<c3.products.size();i++){
 System.out.println(i+1+"_Name: "+c3.products.get(i).getName()+"\nID: "+c3.products.get(i).getId()+"\nExpire Date: "+c3.products.get(i).getExpire_date()+
         "\nItems Number in Stock: "+c3.products.get(i).getItems_Number()+"\nThe price= "+c3.products.get(i).getSelling_price()+"\nThe Buying Price= "+c3.products.get(i).getBuying_price()+"\n"); 
      
    } 
    ////
   ////
   System.out.println("The Products in The Category "+c4.Category+":\n");
    
   p10.Name="أرياال";
   p10.Id="22080";
   p10.Expire_date="31/12/2025";
   p10.Items_Number=9;
   p10.Checkitems();
   p10.Buying_price=50;
   p10.Selling_price=60;  
    
   p11.Name="برسيل";
   p11.Id="22081";
   p11.Expire_date="31/12/2025";
   p11.Items_Number=22;
   p11.Checkitems();
   p11.Buying_price=60;
   p11.Selling_price=70;  
    
    //فانش بخمسة جنية انسي البقع لو تغسلي بية
   p12.Name=" فانش";
   p12.Id="22082";
   p12.Expire_date="31/12/2025";
   p12.Items_Number=19;
   p11.Checkitems();
   p12.Buying_price= 55;
   p12.Selling_price=65;    
   
   
   c4.add_to_Category(p10);
   c4.add_to_Category(p11);
   c4.add_to_Category(p12);
   
    
              
     for(int i=0;i<c4.products.size();i++){
 System.out.println(i+1+"_Name: "+c4.products.get(i).getName()+"\nID: "+c4.products.get(i).getId()+"\nExpire Date: "+c4.products.get(i).getExpire_date()+
         "\nItems Number in Stock: "+c4.products.get(i).getItems_Number()+"\nThe price= "+c4.products.get(i).getSelling_price()+"\nThe Buying Price= "+c4.products.get(i).getBuying_price()+"\n"); 
      
    } 
    
    
    
    }


}