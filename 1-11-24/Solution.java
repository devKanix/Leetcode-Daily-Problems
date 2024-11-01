class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));
        int n = s.length();
        int c = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == ans.charAt(ans.length() - 1)) {
                c++;
                if (c < 3)
                    ans.append(s.charAt(i));

            } else {
                c = 1;
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}

// Approach

// 1. Initialize: Start with a `StringBuilder` to build the result and add the first character.
// 2. Loop through the String:
//    - For each character, check if it's the same as the last character added.
//    - If it's the same, increase the count; if it's different, reset the count.
//    - Only add the character to the result if it's not the third in a row.
// 3. Return the Result: Convert the `StringBuilder` to a string and return it.