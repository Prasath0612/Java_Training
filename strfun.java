class strfun
{
    public static void main(String[] args)
    {
        String str=new String("Welcome to i-exceed Technologies");
        String str1=new String("Appzillon Software");
        String str2="Java Training";
        String str3="Java Training";
        System.out.println("To Upper Case: "+str.toUpperCase());
        System.out.println("To Lower Case: "+str.toLowerCase());
        System.out.println("Equals: "+str2.equals(str3));
        System.out.println("Char At: "+str.charAt(1));
        System.out.println("Contains: "+str.contains("i-exceed"));
        System.out.println("Ends with: "+str1.endsWith("Training"));
        System.out.println("Starts with: "+str2.startsWith("Java"));
        System.out.println("Index of: "+str2.indexOf("Training"));
        System.err.println("Substring: "+str.substring(2, 7));
        System.out.println("Length: "+str.length());
        System.out.println("Trim:"+str.trim());
        System.out.println("Join: "+str1.join("->", "i-exceed","technology ","solutions"));
        System.out.println("Concatenation: "+str.concat(str3));
        System.out.println("Replace: "+str1.replace("p", "k"));
    }
}