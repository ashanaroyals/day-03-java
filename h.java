import java.util.*;
public class h
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int  a=sc.nextInt();
        
        if((a&1)==0)
        {
            System.out.println("the value is even");
        }
        else{
            System.out.println("the value is odd");
        }
    }
}