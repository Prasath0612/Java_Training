public class thread1 
{
    public static void main(String[] args) {
        sample s=new sample();
        
        Thread t=new Thread(s);
        sample1 s1=new sample1();
        Thread t3=new Thread(s1);
        t.start();
       
        t3.start();
        System.out.println("From main"+t.getName());
        
        
    }
}
class sample implements Runnable
{
    Thread t1=new Thread();
    @Override
    public void run()
    {
        System.out.println("From sample"+t1.getName());
    }
}
class sample1 implements Runnable
{
    Thread t2=new Thread();
    @Override
    public void run()
    {
        System.out.println("From sample1"+t2.getName());
    }
}
