public class array_statistics {
    public static void main(String[] args) {

        int[] arr = { 10, 25, 8, 40, 15 };

        int sum = 0;
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            if (arr[i] > max)
                max = arr[i];

            if (arr[i] < min)
                min = arr[i];
        }

        double average = sum / (double) arr.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}