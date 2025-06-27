# 🔁 Check for Duplicates in an Array (No Inbuilt Functions)

This repository contains a simple and fundamental solution to the problem of checking whether an array contains **duplicate elements**, without using any inbuilt functions or libraries (like `HashSet`, `Arrays.sort()`, etc.).

---

## 🧩 Problem Statement

Given an integer array, determine if the array contains **any duplicates**.

- Return `true` if any value appears **at least twice** in the array.
- Return `false` if **every element is distinct**.
- **Do not use any inbuilt functions** (like sets, maps, or sorting methods).

---

## 🧠 Examples

### Example 1

```
Input:  arr = [1, 2, 3, 4]
Output: false
```

### Example 2

```
Input:  arr = [1, 2, 3, 1]
Output: true
```

---

## 🔒 Constraints

- `1 <= arr.length <= 10^5`
- `-10^9 <= arr[i] <= 10^9`
- No inbuilt methods or libraries should be used for set/hash-based or sort-based operations.

---

## ✅ Approach

### Brute Force (Nested Loop)

1. Use two nested loops to compare every pair of elements in the array.
2. If any two elements are equal, return `true`.
3. If the entire array is scanned without finding duplicates, return `false`.

---

### 🧠 Time & Space Complexity

- **Time Complexity:** `O(n^2)`
- **Space Complexity:** `O(1)`  
  *(No extra space used — only variables)*

---

## 📌 Notes

- This approach is **simple** but not optimal for large arrays.
- Can be improved to `O(n log n)` using sorting or `O(n)` with hash sets, **but those are not allowed** in this variation.
- Ideal for understanding the core logic behind duplicate detection.

---

## 📂 Related Topics

- Arrays
- Brute Force
- Interview Basics
- Looping Techniques


