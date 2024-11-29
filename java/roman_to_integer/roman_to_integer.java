import java.util.HashMap;

public class Solution {
    public int romanToInt(String s) {
        // Map to store Roman numeral values
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int decimalValue = 0; // To store the final integer value
        int prevValue = 0;    // To track the value of the previous Roman numeral

        // Iterate over the string from the end to the beginning
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.get(s.charAt(i));

            // Add or subtract the value based on its relation to the previous value
            if (currentValue >= prevValue) {
                decimalValue += currentValue;
            } else {
                decimalValue -= currentValue;
            }

            // Update the previous value
            prevValue = currentValue;
        }

        return decimalValue;
    }
}


