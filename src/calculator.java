import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y,z=0;
        System.out.println("Enter the first number");
        System.out.println("Enter the second number");

        try
        {
            x=sc.nextInt();
            y=sc.nextInt();
            z=x/y;
            System.out.println("Exception not occcur");
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println(z);
        }
    }
}
