public class PrivateCard extends Staff{
    private String Username;
    private String code;
    private String PointOfSale;
    
    public PrivateCard(){
    }

    public PrivateCard(String username, String code, String pointOfSale) {
        this.Username = username;
        this.code = code;
        this.PointOfSale = pointOfSale;
    }
    
    public PrivateCard(String id, String name, String phone, String address, int age, double salary, double bonus,
            String username, String code, String pointOfSale) {
        super(id, name, phone, address, age, salary, bonus);
        Username = username;
        this.code = code;
        PointOfSale = pointOfSale;
    }

    public String getUsername() {
        return Username;
    }
    public void setUsername(String username) {
        Username = username;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getPointOfSale() {
        return PointOfSale;
    }
    public void setPointOfSale(String pointOfSale) {
        PointOfSale = pointOfSale;
    }
    // public static void method(int x){
    //     x++;
    //     System.out.println(x);
    // }
    @Override
    public String toString() {
        return "PrivateCard [Username=" + Username + ", code=" + code + ", PointOfSale=" + PointOfSale + "]";
    }

    
}
