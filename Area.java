import java.util.Scanner;

public class Area {
    
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter radius: ");
        int x = sc.nextInt();

        double ans = 3.14 * x * x;
        System.out.println(ans);
    }
}
