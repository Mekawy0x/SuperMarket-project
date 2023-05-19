import java.util.*;

public class Invoice {
  // look at data base and customer and item and system and every proccess to
  // staff it will added to him to achive his target to udate salary
  Date d = new Date();
  protected String date = d.toString();

  ArrayList<Product> soldProducts;

  protected double finalPrice;// will update by discount

  protected Staff staff;// will equal who sell to client

  // number of cacher which member of staff who use it

  public void add_product(ArrayList<Product> products) {

    this.soldProducts = products;
  }

  public Invoice(ArrayList<Product> soldProducts) {

    this.soldProducts = soldProducts;

  }

  public ArrayList<Product> getSoldproducts() {
    return soldProducts;
  }

  public double calc_initial_price() {
    // use check method to make a disc or no if 1 make for a product if two use it
    // in second method to calc final price
    double c = 0.0;
    for (int i = 0; i < soldProducts.size(); i++) {
      // sold_Products.=new Product();/*put every item and attriputes *///if
      // system.getdisc.p1.selling
      c += soldProducts.get(i).Selling_price * soldProducts.get(i).Quantity;

    }
    finalPrice = c;
    return c;
  }

  public double calc_final_price(int discount) {
    finalPrice = finalPrice - (finalPrice * discount / 100);
    return finalPrice;
  }

  public Date getD() {
    return d;
  }

  public void setD(Date d) {
    this.d = d;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public double getfinalPrice() {
    return finalPrice;
  }

  public void setFinalPrice(double finalPrice) {
    finalPrice = finalPrice;
  }

  public Staff getStaff() {
    return staff;
  }

  public void setStaff(Staff staff) {
    this.staff = staff;
  }

  public void printInvoice() {
    System.out.println(date.toString());
    for (int i = 0; i < soldProducts.size(); i++) {
      System.out.println(soldProducts.get(i).Name + "*" + soldProducts.get(i).Quantity + " = "
          + soldProducts.get(i).Selling_price + "*" + soldProducts.get(i).Quantity);

    }
    System.out.println("the intial price = " + calc_initial_price());
    System.out.println("the final price = " + getfinalPrice());
  }
  // method to make invoice it will be void and i will print final print and all
  // objects from product that have name of product and initial price and final
  // price after dic

}
