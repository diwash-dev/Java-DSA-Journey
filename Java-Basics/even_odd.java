// import java.util.Scanner;

// public class even_odd {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Number:");
//         int n = sc.nextInt();
//         if (n % 2 == 0)
//             System.out.println("Even Number");
//         else {
//             System.out.println("Odd Number");
//             System.out.println("diwash tharu ");
//         }
//     }

// }



// absolute value  examples demo 
import java.util.Scanner;

public class even_odd {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println(" Enter the Number: ");
        int n = sn.nextInt();
        if (n >= 0)
            System.out.println(n);
        else
            System.out.println(-n);
    }
}
