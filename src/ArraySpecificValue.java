/*
*created by dipak
* Java program to test if an array contains a specific value.
 */


public class ArraySpecificValue {

   public static boolean contains(int[] array, int item) {
        for (int n : array) {
            if (item == n) {
                return true;
            }
        }
        return false;
   }

   public static void m(){

       int[] my_array1 = {1, 2, 3, 5, 6, 7, 8, 9, 10, 11,};

       System.out.println(contains(my_array1, 9));
       System.out.println(contains(my_array1, 12));
   }


    public static void main(String[] args) {

       ArraySpecificValue.m();
    }


}
