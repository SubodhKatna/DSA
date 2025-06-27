# 🌀 Spiral Insertion into a 2D Matrix

## 🧩 Problem Statement

You are given an **empty 2D integer matrix** (with all elements initially zero). Your task is to **fill the matrix in spiral order**, starting from the top-left corner and continuing clockwise.

---

## 📥 Input

- A 2D matrix `matrix[][]` of size `m x n` (number of rows × number of columns), initialized with zeros.
- You must fill it **in-place** with consecutive integers from `1` to `m * n`.

---

## 📤 Output

- A matrix with all elements filled in **spiral order** starting from 1.

---

## 🧠 Examples

### Example 1: 3×3 Matrix

```
Input:
matrix = [
  [0, 0, 0],
  [0, 0, 0],
  [0, 0, 0]
]

Output:
[
  [ 1,  2,  3],
  [ 8,  9,  4],
  [ 7,  6,  5]
]
```

### Example 2: 4×4 Matrix

```
Output:
[
  [ 1,  2,  3,  4],
  [12, 13, 14,  5],
  [11, 16, 15,  6],
  [10,  9,  8,  7]
]
```

### Example 3: 3×4 Matrix

```
Output:
[
  [ 1,  2,  3,  4],
  [10, 11, 12,  5],
  [ 9,  8,  7,  6]
]
```

### Example 4: 4×3 Matrix

```
Output:
[
  [ 1,  2,  3],
  [10, 11,  4],
  [ 9, 12,  5],
  [ 8,  7,  6]
]
```

---

## 🔒 Constraints

- `1 <= m, n <= 1000`
- Time and space efficiency are important for larger matrices.
- You must **not** use extra space for another matrix.

---

## ✅ Approach

### Spiral Filling Logic

1. Initialize four boundary pointers:
    - `top = 0`, `bottom = rows - 1`
    - `left = 0`, `right = columns - 1`

2. Use a `while` loop to fill the matrix in spiral order:
    - Traverse from **left to right** (top row)
    - Traverse from **top to bottom** (right column)
    - Traverse from **right to left** (bottom row, if still valid)
    - Traverse from **bottom to top** (left column, if still valid)

3. Update boundaries (`top`, `bottom`, `left`, `right`) after each layer.

4. Use a counter (`count`) starting from 1 to track current value.

---

## 🧠 Time & Space Complexity

- **Time Complexity:** `O(m * n)` — Every cell is visited exactly once.
- **Space Complexity:** `O(1)` — The matrix is modified in-place; no extra space is used.

---

## 📌 Notes

- Spiral traversal is a common pattern in matrix-related problems and interview questions.
- This can be extended to:
    - **Anti-clockwise spiral filling**
    - **Printing instead of filling**
    - **Zigzag, diagonal, or boundary-only traversals**

---

## 🧪 Test Cases

| Test Case | Matrix Size | Output Pattern             |
|-----------|-------------|----------------------------|
| TC 1      | 3 × 3       | Classic square spiral      |
| TC 2      | 4 × 4       | Larger perfect square      |
| TC 3      | 3 × 4       | Rectangular (wide)         |
| TC 4      | 4 × 3       | Rectangular (tall)         |
| TC 5      | 1 × 5       | Single row                 |
| TC 6      | 5 × 1       | Single column              |

---

## 📂 Related Topics

- Matrices
- 2D Array Traversal
- Simulation
- Pattern Problems
- In-place Algorithms

