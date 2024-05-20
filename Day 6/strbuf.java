public class strbuf {
    public static void main(String args[])
    {
        StringBuffer str=new StringBuffer("Hello from i-exceed");
        StringBuilder str1=new StringBuilder("Java Programming");
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str.append(str1));
        System.out.println(str);
        System.out.println(str.charAt(4));
        System.out.println(str.lastIndexOf("e", 15));
        System.out.println(str.length());
        System.out.println(str.substring(4));
        System.out.println(str.delete(5, 10));
        System.out.println(str.reverse());
        System.out.println(str.indexOf("from", 5));
        System.out.println(str1.chars());
    }
}
