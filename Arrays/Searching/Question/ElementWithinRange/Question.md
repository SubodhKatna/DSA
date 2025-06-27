# 📏 Count Elements Within a Range Around a Given Index

## 🧩 Problem Statement

You are given:

- A **sorted array** of integers.
- An **integer `index`** representing a position in the array.
- An **integer `k`** representing the range offset.

Your task is to **count how many elements in the array fall within the range** `[index - k, index + k]` (inclusive), where the range is defined **based on value**, not on array position.

---

## 📥 Input

- An integer array `arr[]` of size `n`, sorted in increasing order.
- An integer `index` representing a value (not the index position in the array).
- An integer `k` which defines the value range as `index - k` to `index + k`.

---

## 📤 Output

- An integer indicating the **number of elements in the array that lie within the range** `[index - k, index + k]` (inclusive).

---

## 🧠 Example

### Example 1

```
Input:  
arr = [2, 5, 8, 12, 16, 23, 38]  
k = 13  
index = 6

Range = [6 - 13, 6 + 13] = [-7, 19]

Output:  
Number of elements in range: 5
```

**Explanation:**  
The numbers within the range [-7, 19] are: [2, 5, 8, 12, 16] → 5 elements.

---

## 🔒 Constraints

- `1 ≤ arr.length ≤ 10^5`
- `-10^9 ≤ arr[i], k, index ≤ 10^9`
- The array may contain both positive and negative numbers.
- The array is assumed to be sorted in non-decreasing order.

---

## ✅ Approach

1. Compute the minimum and maximum of the range:
   ```
   min = index - k  
   max = index + k
   ```

2. Iterate through the array:
    - For each element `j`, check if it satisfies `min <= j <= max`.
    - If yes, increment the count.

3. Return the final count of such elements.

---

## 🧠 Time & Space Complexity

- **Time Complexity:** `O(n)` — Every element is visited once.
- **Space Complexity:** `O(1)` — Only a few variables are used, no extra space required.

---

## 📌 Notes

- Although the array is sorted, this solution does **not take advantage of binary search**. You can improve the efficiency by using binary search to find the bounds (first and last valid index).
- Useful in problems involving **sliding windows**, **range-based queries**, or **geospatial calculations**.

---

## 📂 Related Topics

- Arrays
- Range Queries
- Linear Search
- Optimization using Binary Search (potential)

---

Let me know if you want an optimized binary search version or implementation in a different programming language.
