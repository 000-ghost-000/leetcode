class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0]; // Start with the first string as the initial prefix
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) { // Check if the current string starts with the prefix
                prefix = prefix.substring(0, prefix.length() - 1); // Shorten the prefix
                if (prefix.isEmpty()) {
                    return ""; // If prefix becomes empty, return ""
                }
            }
        }

        return prefix; // Return the longest common prefix
    }
}