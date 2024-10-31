public class ArrayMethods {
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

    public static int sumArray(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public static double avgArray(int[] arr) {
        double avg = sumArray(arr) / (double) arr.length;
        return avg;
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static int linearSearch(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return i;
            }

        }
        return -1;
    }

    public static int findMin(int[] arr) {
        int minValue = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int findMin(int[] arr, int start)
    {
        int minValue = arr[start];
        int minIndex = start;

        for (int i = start + 1; i < arr.length; i++)
        {
            if (arr[i] < minValue)
            {
                minValue = arr[i];
                minIndex = i;
            }
        }

        return minIndex;
    }


}