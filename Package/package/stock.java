package training;

public class stock 
{
    int rice=0,sugar=0,wheat=0,dhal=0,oil=0;
    public void display_stock(int rice,int sugar,int wheat,int dhal,int oil)
    {
        System.out.println("Stock Available Details");
        System.out.println("Rice: "+rice+" kg");
        System.out.println("Sugar: "+sugar+" kg");
        System.out.println("Wheat: "+wheat+" kg");
        System.out.println("Dhal: "+dhal+" kg");
        System.out.println("Oil: "+oil+" kg");
    }
}
