/*Given an integer n (in base 10) and a base k, return the sum of the digits of n after converting n from base 10 to base k.

After converting, each digit should be interpreted as a base 10 number, and the sum should be returned in base 10.

 

Example 1:
Input: n = 34, k = 6
Output: 9
Explanation: 34 (base 10) expressed in base 6 is 54. 5 + 4 = 9.

Example 2:
Input: n = 10, k = 10
Output: 1
Explanation: n is already in base 10. 1 + 0 = 1.
 

Constraints:

1 <= n <= 100
2 <= k <= 10 */
public class JavaQuest58 {
  public static void main(String[] args) {
    System.out.println(sumBase(34, 6)); // 9
    System.out.println(sumBase(10, 10));// 1
    System.out.println(sumBase(99, 9));// 3

  }

  public static int sumBase(int n, int k) {
    // Approach 1:
    // String new_n = Integer.toString(n,k);
    // char[] arr = new_n.toCharArray();

    // int result = 0;    
    // for (char c : arr) {
    //   result += Integer.valueOf(c - '0');
    // }

    // Approach 2
    String new_n = changebase(n,k);
    char[] arr = new_n.toCharArray();

    int result = 0;    
    for (char c : arr) {
      result += Integer.valueOf(c - '0');
    }

    return result;
  }

  public static String changebase(int n, int k) {

    if (n == k) {
      return String.valueOf(10);
    } else if (n < k) {
        return String.valueOf(n);
      } else if (n/k < k) {
          return String.valueOf(n/k).concat(String.valueOf(n%k));
        } else {            
            return changebase(n/k, k).concat(String.valueOf(n%k));
          }
  }
}
