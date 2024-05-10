import java.io.*;
public class mulmatrix_day4 
{
    public static void main(String[] args) {
        DataInputStream di=new DataInputStream(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int mul[][]=new int[3][3];
        System.out.println("Matrix 1");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<3;j++)
            {
                try{
                    System.out.println("Enter number:");
                    a[i][j]=Integer.parseInt(di.readLine());
                }catch(Exception e){}
            }
        }
        System.out.println("Matrix 2");
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<3;j++)
            {
                try{
                    System.out.println("Enter number:");
                    b[i][j]=Integer.parseInt(di.readLine());
                }catch(Exception e){}
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    mul[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Multiple of Matrix 1 and 2");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<3;j++)
                
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
 
    }
}