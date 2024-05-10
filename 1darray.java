import java .io.*;
import java.util.*;
class odarray
{
    public static void main(String args[])
    {
        String name;
        int rollno,max,temp;
        int marks[]=new int[5];
        DataInputStream di=new DataInputStream(System.in);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of student:");
        name=sc.nextLine();
        System.out.println("Enter the roll number:");
        rollno=sc.nextInt();
        for(int i=0;i<marks.length;i++)
        {
            try
            {
            System.out.println("Enter the marks of subject "+(i+1));
            marks[i]=Integer.parseInt(di.readLine());
            }catch(Exception e){}
        }
        
        System.out.println("----------------------");
        System.out.println("Name of the student:"+name);
        System.out.println("Roll Number:"+rollno);
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Mark obtained in subject "+i+"is "+marks[i]);
        }
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i+1]>marks[i])
            {
                max=marks[i+1];
                temp=i;
            }
        }
        System.out.println("");
        System.out.println("Highest mark obtained is "+max+"in subject"+temp);
    }
}