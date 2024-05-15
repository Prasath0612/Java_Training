import training.stock;
import training.sales;
import training.subpackage.*;
public class ration extends locat
{
    public static void main(String[] args) {
        sample1 s1=new sample1(20,30,15,34,25);
        sample s=new sample(100,100,100,100,100,s1);
        new ration().area(); 
        s.state();
    }
}
class sample extends stock implements street
{
    sample1 s1;
    int rice1=0,sugar1=0,wheat1=0,dhal1=0,oil1=0;
    sample(int rice,int sugar,int wheat,int dhal,int oil,sample1 s1)
    {
        this.s1=s1;
        this.rice1=rice-s1.rice_sold;
        this.sugar1=sugar-s1.sugar_sold;
        this.wheat1=wheat-s1.wheat_sold;
        this.dhal1=dhal-s1.dhal_sold;
        this.oil1=oil-s1.oil_sold;
        super.display_stock(rice1, sugar1, wheat1, dhal1, oil1);
    }
    public void state()
    {
        System.out.println("Tamilnadu");
    }
}
class sample1 extends sales
{
    int rice_sold=0,wheat_sold=0,dhal_sold=0,sugar_sold=0,oil_sold=0;
    sample1(int rice_sold,int wheat_sold,int dhal_sold,int sugar_sold,int oil_sold)
    {
        super(rice_sold,wheat_sold,dhal_sold,sugar_sold,oil_sold);
        this.rice_sold=rice_sold;
        this.wheat_sold=wheat_sold;
        this.dhal_sold=dhal_sold;
        this.sugar_sold=sugar_sold;
        this.oil_sold=oil_sold;
    }
}
