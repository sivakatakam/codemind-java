import java.util.Scanner;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=(a/b)+(a%b);
            System.out.println(c);
        }
    }
}