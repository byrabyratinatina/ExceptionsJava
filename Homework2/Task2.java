/* Задача 2:
 * Если необходимо, исправьте данный код 
 * (https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 * 
 * КОД:
 * try {
 *   int d = 0;
 *   double catchedRes1 = intArray[8] / d;
 *   System.out.println("catchedRes1 = " + catchedRes1);
 * } catch (ArithmeticException e) {
 *   System.out.println("Catching exception: " + e);
 * }  
 */


 public class Task2 {
   
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = {1,12,3,42,5,6,73,8,19};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }         
    }
}
