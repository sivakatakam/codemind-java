import java.util.Scanner;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        float f=(float)(32+(c*1.8));
        System.out.printf("%.2f",f);
    }
}