import java.util.Scanner;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        float c=(float)(a+b)/2;
        System.out.printf("%.4f",c);
    }
}