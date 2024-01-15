/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false */

public class JavaQuest48 {
  public static void main(String[] args) {
    System.out.println(isValid("()")); // true
    System.out.println(isValid("()[]{}"));// true
    System.out.println(isValid("(]"));// false
    System.out.println(isValid("([{}]){[]}"));// true

  }

  public static boolean isValid(String s) {
    int[] arr = new int[6];

    for (char c : s.toCharArray()) {
      switch (c) {
        case '(' : 
          arr[0]++;
          break;
        case ')' :
          arr[1]++;
          break;
        case '{' :
          arr[2]++;
          break;
        case '}' :
          arr[3]++;
          break;
        case '[' :
          arr[4]++;
          break;        
        case ']' :
          arr[5]++;
          break;
      }
    }

    return (arr[0] == arr[1]) && (arr[2] == arr[3]) && (arr[4] == arr[5]);

  }

}
