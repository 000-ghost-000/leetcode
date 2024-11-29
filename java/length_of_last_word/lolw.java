public class Solution {
  public int lengthOfLastWord(String s) {
    if (s == null || s.isEmpty()) {
      return 0;
    }

    int length = 0;
    boolean foundWord = false;

    // Iterate from the end, excluding trailing spaces
    for (int i = s.length() - 1; i >= 0 && s.charAt(i) == ' '; i--) {
      // Skip trailing spaces
    }

    for (int i = s.length()-1; i >= 0; i--) {
      char ch = s.charAt(i);
      if (ch != ' ') {
        length++;
        foundWord = true;
      } else if (foundWord) {
        return length;
      }
    }

    return length;
  }
}

