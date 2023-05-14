import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=n-1;
        int s=(n*(n+1))/2;
        System.out.println(s);
    }
}