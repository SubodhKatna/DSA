# 🔍 Find the Maximum Element in a 2D Array

## 🧩 Problem Statement

You are given a **2D array (matrix)** of integers. Your task is to **find and return the maximum element** present in the matrix.

---

## 📥 Input

- A 2D integer array `arr[][]` of dimensions `m x n` (where `m` is the number of rows and `n` is the number of columns).
- Each element can be a positive, negative, or zero value.

---

## 📤 Output

- Return a single integer: the **maximum value** among all the elements in the 2D array.

---

## 🧠 Examples

### Example 1

```
Input:
arr = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]
Output: 9
```

### Example 2

```
Input:
arr = [
  [-1, -2, -3],
  [-4, -5, -6]
]
Output: -1
```

### Example 3

```
Input:
arr = [
  [42]
]
Output: 42
```

### Example 4

```
Input:
arr = [
  [0, 0],
  [0, 0]
]
Output: 0
```

### Example 5

```
Input:
arr = [
  [100, 200],
  [150, 180]
]
Output: 200
```

---

## 🔒 Constraints

- `1 <= m, n <= 10^3`
- `-10^9 <= arr[i][j] <= 10^9`
- The 2D array is guaranteed to be **non-empty** and **rectangular** (i.e., all rows are of equal length).

---

## ✅ Approach

### Simple Iteration

1. Initialize a variable `max` with the first element of the array.
2. Use nested loops to traverse each row and column of the array.
3. For each element, compare it with the current `max`. If it's greater, update `max`.
4. After traversing all elements, return the `max`.

---

### 🧠 Time & Space Complexity

- **Time Complexity:** `O(m * n)` — Each element is visited exactly once.
- **Space Complexity:** `O(1)` — Only a single variable is used to store the current maximum.

---

## 📌 Notes

- Works for all types of integers, including negatives and zero.
- The initial value should always be set to `arr[0][0]` to avoid incorrect results for negative-only matrices.

---

## 📂 Related Topics

- Arrays
- 2D Matrix Traversal
- Maximum/Minimum Search
- Brute Force Algorithms
- Interview Basics
