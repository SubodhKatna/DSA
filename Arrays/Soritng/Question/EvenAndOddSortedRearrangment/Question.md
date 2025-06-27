# 🔢 Rearrange Array by Even and Odd with Sorted Order

## 🧩 Problem Statement

You are given an array of integers that may contain both **even** and **odd** numbers in any order.

Your task is to **rearrange the array** such that:

1. **All even numbers appear before all odd numbers**.
2. The even numbers are sorted in **ascending order**.
3. The odd numbers are also sorted in **ascending order**.
4. The relative positions of even and odd groups must be maintained — evens first, odds second.

---

## 📥 Input

- A single array of integers `arr[]`, with length `n (1 ≤ n ≤ 10^5)`.
- Elements of the array: `-10^9 ≤ arr[i] ≤ 10^9`.

---

## 📤 Output

- Return or print a **single array** where:
    - All even numbers come first and are sorted.
    - All odd numbers come after and are sorted.

---

## 🧠 Examples

### Example 1

```
Input:  [2, 5, 1, 6, 8, 3, 7, 4, 9]
Output: [2, 4, 6, 8, 1, 3, 5, 7, 9]
```

### Example 2

```
Input:  [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
Output: [2, 4, 6, 8, 10, 1, 3, 5, 7, 9]
```

### Example 3

```
Input:  [1, 3, 5, 7]
Output: [1, 3, 5, 7]   // No evens, odds remain sorted
```

### Example 4

```
Input:  [8, 4, 2]
Output: [2, 4, 8]      // Only evens, sorted in ascending order
```

---

## ✅ Constraints

- The array may contain **duplicates**.
- You must not change the original parity (even/odd classification) of any number.
- You may use **extra space** if necessary, but strive for optimal time and space usage.

---

## 🚀 Objective

Design a solution that meets the following goals:

- **Correctness**: Ensure evens and odds are both sorted in their respective positions.
- **Efficiency**:
    - Time Complexity: Should be better than `O(n^2)`; aim for `O(n log n)` or better.
    - Space Complexity: Extra space is allowed, but in-place solutions are preferred if achievable.

---

## 💡 Hints

- You can separate the array into two lists: one for evens and one for odds.
- Sort each list individually.
- Merge them with evens first and odds next.

---

## 📂 Related Topics

- Arrays
- Sorting Algorithms
- Two-Pass Array Problems
- Classification and Partitioning

---

## 🧪 Test Case Ideas

| Test Case Description        | Input                           | Expected Output               |
|-----------------------------|----------------------------------|-------------------------------|
| Mixed evens and odds        | [2, 5, 1, 6, 8, 3, 7, 4, 9]       | [2, 4, 6, 8, 1, 3, 5, 7, 9]   |
| Only odd numbers            | [5, 3, 1]                         | [1, 3, 5]                     |
| Only even numbers           | [6, 4, 2]                         | [2, 4, 6]                     |
| Already sorted mixed        | [2, 4, 6, 1, 3, 5]                | [2, 4, 6, 1, 3, 5]            |
| Negative numbers included   | [-2, -1, -4, 3, 6]                | [-4, -2, 6, -1, 3]            |

