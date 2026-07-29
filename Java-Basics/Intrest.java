import java.util.Scanner;

public class Intrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        int p = sc.nextInt();
        System.out.print("Enter the rate of interest: ");
        int r = sc.nextInt();
        System.out.print("Enter the time period: ");
        int t = sc.nextInt();

        double si = (p * r * t) / 100;

        System.out.println( "Simple Interest is: " + si);
    }
}
