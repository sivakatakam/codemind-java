import java.util.Scanner;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        float a=(float)3.14*r*r;
        System.out.printf("%.2f",a);
    }
}