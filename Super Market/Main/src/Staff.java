
import java.util.ArrayList;

public class Staff extends Person {

    protected double Salary;
    protected double Bonus;
    protected PrivateCard PC;
    protected ArrayList<Invoice> invoice;
    // protected ArrayList<Staff>staffs;

    public Staff() {
        super();
    }

    public Staff(String id, String name, String phone, String address, int age, double salary, double bonus) {
        super(id, name, phone, address, age);
        this.Bonus = bonus;
        this.Salary = salary;

    }

    public Staff(String name, String address, String phone, String id, int age, double salary, double bonus,
            PrivateCard pC) {
        super(name, address, phone, id, age);
        Salary = salary;
        Bonus = bonus;
        PC = pC;
    }

    public Staff(double salary, double bonus) {
        Salary = salary;
        Bonus = bonus;
    }

    public Staff(double bonus) {
        Bonus = bonus;
    }

    public Staff(PrivateCard PC) {
        this.PC = new PrivateCard();

    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public double getBonus() {
        return Bonus;
    }

    public void Bonus(ArrayList<Invoice> invoice) {
        double c = 0;
        for (int i = 0; i < invoice.size(); i++) {
            c += invoice.get(i).Finalprice;

        }
        if (c > 100000) {
            Salary += 500;

        } else {
            System.out.print("You don't acheive your bonus this month");
        }
        c = 0;

    }

    @Override
    public String toString() {
        return "Staff [Salary=" + Salary + ", Bonus=" + Bonus + ", PC=" + PC + ", invoice=" + invoice + "]";
    }

}
