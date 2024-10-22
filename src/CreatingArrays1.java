public class CreatingArrays1 {
    public static void main(String[] args) {
        int[] nums = { 3, 8, 1, 9, 2, 5 };
        char[] letters = { 'f', 'w', 'g', 'k' };
        boolean[] answers = { true, false, true, false };
        String[] provinces = { "Ontario", "Manitoba", "Quebec" };

        int[] scores = new int[100];
        for (int i = 0; i <= 99; i++) {
            scores[i] = 10;
        }
        printArray(scores);
    }

    public static void printArray(boolean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 10 == 0) {
                System.out.print("\n");
            }
            System.out.print(arr[i] + "\t");
        }
    }

    public static void printArray(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 10 == 0) {
                System.out.print("\n");
            }
            System.out.print(arr[i] + "\t");
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 10 == 0) {
                System.out.print("\n");
            }
            System.out.print(arr[i] + "\t");
        }
    }

    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 10 == 0) {
                System.out.print("\n");
            }
            System.out.print(arr[i] + "\t");
        }
    }
}
