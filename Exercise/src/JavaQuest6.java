/**
 * Expected output:
 * 1 1 2 3 5 8 13 21 ...
 * 
 */
public class JavaQuest6 {
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence
    int temp1 = 0;
    int num = 1;
    int swap = 0;

    for (int i = 0; i < 15; i++) {
      System.out.println(num);
      swap = num;
      num = temp1 + num;
      temp1 = swap;

  }
}

  
}
