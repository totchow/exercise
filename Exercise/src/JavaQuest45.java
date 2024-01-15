/*
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
 * 
 * Note that after backspacing an empty text, the text will continue empty.
 */

import java.util.LinkedList;

public class JavaQuest45 {
  public static void main(String[] args) {
    System.out.println(backspaceCompare("ab#c", "ad#c"));
    System.out.println(backspaceCompare("ab##", "c#d#"));
    System.out.println(backspaceCompare("a#c", "b"));

  }

  // Approach 1
  public static boolean backspaceCompare(String s, String t) {
    // StringBuilder sbs = new StringBuilder();
    // StringBuilder sbt = new StringBuilder();

    // for (char c : s.toCharArray()) {
    //   if (c != '#') {
    //     sbs.append(c);
    //   } else {
    //     sbs.deleteCharAt(sbs.length() - 1);
    //   }
    // }

    // for (char c : t.toCharArray()) {
    //   if (c != '#') {
    //   sbt.append(c);
    //   } else {
    //     sbt.deleteCharAt(sbt.length() - 1);
    //   }
    // }

    LinkedList<Character> ls = new LinkedList<>();
    LinkedList<Character> lt = new LinkedList<>();

    for (char c : s.toCharArray()) {
      if (c != '#') {
        ls.add(c);
      } else {
        ls.removeLast();
      }
    }
    
    for (char c : t.toCharArray()) {
      if (c != '#') {
        lt.add(c);
      } else {
        lt.removeLast();
      }
    }

    return ls.toString().equals(lt.toString());
  }

}
