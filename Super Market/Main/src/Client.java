import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;


public class Client extends Person {
    protected String street;
    protected String town;
    protected String homenumber;
    protected ArrayList<Invoice>Buys= new ArrayList<>();

    public Client(String name, String phone, String id, int age, String street, String town, String homenumber) {
        super(name, phone, id, age);
        this.street = street;
        this.town = town;
        this.homenumber = homenumber;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getHomenumber() {
        return homenumber;
    }

    public void setHomenumber(String homenumber) {
        this.homenumber = homenumber;
    }

    public ArrayList<Invoice> getBuys() {
        return Buys;
    }

    public void setBuys(ArrayList<Invoice> buys) {
        Buys = buys;
    }
    public void addInvoice(Invoice invoice) {
        Buys.add(invoice);}


    
    

    


//     public void checkregistry(){
//         LocalDate currDate= LocalDate.now();
//         LocalDate later = LocalDate.of(currDate.getYear()+5,currDate.getMonthValue(), currDate.getDayOfMonth());
//         int x= Period.between(later, currDate ).getYears();
//         if(x==5){
//             goldenclient g1 = new goldenclient(this.street,this.town,this.homenumber,this.ID,this.Name,this.PhoneNumber,this.age);   
//         }
        
        

//     }

//      // to cheak the invoice more than 4000 or not if right make discount 5% in this month
     
//     public boolean checkinvoiceprice(){
        
//         Date d5 = new Date();
//         //x :for evey month
//         //total: + final price invoices for array kolaha
//         double x=0,total=0;
//         boolean y=false;
//         getBuy().add(new Invoice());
//         for(int i=0;i<buy.size();i++){
//             x=(x+(getBuy().get(i).getfinalPrice()));   
//         }
//         if(d5.getDay()==1)
           
//             {total=total+(x-total);

//             y=false;}

//             else if (x>4000 && d5.getDay()!=1) 
//             {y=true;}

//             return y;
//         }
        
//    // create new invoice 

//     public Invoice createinvoice(){
        
        
//         if(checkinvoiceprice()){
            
//             if(new Date().getDay()!=1){
//                 getBuy().add(new Invoice());
//                 getBuy().get(0).calc_final_price(5);
                
              
//             }  
//         }
//         else{
        
//         getBuy().add(new Invoice());
        
//         }
//         return getBuy().get(0);
//     }   
}
