public class prot {
    public static void main(String[] args) {
        sam s=new sam(2243, "Shankar", "Theni", "Developer", 9845734657l);
        s.disp();
    }
}
class sample
{
    protected int id=0;
    protected String name="",city="";
    private String desg="";
    sample(int id,String name,String city,String desg)
    {
        this.id=id;
        this.name=name;
        this.city=city;
        this.desg=desg;
        this.display();
    }
    private void display()
    {
        System.out.println("Designation: "+desg);
    }
    protected void disp()
    {
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
    }
}
class sam extends sample
{
    long mobno=0;
    sam(int id,String name,String city,String desg,long mobno)
    {
        super(id, name, city, desg);
        System.out.println("Mobile number: "+mobno);
    }
}
