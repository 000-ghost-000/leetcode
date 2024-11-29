public class Solution {
  public int strStr(String haystack, String needle) {
    if (haystack == null || needle.isEmpty()) {
      return -1; // Handle empty haystack or empty needle
    }

    for (int startIndex = 0; startIndex <= haystack.length() - needle.length(); startIndex++) {
      if (haystack.charAt(startIndex) == needle.charAt(0)) {
        // Check if the entire needle substring matches
        if (haystack.substring(startIndex, startIndex + needle.length()).equals(needle)) {
          return startIndex;
        }
      }
    }

    return -1; // Needle not found
  }
}

