import java.util.ArrayList;
import java.util.Iterator;

public class arraylist 
{
    public static void main(String[] args) 
    {
        ArrayList<Character> arr=new ArrayList<Character>(1000000);
        arr.add('r');
        arr.add('t');
        arr.add('w');
        
        Iterator itr=arr.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());    
        }
    }
}