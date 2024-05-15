import java.util.*;
public class threadjoin {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the username: ");
        String user=sc.nextLine();
        System.out.println("Enter the password: ");
        String pass=sc.nextLine();
        login l=new login(user,pass);
        Thread t=new Thread(l);
        user_details ud=new user_details();
        Thread t2=new Thread(ud);
        t.start();
        t2.start();
       
        
    }
}
class login extends Thread
{
    String user="",pass="";
    int c=0;
    Scanner sc=new Scanner(System.in);
    Thread t5=new Thread();
    login(String user,String pass)
    {
        this.user=user;
        this.pass=pass;
    }
    public void run()
    {
        // try
        // {
        //      t5.join();
        //  }catch(InterruptedException e){}
        System.out.println("Username :"+user);
        System.out.println("Password: "+pass);
        System.out.println("Username and password is updated");
    }
}

class user_details extends Thread
{
    Scanner sc=new Scanner(System.in);
    String fname="Mukesh",lname="R",city="Tirupur";
    int age=21;
    long mobno=9834753678l;
    public void run()
    {
        Thread t1=new Thread();
        try
        {
            t1.join();
            Thread.sleep(3000);        
            System.out.println("User Details Updated");
            System.out.println("First Name: "+fname);
            System.out.println("Last Name: "+lname);
            System.out.println("Age: "+age);
            System.out.println("Mobile Number: "+mobno);
            System.out.println("City: "+city);
        }catch(InterruptedException e){}
    }
}