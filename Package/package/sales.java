package training;
public class sales {
    int rice_sold=0,wheat_sold=0,dhal_sold=0,sugar_sold=0,oil_sold=0;
    public sales(int rice_sold,int wheat_sold,int dhal_sold,int sugar_sold,int oil_sold)
    {
        this.rice_sold=rice_sold;
        this.wheat_sold=wheat_sold;
        this.dhal_sold=dhal_sold;
        this.sugar_sold=sugar_sold;
        this.oil_sold=oil_sold;
        this.display_sales();
    }
    public void display_sales()
    {
        System.out.println("Sales Details");
        System.out.println("Rice sold: "+rice_sold+" kg");
        System.out.println("Sugar sold: "+sugar_sold+" kg");
        System.out.println("Wheat sold: "+wheat_sold+" kg");
        System.out.println("Dhal sold: "+dhal_sold+" kg");
        System.out.println("Oil sold: "+oil_sold+" kg");
    }
}
