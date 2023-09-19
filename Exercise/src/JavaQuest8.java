/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    // code here
    int secondMax = -999;
    int Max = -999;
    int[] testarr = nums4; //change different testing array here

    for (int i = 0; i <testarr.length; i++) {
      if (testarr[i] >= Max) {
        secondMax = Max;
        Max = testarr[i];
      } else if (testarr[i] < Max && testarr[i] > secondMax) {
        secondMax = testarr[i];
      }
    }
    System.out.println("Second max = "+ secondMax);

  }
}
