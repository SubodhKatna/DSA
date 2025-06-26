# 🔍 Missing Number in a Sorted Array

This repository contains a solution to the classic problem of finding the **missing number in a sorted array** using **Binary Search**. This is a common problem in technical interviews and competitive programming.

---

## 🧩 Problem Statement

You are given a sorted array of distinct integers where the elements range from `0` to `n`, but exactly **one number is missing** from the range. Your task is to find that missing number in **O(log n)** time.

---

## 🧠 Example

### Example 1

```
Input:  arr = [0, 1, 2, 3, 4, 6, 7]
Output: 5
```

### Explanation:
The array contains numbers from 0 to 7, except 5. So the missing number is **5**.

---

## 🔒 Constraints

- The array is **sorted** in ascending order.
- Elements are **distinct**.
- The array contains `n` elements, ranging from `0` to `n` with exactly one number missing.

---

## ✅ Approach

### Binary Search (Efficient)

1. Use binary search to look for the **first index** where `arr[index] != index`.
2. If `arr[mid] == mid`, then the missing number must be on the **right** side.
3. If `arr[mid] != mid`, then the missing number is on the **left** side (or at `mid`).
4. When the loop ends, the `left` pointer will be pointing to the missing number.

---

### 🧠 Time & Space Complexity

- **Time Complexity:** `O(log n)`
- **Space Complexity:** `O(1)`

---

## 📌 Notes

- This problem is a variation of the **"Missing Number"** problem and is optimized for **sorted input arrays**.
- A brute-force approach would require linear time, but binary search brings it down to logarithmic time.

---

## 📂 Related Topics

- Binary Search
- Arrays
- Searching Problems
- Interview Questions
