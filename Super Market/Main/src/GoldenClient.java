import java.time.LocalDate;
import java.util.Date;

//import java.text.SimpleDateFormat;
//import java.time.Month;
//import java.time.LocalDate;
public class goldenclient extends client {
    private int month;
    private int day;
    private int year;
    private String FavouriteProduct;

    public goldenclient(int day, int month, int year, String FavouriteProduct) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.FavouriteProduct = FavouriteProduct;
    }

    public goldenclient(int day, int month, int year, String FavouriteProduct, String street, String town,
            String homenumber, String ID, String Name, int PhoneNumber, int age) {
        super(street, town, homenumber, ID, Name, PhoneNumber, age);
        this.day = day;
        this.month = month;
        this.year = year;
        this.FavouriteProduct = FavouriteProduct;
    }

    public goldenclient(client c1) {
        this.ID = c1.ID;
        this.Name = c1.Name;
        this.age = c1.age;
        this.PhoneNumber = c1.PhoneNumber;
        this.homenumber = c1.homenumber;
        this.town = c1.town;
        this.street = c1.street;

    }

    public goldenclient() {
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFavouriteProduct() {
        return FavouriteProduct;
    }

    public void setFavouriteProduct(String FavouriteProduct) {
        this.FavouriteProduct = FavouriteProduct;
    }

    public void specialdiscount() {
        Date d3 = new Date();
        invoice i = new invoice();
        if (d3.getDay() == day && d3.getMonth() == month) {
            // invoice i = new invoice();
            i.calc_final_price(10);
            buy.add(i);
        } else if (d3.getDay() == day && d3.getMonth() == month && i.soldproduct.contains(FavouriteProduct)) {
            i.calc_final_price(20);
            buy.add(i);
        }

    }

}
