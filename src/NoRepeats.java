import java.util.Scanner;

public class NoRepeats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] uniqueNumbers = new int[10];
        int count = 0;

        while (count < 10) {
            System.out.println("enter a positive int");
            int num = scan.nextInt();
            if (num <= 0) {
                System.out.println("only positive ints are allowed");
            }
            if (ArrayMethods.linearSearch(uniqueNumbers, num) != -1) {
                System.out.println("duplicate number. Try again.");
            } else {
                uniqueNumbers[count] = num;
                count++;
            }
        }
        System.err.println("null");
        System.out.println("you have entered the following unique numbers:");
        ArrayMethods.printArray(uniqueNumbers);
    }
}
