import java.util.Scanner;

public class loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // FOR LOOP
        System.out.println(" For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // WHILE LOOP
        System.out.println("\nWhile Loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        // do-while loop
        System.out.println("\nDo-While Loop:");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);
    }
}
