/*Question : Given an integer n,
 add a dollar sign ("$") and a comma (",") as the thousands separator and return it in string format. */
/*Constraints:

0 <= n <= 231 - 1 */

public class JavaQuest29 {
  public static void main(String[] args) {
    System.out.println(separator(85));// $85
    System.out.println(separator(0));// $0
    System.out.println(separator(1000));// 1,000
    System.out.println(separator(123987405));// $123,987,405

  }

  public static String separator(int n) {
    // code here
    StringBuilder sb = new StringBuilder();  
    char[] arr = String.valueOf(n).toCharArray();

    int index = 1;
    for (int i = arr.length - 1; i >= 0; i--) {
       if (index % 4 == 0) {
          sb.append(',');
          index++;
          sb.append(arr[i]);
       } else {
          sb.append(arr[i]);
       }
       index++;
    }
    return sb.append('$').reverse().toString();
  }
}