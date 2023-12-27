/*
 * Question : 
 * given a string s of even length. 
 * Split this string into two halves of equal lengths, 
 * and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').
Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. 
Otherwise, return false.
 */

//hints : substring() , toCharArray() ?
public class JavaQuest23 {
  public static boolean sameNumberOfVowels(String s) {
    // code here

    char[] arra = s.substring(0, s.length() / 2).toLowerCase().toCharArray();
    char[] arrb = s.substring(s.length() / 2, s.length()).toLowerCase().toCharArray();

    int counta = 0;
    int countb = 0;
    
    for (char c: arra) {
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
      counta++;
    }

    for (char c: arrb) {
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
      countb++;
    }

    return counta == countb;
  }

  public static void main(String[] args) {
    System.out.println(sameNumberOfVowels("Afhffgdgeo"));
    System.out.println(sameNumberOfVowels("fdoupp"));
  }
}