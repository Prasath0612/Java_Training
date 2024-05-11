import java.util.*;
class canteen
{
    static
    {
        System.out.println("Welcome to ABC Canteen");
        System.out.println("Order your snacks here");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of items you want to order: " );
        int no_of_item=sc.nextInt();
        System.out.println("Menu items");
        System.out.println("\n 1.Hot Drinks \n 2.Cold Drinks \n 3.Biscuits \n 4.Puffs");
        int item_no[]=new int[no_of_item];
        int temp=0,bill=0;
        int total_amt[]=new int[no_of_item];
        for (int i=0; i<no_of_item; i++)
        {
            System.out.println("Enter the item number"+(i+1)+"");
            item_no[i]=sc.nextInt();
            order ord=new order(item_no[i]);
            total_amt[i]=ord.total(item_no[i]);
            bill=temp+total_amt[i];
            temp=total_amt[i];
        }
        System.out.println("-----------------------------");
        System.out.println("lnTotal Amount :"+ bill);
        System.out.println("\nAmount Received :");
        int amt_rec=sc.nextInt();
        int balance=amt_rec-bill;
        System.out.println("\nBalance Returned :"+balance);
    }
}
interface rate
{
    int tea_rate=15,coffee_rate=20,milk_rate=25;
    int lemonj_rate=25,applej_rate=50,mangoj_rate=60;
    int hifi_rate=5,happy_rate=10,mb_rate=10;
    int mushrooms_rate=25,eggs_rate=20,chicken_rate=50,veg_rate=20;

}
class order implements rate
{
    int item_no=0;
    int tea=0,coffee=0,milk=0,lemonj=0,applej=0,mangoj=0,hifi=0,happy=0,mb=0,mushroom=0,egg=0,chicken=0,veg=0,tot=0;
    Scanner sc=new Scanner(System.in);
    order(int item_no )
    {
        this.item_no=item_no;
        this.order_item(item_no);
    }
    public void order_item(int item_no)
    {    
        if(item_no==1)
        {
            System.out.println("No of Tea :");
            tea=sc.nextInt();
            System.out.println("No of Coffee :");
            coffee=sc.nextInt();
            System.out.println("No of Milk :");
            milk=sc.nextInt();
        }
        else if(item_no==2)
        {
            System.out.println("No of Lemon Juice :");
            lemonj=sc.nextInt();
            System.out.println("No of Apple Juice :");
            applej=sc.nextInt();
            System.out.println("No of Mango Juice :");
            mangoj=sc.nextInt();
        }
        else if(item_no==3)
        {
            System.out.println("No of Hifi Biscuts :");
            hifi=sc.nextInt();
            System.out.println("No of Happy Happy Biscuts :");
            happy=sc.nextInt();
            System.out.println("No of Milk Bikis Biscuts :");
            mb=sc.nextInt();
        }
        else if(item_no==4)
        {
            System.out.println("No of Veg Puffs :");
            veg=sc.nextInt();
            System.out.println("No of Mushroom Puffs :");
            mushroom=sc.nextInt();
            System.out.println("No of Egg Puffs :");
            egg=sc.nextInt();
            System.out.println("No of Chicken Puffs :");
            chicken=sc.nextInt();
        }
        else
        {
            System.out.println("Please enter the correct item number");
        }
    }
    public int total(int item_no)
    {
        if(item_no==1)
        {
            tot=((tea*tea_rate)+(coffee*coffee_rate)+(milk*milk_rate));
            return tot;
        }
        else if(item_no==2)
        {
            tot=((applej*applej_rate)+(lemonj*lemonj_rate)+(mangoj*mangoj_rate));
            return tot;
        }
        else if(item_no==3)
        {
            tot=((hifi*hifi_rate)+(happy*happy_rate)+(mb*mb_rate));
            return tot;
        }
        else if(item_no==4)
        {
            tot=((veg*veg_rate)+(mushroom*mushrooms_rate)+(egg*eggs_rate)+(chicken*chicken_rate));
            return tot;
        }
        else 
        {
            return 0;
        }
    }
}
