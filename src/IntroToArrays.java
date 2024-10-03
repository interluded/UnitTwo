  public class IntroToArrays  {
     public static void main(String[] args)
     {
        // Write code here that will create a 4 element array called grades. 
        // Fill this array with the ints 90, 88, 86, and 91.
        int[] grades = new int[4];

        grades[0] = 90;
        grades[1] = 88;
        grades[2] = 86;
        grades[3] = 91;


              // Write code here that will create a 6 element array called points. 
        // Fill this array with the ints 12, 0, 10, 8, 7 and 1.
        int[] points = new int[6];

        points[0] = 12;
        points[1] = 0;
        points[2] = 10;
        points[3] = 8;
        points[4] = 7;
        points[5] = 1;



        // Write code here that will print the first element of the grades array.
        System.out.println(grades[0]);
        printArray(grades);


        // Write code here that will print the last element of the points array.
        System.out.println(points[5]);
        printArray(points);

     }

     public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
     }
  }
