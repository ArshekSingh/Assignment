import java.util.*;
public class Compund {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle: ");
        int p = sc.nextInt();
        System.out.println("Enter Rate: ");
        int r = sc.nextInt();
        System.out.println("Enter Time Span: ");
        int t = sc.nextInt();
        double CI = p * (Math.pow((1 + r / 100), t));
          
        System.out.println("Compound Interest is "+ CI);
        sc.close();
    }
}
