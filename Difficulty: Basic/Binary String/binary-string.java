class Solution {
    public int binarySubstring(String s) {
        // code here
            int ones = 0;
        
        // Count of '1's using loop
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
            }
        }

        // Return total substrings = m * (m - 1) / 2
        return (ones * (ones - 1)) / 2;
    }
}