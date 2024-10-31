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
    }
}
