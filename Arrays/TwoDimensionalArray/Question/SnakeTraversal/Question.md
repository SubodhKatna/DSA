# 🐍 Snake Pattern Traversal of a 2D Array

## 🧩 Problem Statement

You are given a **2D integer matrix**. Your task is to traverse and print the elements of the matrix in a **snake pattern**, defined as follows:

- For **even-numbered rows** (starting from 0), traverse **left to right**.
- For **odd-numbered rows**, traverse **right to left**.

---

## 📥 Input

- A 2D array `arr[][]` of dimensions `m x n` (where `m` is the number of rows and `n` is the number of columns).
- Each element in the matrix is an integer.

---

## 📤 Output

- Print the elements in **snake traversal order**, row by row.

---

## 🧠 Examples

### Example 1

```
Input:
arr = [
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9, 10, 11, 12]
]

Output:
1 2 3 4
8 7 6 5
9 10 11 12
```

### Example 2

```
Input:
arr = [
  [10, 20, 30],
  [40, 50, 60]
]

Output:
10 20 30
60 50 40
```

### Example 3

```
Input:
arr = [
  [7, 8],
  [9, 10],
  [11, 12],
  [13, 14]
]

Output:
7 8
10 9
11 12
14 13
```

---

## 🔒 Constraints

- `1 <= m, n <= 10^3`
- `-10^9 <= arr[i][j] <= 10^9`
- The matrix is **rectangular** (i.e., all rows have the same number of columns).

---

## ✅ Approach

1. Loop through each row `i` in the matrix.
2. If `i` is even (i % 2 == 0), print elements from **left to right**.
3. If `i` is odd, print elements from **right to left**.
4. Move to the next line after each row.

This creates the **zig-zag snake-like effect** row-wise.

---

## 🧠 Time & Space Complexity

- **Time Complexity:** `O(m * n)` — Each element is printed once.
- **Space Complexity:** `O(1)` — No additional space is used except variables.

---

## 📌 Notes

- The traversal is row-wise, alternating between forward and reverse directions.
- Often used in pattern problems, matrix manipulation, and printing in special orders.
- Can be easily extended to **column-wise** snake traversal if needed.

---

## 🧪 Test Case Summary

| Test Case | Description                            | Output Format                |
|-----------|----------------------------------------|------------------------------|
| TC 1      | Standard 3x4 matrix                    | Normal snake row-wise        |
| TC 2      | 2x3 matrix                             | Shorter rows, same logic     |
| TC 3      | 4x2 matrix                             | Tall, narrow matrix          |
| TC 4      | Single-column matrix                   | Straight vertical pattern    |
| TC 5      | 2x5 matrix with odd and even elements  | Zigzag pattern clearly shown |

---

## 📂 Related Topics

- Arrays
- 2D Matrix Traversal
- Pattern Printing
- Conditional Loops
- Zigzag Algorithms
