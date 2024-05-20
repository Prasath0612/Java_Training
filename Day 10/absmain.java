 class absmain extends lambd implements demo
 {
    absmain()
    {
        System.out.println("Absmain constructor");
    }
    public void show()
            {
                System.out.println("Hello from demo");
            }
    public static void main(String[] args) {
        absmain ab=new absmain();
        lambd l=new lambd() {};
        l.share();
        l.hel();
        //demo d=new demo() {
            
        //};
        ab.show();
    }
 }



 abstract class lambd extends sample{
    lambd()
    {
     System.out.println("Hello from constructor");

    };
    public void hel()
    {
        System.out.println("Method from abstract");
    }
   // public static void main(String[] args) {
       
       //lambd l=new lambd(){};
      
       //sample s=new sample();
        // demo d=new demo()
        // {
        //     public void show()
        //     {
        //         System.out.println("Hello");
        //     }
        // };
        // d.show();
        // l.share();
        
        
   // }
}
@FunctionalInterface
interface demo
{
    public void show();
}
class sample
{
    public void share()
    {
        System.out.println("Hello from sample");
    }
}