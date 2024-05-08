public class stat_day3 {
    public static void main(String[] args) {
        voting vt=new voting(5463, "Karthi", 24, "Tirupur", "Tamil Nadu");
        voting.list();
        voting vt1=new voting(5732, "Mukesh", 20, "Chennai", "Tamil Nadu");
        voting.list();
        voting vt2=new voting(9754, "Shankar", 35, "Mumbai", "Maharastra");
        voting.list();
    }
}
class voting
{
    int vote_id,age;
    String name,city,state;
    static String country;
    static{
        country="India";
    }
    voting(int vote_id,String name,int age,String city,String state)
    {
        this.vote_id=vote_id;
        this.name=name;
        this.age=age;
        this.city=city;
        this.state=state;
        System.out.println("***********");
        System.out.println("Voter Details");
        this.display();
    }
    static public void list()
    {
        System.out.println("Country:"+country);
    }
    public void display()
    {
        System.out.println("Voter ID:"+vote_id);
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("City:"+city);
        System.out.println("State:"+state);
    }
}
