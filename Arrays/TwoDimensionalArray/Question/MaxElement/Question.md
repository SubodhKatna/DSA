# ➕ Sum of All Elements in a 2D Array

## 🧩 Problem Statement

You are given a **2D array (matrix)** of integers. Your task is to **calculate and return the sum of all elements** present in the matrix.

---

## 📥 Input

- A 2D integer array `arr[][]` of size `m x n` (where `m` is the number of rows and `n` is the number of columns).
- Each element `arr[i][j]` can be positive, negative, or zero.

---

## 📤 Output

- Return or print a single integer: the **sum of all elements** in the given 2D array.

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
Output:
45
```

### Example 2

```
Input:
arr = [
  [10, 20],
  [30, 40]
]
Output:
100
```

### Example 3

```
Input:
arr = [
  [0, 0, 0],
  [0, 0, 0]
]
Output:
0
```

### Example 4

```
Input:
arr = [
  [1]
]
Output:
1
```

### Example 5

```
Input:
arr = [
  [-1, -2],
  [-3, -4]
]
Output:
-10
```

---

## 🔒 Constraints

- `1 <= m, n <= 10^3` (Up to 1 million elements)
- `-10^9 <= arr[i][j] <= 10^9`
- The input array is guaranteed to be **rectangular** (each row has the same number of columns).

---

## ✅ Approach

### Nested Loop Traversal

1. Initialize a `sum` variable to `0`.
2. Traverse each row of the 2D array using a loop.
3. For every row, iterate through its columns and add the value to `sum`.
4. After all elements are processed, return the total `sum`.

---

### 🧠 Time & Space Complexity

- **Time Complexity:** `O(m * n)`  
  Every element in the 2D array is visited exactly once.

- **Space Complexity:** `O(1)`  
  Only a single integer variable is used to maintain the sum.

---

## 📌 Notes

- Works with arrays containing positive, negative, or zero values.
- Can be extended to perform additional operations (like average, max, or min).
- Efficient for arrays of moderate to large sizes due to linear traversal.

---

## 📂 Related Topics

- Arrays
- 2D Matrix Traversal
- Nested Loops
- Elementary Math Algorithms
