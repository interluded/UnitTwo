import java.util.Scanner;

public class CreatingArrays2 {
    public static void main(String[] args) {
        String[] family = { "marcus", "martin", "mom", "dad" };

        int[] cubes = new int[30];
        for (int i = 0; i < cubes.length; i++) {
            cubes[i] = i * i * i;
        }
        printArray(cubes);

        double temp = 0.0;
        double[] nums = new double[50];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 0.5 + temp;
            temp += 0.5;
        }
        printArray(nums);

        int[] randoms = new int[75];
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = ((int) (Math.random() * 201) - 100);
        }
        printArray(randoms);

        Scanner scan = new Scanner(System.in);
        int[] values = new int[10];
        for (int i = 0; i < values.length; i++) {
            System.out.println("Enter num " + (i + 1));
            values[i] = scan.nextInt();
        }
        scan.close();
        printArray(values);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 10 == 0) {
                System.out.print("\n");
            }
            System.out.print(arr[i] + "\t");
        }
    }

    public static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 10 == 0) {
                System.out.print("\n");
            }
            System.out.print(arr[i] + "\t");
        }
    }
}
