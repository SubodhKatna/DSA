# 🔄 Check if Two Strings are Anagrams (Without Inbuilt Functions)

This repository contains a solution to the classic **Anagram Check** problem, with a strict constraint: **no inbuilt functions** (e.g., sorting methods, hash maps, or string utilities).

---

## 🧩 Problem Statement

Given two strings `s1` and `s2`, determine whether they are **anagrams** of each other.

- Two strings are anagrams if they contain the **same characters** with the **same frequencies**, but possibly in a different order.
- You **must not** use any inbuilt functions for sorting, hashing, or frequency counting.

---

## 🧠 Examples

### Example 1

```
Input:  s1 = "listen", s2 = "silent"
Output: true
```

### Example 2

```
Input:  s1 = "hello", s2 = "world"
Output: false
```

---

## 🔒 Constraints

- `1 <= s1.length, s2.length <= 10^5`
- Strings consist of **lowercase English letters** only.
- **No inbuilt sorting**, **hash maps**, or **collections** are allowed.

---

## ✅ Approach

### Frequency Array (Manual Counting)

1. If the lengths of the two strings are not equal, return `false`.
2. Create a fixed-size array of length 26 to manually count character occurrences for `s1`.
3. Traverse `s2`, decrementing the corresponding character count.
4. After processing both strings, if all counts are zero, the strings are anagrams.

---

### 🧠 Time & Space Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`  
  (Since the alphabet size is constant — 26 letters)

---

## 📌 Notes

- This approach avoids using `Arrays.sort()`, `HashMap`, or `Collections`.
- This is ideal for interviews or environments with **restricted library access**.
- Works efficiently even for large strings due to linear complexity.

---

## 📂 Related Topics

- Strings
- Frequency Counting
- Arrays
- Character Encoding
- Interview Questions
