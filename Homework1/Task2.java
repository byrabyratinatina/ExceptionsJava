/*  Задача 2.
 * Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
 */

// КОД
public static int sum2d(String[][] arr) {
  int sum = 0;
  for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < 5; j++) {
      int val = Integer.parseInt(arr[i][j]);
      sum += val;
    }
  }
return sum;
}  

// ОТВЕТ - по моему мнению можно получить 5 типов исключений:
// первый - ArrayStoreException
// второй - ClassCastException 
// третий - IndexOutOfBoundsException 
// четвертый - NoSuchElementException 
// пятый - NumberFormatException
