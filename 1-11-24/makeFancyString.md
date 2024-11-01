# Delete Characters to Make Fancy String

**Problem Link:** [LeetCode - Delete Characters to Make Fancy String](https://leetcode.com/problems/delete-characters-to-make-fancy-string/description/)

## Problem Description

A **fancy string** is a string where no three consecutive characters are equal. Given a string `s`, delete the minimum number of characters from `s` to make it a fancy string.

Return the final string after the deletions. It can be shown that the answer will always be unique.

### Example 1:
- **Input:** `"leeetcode"`
- **Output:** `"leetcode"`
- **Explanation:** Remove an extra `'e'` from `"leeetcode"` to make `"leetcode"` a fancy string.

### Example 2:
- **Input:** `"aaabaaaa"`
- **Output:** `"aabaa"`
- **Explanation:** Remove an extra `'a'` from each group of three consecutive `'a'` to make `"aabaa"` a fancy string.

### Example 3:
- **Input:** `"aab"`
- **Output:** `"aab"`
- **Explanation:** No need to remove any characters as `"aab"` is already a fancy string.

### Constraints:
- `1 <= s.length <= 10^5`
- `s` consists only of lowercase English letters.
