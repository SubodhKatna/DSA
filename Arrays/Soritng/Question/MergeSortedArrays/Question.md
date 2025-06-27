# 🔗 Merge Two Sorted Arrays (Without Inbuilt Functions)

This repository contains a solution to the **Merge Two Sorted Arrays** problem — a fundamental algorithmic problem involving arrays and two-pointer techniques, solved **without using any inbuilt functions**.

---

## 🧩 Problem Statement

You are given two **sorted** arrays `arr1` and `arr2`. Your task is to **merge them** into a single sorted array.

- The final array should also be in **sorted order**.
- Do **not** use any inbuilt sorting or merging utilities (e.g., `Arrays.sort()`, `System.arraycopy()`).
- You may assume both arrays are sorted in **non-decreasing** order.

---

## 🧠 Examples

### Example 1

```
Input:  arr1 = [1, 3, 5], arr2 = [2, 4, 6]
Output: [1, 2, 3, 4, 5, 6]
```

### Example 2

```
Input:  arr1 = [1, 2, 7], arr2 = [3, 5]
Output: [1, 2, 3, 5, 7]
```

---

## 🔒 Constraints

- `1 <= arr1.length, arr2.length <= 10^5`
- `-10^9 <= arr[i] <= 10^9`
- Arrays are already sorted in **non-decreasing** order.
- Do not use any inbuilt functions for merging or sorting.

---

## ✅ Approach

### Two Pointer Technique

1. Initialize two pointers: one for `arr1`, and one for `arr2`.
2. Compare elements pointed to by both pointers:
    - Add the smaller element to the result array.
    - Move the pointer forward for the array whose element was taken.
3. Once one array is exhausted, add the remaining elements of the other array.
4. Return the merged result.

---

### 🧠 Time & Space Complexity

- **Time Complexity:** `O(n + m)`  
  Where `n` and `m` are the lengths of `arr1` and `arr2`.

- **Space Complexity:** `O(n + m)`  
  A new array is created to hold the merged result.

---

## 📌 Notes

- This method avoids any use of Java's or any language's built-in sorting or merging utilities.
- The input arrays are assumed to be sorted; if unsorted, sort manually first (but not allowed in this version).
- Suitable for problems where merging logic is more important than using library features.

---

## 📂 Related Topics

- Arrays
- Two Pointers
- Merge Algorithms
- Sorting Fundamentals
- Interview Preparation
