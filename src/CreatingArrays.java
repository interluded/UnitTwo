public class CreatingArrays {
   public static void main(String[] args) {
      // Write code here that will create a 5 element array called vowels.
      // Fill this array with the chars ‘a’, ‘e’, ‘i’, ‘o’, and ‘u’.
      // int[] points = new int[6];
      char[] vowels = new char[5];
      vowels[0] = 'a';
      vowels[1] = 'e';
      vowels[2] = 'i';
      vowels[3] = 'o';
      vowels[4] = 'u';

      // Write code here that will create a 4 element array called seasons.
      // Fill this array with the Strings “Winter”, “Spring”, “Summer”, and
      // “Fall”.
      String[] seasons = new String[4];
      seasons[0] = "Winter";
      seasons[1] = "Spring";
      seasons[2] = "Summer";
      seasons[3] = "Fall";

      // Write code here that will create a 30 element array called
      // results. Fill this array with the boolean values: true, false, true,
      // false, true, false, etc. Try to use a for loop.

      boolean[] results = new boolean[30];
      for (int i = 0; i < results.length; i++) {
         if ((int) (Math.random() * 2) + 1 == 1) {
            results[i] = true;
         } else {
            results[i] = false;
         }

      }
      printArray(results);
   }

   public static void printArray(boolean[] arr) {
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + "\t");
      }
   }
}