import java.util.LinkedList;
import java.util.Scanner;
public class miprod {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        value v=new value();
        System.out.print("Welcome to mi world ");
        v.disp_prod();
        System.out.print("Enter the choice: ");
        int choice=0;
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                v.disp_mob();
                v.disp_mobprice();
                break;
            case 2:
                v.disp_headset();
                v.disp_hsprice();
                break;
        }
        System.out.println(v.products.contains("Note10"));
    }
}
class value 
{
    LinkedList<String> products=new LinkedList<String>()
    {
        {
            add("Mobile");
            add("Headset");
        }
    };
    LinkedList<String> mobile=new LinkedList<String>()
    {
      {
            add("Note 9 pro");
            add("Note10");
            add("Note 10 pro");
            add("Note 11 pro");
      }
    };
    LinkedList<Integer> mob_price=new LinkedList<Integer>()
    {
        {
            add(15000);
            add(16500);
            add(19000);
            add(22000);
        }
    };
    LinkedList<String> headset=new LinkedList<String>()
    {
        {
            add("Wired");
            add("Bluetooth");
            add("Airdopes");
            add("Overhead");
        }
    };
    LinkedList<Integer> h_price=new LinkedList<Integer>()
    {
        {
            add(600);
            add(1000);
            add(3000);
            add(2500);
        }
    };

    public void disp_prod()
    {
        for (String prod : products) {
            System.out.println(prod);
        }
    }
    public void disp_mob()
    {
        for (String mob : mobile) {
            System.out.println(mob);
        }
    }
    public void disp_mobprice()
    {
        for (Integer mbp : mob_price) {
            System.out.println(mbp);
        }
    }
    public void disp_headset()
    {
        for (String hs : headset) {
            System.out.println(hs);
        }
    }
    public void disp_hsprice()
    {
        for (Integer hp : h_price) {
            System.out.println(hp);
        }
    }
   
}