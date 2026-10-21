import java.util.Scanner;

public class Coupon {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter amout: ");
        int x = sc.nextInt();

        if(x>1000)
        {
            System.out.println("Eligible for SAVE200 Coupon");
        }
        else if(x > 500)
        {
            System.out.println("Eligible for SAVE100 Coupon");
        }
        else
        {
            System.out.println("Not sufficient amount for Coupon");
        }
    }
}
