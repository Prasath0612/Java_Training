
public class threadpriority implements Runnable {
    public void run()
    {
      System.out.println(Thread.currentThread()); 
    }
    public static void main(String[] args) 
    {
       threadpriority a = new threadpriority();
       Thread t1 = new Thread(a, "Thread 1");
       Thread t2 = new Thread(a, "Thread 2");
       Thread t3 = new Thread(a, "Thread 3");
     
       t1.setPriority(4); 
       t2.setPriority(2); 
       t3.setPriority(8); 
       System.out.println(t1.getPriority());
       System.out.println(t2.getPriority());
       System.out.println(t3.getPriority());
       t1.start();
       t3.start();
       t2.start();
       
      }
    }
