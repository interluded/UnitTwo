public class ArrayMethods {
    public static void printArray(boolean [] arr){
        for(int i = 0; i < arr.length; i++){
            if(i % 10 == 0){
        System.out.print("\n");
            }
            System.out.print(arr[i] + "\t");
        }
     }
     public static void printArray(char [] arr){
        for(int i = 0; i < arr.length; i++){
            if(i % 10 == 0){
                System.out.print("\n");
                            }
            System.out.print(arr[i] + "\t");
        }
     }
     public static void printArray(int [] arr){
        for(int i = 0; i < arr.length; i++){
            if(i % 10 == 0){
                System.out.print("\n");
                            }
            System.out.print(arr[i] + "\t");
        }
     }
     public static void printArray(String [] arr){
        for(int i = 0; i < arr.length; i++){
            if(i % 10 == 0){
                System.out.print("\n");
                            }
            System.out.print(arr[i] + "\t");
        }
     }

     public static int sumArray(int[] arr){
        int total = 0;
        for(int i = 0; i<arr.length;i++){
            total+= arr[i];
        }
        return total;
     }
     public static double avgArray(int[] arr){
        double avg = sumArray(arr) / (double)arr.length;
        return avg;
     }
}
