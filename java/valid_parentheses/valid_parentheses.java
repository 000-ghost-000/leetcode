import java.util.*;

class Solution {
    public boolean isValid(String s) {
        // HashMap to map closing brackets to their corresponding opening brackets
        HashMap<Character, Character> para = new HashMap<>();
        para.put(')', '(');
        para.put(']', '[');
        para.put('}', '{');
        
        // Stack to hold opening brackets
        Stack<Character> stack = new Stack<>();
        
        // Iterate through the string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // If the current character is an opening bracket, push it onto the stack
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                stack.push(currentChar);
            }
            // If it's a closing bracket, check if it matches the last opening bracket
            else if (para.containsKey(currentChar)) {
                // Check if the stack is empty or the top of the stack does not match
                if (stack.isEmpty() || stack.peek() != para.get(currentChar)) {
                    return false;
                }
                // Pop the matching opening bracket
                stack.pop();
            }
        }
        
        // If the stack is empty, it means all brackets are properly matched
        return stack.isEmpty();
    }
}
