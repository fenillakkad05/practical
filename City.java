import java.util.Scanner;

public class City {
    
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your city");
        String x = sc.next();

        if(x == "surat")
            System.out.println("our store is avl");
        else
            System.out.println("store not avl");
    }
}
