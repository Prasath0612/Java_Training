import java.util.*;
public class sleep1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the username: ");
        String user=sc.nextLine();
        System.out.print("Enter the password: ");
        String pass=sc.nextLine();
        sample s=new sample(user,pass);
        s.start();
    }
}
class sample extends Thread
{
    Scanner sc=new Scanner(System.in);
    String user="",pass="";
    sample(String user,String pass)
    {
        this.user=user;
        this.pass=pass;
    }
    public void run()
    {
        System.out.println("Username: "+user);
        for(int i=1;i<10;i++)
        {
            if(pass.equals("i-exceed"))
            {
                System.out.println("You are logged in");
                break;
            }
            else
            {
                System.out.println("Password is incorrect , Enter valid password");
                if(i%3==0)
                {
                    System.out.println("You have reached the limit so wait for sometime");
                    try
                    {
                        Thread.sleep(5000);
                    }catch(Exception e){}
                }
                else
                {
                    System.out.println("Re enter the password");
                    pass=sc.nextLine();
                    System.out.println("-----------------");
                }
            }
        }
    }
}
