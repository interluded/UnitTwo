public class TestingArrayMethods {
    public static void main(String[] args) {
        int[] randoms = new int[25];
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = (int) (Math.random() * 100) + 1;
        }
        ArrayMethods.printArray(randoms);
        System.out.println(ArrayMethods.sumArray(randoms));
        System.out.println(ArrayMethods.avgArray(randoms));
        System.out.println(ArrayMethods.linearSearch(randoms, 12));
        System.out.println(ArrayMethods.findMin(randoms));
        int[] numbers = {100, 200, 300, 400, 500};
        ArrayMethods.swap(numbers, 1, 2);
        ArrayMethods.printArray(numbers);
        String[] words = {"apple", "banana", "cherry", "date", "elderberry"};
        ArrayMethods.swap(words, 0, 3);
        ArrayMethods.printArray(words);
    }
}
