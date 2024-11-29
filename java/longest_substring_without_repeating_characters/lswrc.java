class Solution {
    public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int res = 0;
    int[] lastIndex = new int[128]; // Assuming ASCII characters (you can adjust based on character set)

    // Initialize all lastIndex values to -1 (not found)
    for (int i = 0; i < 128; i++) {
      lastIndex[i] = -1;
    }

    int i = 0;
    for (int j = 0; j < n; j++) {
      char ch = s.charAt(j);
      // Update the starting index 'i' if the current character is found before
      i = Math.max(i, lastIndex[ch] + 1);
      // Update the length (res) and store the last index of the current character
      res = Math.max(res, j - i + 1);
      lastIndex[ch] = j;
    }
    return res;
    }
}
