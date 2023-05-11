import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,s,b;
        long d;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        d=2*t*s*b*512;
        System.out.println(d);
    }
}