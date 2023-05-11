/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wamm;

import java.util.HashMap;

/**
 *
 * @author Lenovo
 */
public class pppppp {
        //Name of type of products
    protected String Categories;
    //Numper of categories
    protected int Number_categories;
    //Number of products in one categorie 
    protected int Number_products;
    protected String expire_date_in_inventory;
    HashMap <String,Integer> product_capisty=new HashMap();
    
            public inventory(){
                
            }
    public inventory(String Categories, int Number_categories, int Number_products) {
        this.Categories = Categories;
        this.Number_categories = Number_categories;
        this.Number_products = Number_products;
    }

    public void setCategories(String Categories) {
        this.Categories = Categories;
    }

    public void setNumber_products(int Number_products) {
        this.Number_products = Number_products;
    }

    public void setNumber_categories(int Number_categories) {
        this.Number_categories = Number_categories;
    }

    public void setExpire_date_in_inventory(String expire_date_ininventory) {
        this.expire_date_in_inventory = expire_date_ininventory;
    }

    public String getCategories() {
        return Categories;
    }

    public int getNumber_categories() {
        return Number_categories;
    }

    public int getNumber_products() {
        return Number_products;
    }

    public String getExpire_date_in_inventory() {
        return expire_date_in_inventory;
    }
    
   public String Alert1(){
       if(product_capisty.containsValue(9)){
          return "order vendor";
       //order_vendor();
       }
       else{
           return null;
       }
   }
    
}
