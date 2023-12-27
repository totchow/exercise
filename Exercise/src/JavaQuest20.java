/*
 * Question : Given two strings s and goal, 
 * return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.

the input need to be lowercase English letters.
*/

public class JavaQuest20 {

  public static void main(String[] args) {
    System.out.println(rotateString("abcde", "cdeab"));// true
    System.out.println(rotateString("abcde", "abced"));// false
    System.out.println(rotateString("abcde", "eabcd"));// true
    System.out.println(rotateString("abcde", "abcde"));// true
  }

  public static boolean rotateString(String s, String goal) {
    if (s.equals(goal))
      return true;
    
    int count = 0;
    char[] arr = s.toCharArray();

    while (++count < s.length()) {
      char head = arr[0];
      for (int i = 0 ; i < arr.length - 1; i++) {
        arr[i] = arr[i + 1];
      }
      arr[s.length() - 1] = head;

      if (goal.equals(String.valueOf(arr)))
        return true;
    }

    return false;
  }
}