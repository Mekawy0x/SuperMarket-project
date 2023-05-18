import java.time.LocalDate;
import java.util.*;
import java.time.LocalDate;
import java.time.Period;
public class Person {
    protected String Id;
    protected String Name;
    protected String Phone;
    protected String Address;
    protected int Age;
    protected int year;
    protected int day;
    protected int month;

    public Person(){}

    
    public Person(String id, String name, String phone, String address, int age) {
        Id = id;
        Name = name;
        Phone = phone;
        Address = address;
        Age = age;
    }









    public Person(String name, String phone, String id, int age) {
        Id = id;
        Name = name;
        Phone = phone;
        Age = age;
    }









    public String getId() {
        return Id;
    }
    public void setId(String Id) {
        this.Id = Id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getPhone() {
        return Phone;
    }
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String Address) {
        this.Address = Address;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int Age) {
        this.Age = Age;
    }
    
    public int modifyAge(int year,int month,int day){
    LocalDate currDate= LocalDate.now();
    LocalDate birthDate = LocalDate.of(year,month, day);
    int age= Period.between(birthDate, currDate ).getYears();
    setAge(age);
    return getAge();

    }

    @Override
    public String toString() {
        return "Person [Id=" + Id + ", Name=" + Name + ", Phone=" + Phone + ", Address=" + Address + ", Age=" + Age
                + ", year=" + year + ", day=" + day + ", month=" + month + "]";
    }

    
            
    
    
    
    
    
}
