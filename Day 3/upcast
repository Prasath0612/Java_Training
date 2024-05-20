public class upcast_day3 {
    public static void main(String[] args) {
        batsman bt=new bowler();
        bt.scorecard();
        bt.milestone();
    }
}
class batsman
{
    int runs=80,four=6,six=4,dots=10,fifty=2,hundred=0;
    batsman()
    {
        System.out.println("Batsman Scorecard");
    }
    public void scorecard()
    {
        System.out.println("Runs scored:"+runs);
        System.out.println("Fours:"+four);
        System.out.println("Sixes:"+six);
        System.out.println("Dot balls:"+dots);
    }
    public void milestone()
    {
        System.out.println("Fifties scored:"+fifty);
        System.out.println("Hundreds scored:"+hundred);
    }
}
class bowler extends batsman
{
    int overs=4,maiden=0,run_conc=35,wickets=2;
    bowler()
    {
        System.out.println("Bowlers Scorecard");
    }
    @Override
    public void scorecard()
    {
        System.out.println("Overs:"+overs);
        System.out.println("Maidens:"+maiden);
        System.out.println("Runs Conceded:"+run_conc);
        System.out.println("Wickets:"+wickets);
    }
}
