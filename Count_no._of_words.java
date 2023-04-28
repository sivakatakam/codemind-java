import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        int c=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' '&&str.charAt(i+1)!=' ')
            c++;
        }
        System.out.println(c+1);
    }
}