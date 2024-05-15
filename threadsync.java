public class threadsync {
    public static void main(String[] args) {
        biometric bio=new biometric();
        company t1=new company(3387, "Sivanesh", bio);
        company t2=new company(3367, "Mani", bio);
        company t3=new company(3334, "Vicky", bio);
    }
}
class company extends Thread
{
    String emp_name;
    int emp_id;
    biometric bm;
    company(int emp_id,String emp_name,biometric bm)
    {
        this.emp_id=emp_id;
        this.emp_name=emp_name;
        this.bm=bm;
        this.start();
    }
    public void run()
    {
        bm.biomet(emp_id,emp_name);
    }
}
class biometric 
{
    String emp_name;
    int emp_id;
    synchronized public void biomet(int emp_id,String emp_name)
    {
        System.out.println("Employee name: "+emp_name);
        System.out.println("Employee Id: "+emp_id);
        System.out.println(emp_id +" "+ emp_name +  " biometric is accessed and checked in");
    }
}
