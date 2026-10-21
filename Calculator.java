import java.util.Scanner;

public class Calculator {
    
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("select operation : 1.Add 2.Sub 3.Mul 4.div");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z= sc.nextInt();

        switch (x) {
            case 1:
                System.out.println("answer : " + (y+z));
                break;

            case 2:
                System.out.println("answer : " + (y-z));
                break;

            case 3:
                System.out.println("answer : " + (y*z));
                break;

            case 4:
                System.out.println("answer : " + (y/z));
                break;
        
            default:
                break;
        }

    }
}
