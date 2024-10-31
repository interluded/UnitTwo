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

    public static int findMin(int[] arr, int start) {
        int minValue = arr[start];
        int minIndex = start;

        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static void swap(String[] array, int x, int y) {
        String temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            swap(array, i, minIndex);
        }
    }

    public static void selectionSort(String[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            swap(array, i, minIndex);
        }
    }
}