import java.util.Scanner;
public class shiftright
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a/((int)Math.pow(2,b));
        System.out.println(c);

    }
}