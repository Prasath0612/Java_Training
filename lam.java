public class lam {
    public static void main(String[] args) {
        absmain ab=()->
        {
            System.out.println("I am a fruit");
        };
        ab.fruit();
    }
}
interface absmain{
    public void fruit();
    //public void vegetable();
}
