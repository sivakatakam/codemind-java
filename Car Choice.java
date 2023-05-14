import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0)
        {
            float x1=sc.nextFloat();
            float x2=sc.nextFloat();
            float y1=sc.nextFloat();
            float y2=sc.nextFloat();
            if((y1/x1)<(y2/x2))
            System.out.println("-1");
            else if((y1/x1)>(y2/x2))
            System.out.println("1");
            else
            System.out.println("0");
        }
    }
}