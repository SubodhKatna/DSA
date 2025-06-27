# 🧮 Find the Square Root of a Number (Integer Part Only)

## 🧩 Problem Statement

You are given a **non-negative integer `x`**. Your task is to **compute and return the square root of `x`**, where the result is **rounded down to the nearest integer** (i.e., the **floor** of the actual square root).

- Do not use any built-in square root functions like `Math.sqrt()` or `pow()`.

---

## 📥 Input

- A single non-negative integer `x`, where `0 ≤ x ≤ 2 * 10^9`.

---

## 📤 Output

- Return an integer `y` such that:
    - `y * y <= x`, and
    - `(y + 1) * (y + 1) > x`.

---

## 🧠 Examples

### Example 1

```
Input:  x = 4
Output: 2
```

### Example 2

```
Input:  x = 8
Output: 2
Explanation: The square root of 8 is approximately 2.828. Since we want only the integer part, the answer is 2.
```

### Example 3

```
Input:  x = 1
Output: 1
```

### Example 4

```
Input:  x = 0
Output: 0
```

---

## 🔒 Constraints

- `0 ≤ x ≤ 2 * 10^9`
- You are **not allowed** to use `Math.sqrt()`, `pow()`, or any similar built-in functions.

---

## ✅ Objective

Design an efficient method to compute the **integer part of the square root** of a number `x`, avoiding brute-force iteration.

---

## 🧠 Recommended Approach

### Binary Search

1. Use binary search in the range `[0, x]` (or `[0, x/2 + 1]` for optimization).
2. For a mid-value:
    - If `mid * mid == x`, return `mid`.
    - If `mid * mid < x`, move to the right half (potential result is higher).
    - If `mid * mid > x`, move to the left half.
3. Track the last value of `mid` where `mid * mid <= x` to get the floor value.

---

### 🧠 Time & Space Complexity

- **Time Complexity:** `O(log x)`
- **Space Complexity:** `O(1)`

---

## 📌 Notes

- Edge cases like `x = 0` and `x = 1` should be handled explicitly.
- Use `long` or equivalent if squaring integers might exceed the maximum integer value.
- Binary search gives a highly efficient solution compared to linear scan.

---

## 📂 Related Topics

- Binary Search
- Mathematical Algorithms
- Interview Questions
- Efficient Computation

---

## 🧪 Sample Test Cases

| Input | Expected Output |
|-------|-----------------|
| 0     | 0               |
| 1     | 1               |
| 4     | 2               |
| 8     | 2               |
| 10    | 3               |
| 16    | 4               |
| 2147395599 | 46339      |
