# 📊 Count Subarrays of Size K with Sum Greater Than or Equal to Target

## 🧩 Problem Statement

You are given:

- An integer array `arr[]`,
- A window size `k`, and
- A target integer `t`.

Your task is to **count how many contiguous subarrays of size exactly `k`** have a **sum greater than or equal to `t`**.

---

## 📥 Input

- `arr[]`: An array of integers.
- `k`: The size of the subarray (window).
- `t`: The target sum threshold.

---

## 📤 Output

- Return an integer representing the **number of subarrays of size `k`** whose **sum is ≥ target**.

---

## 🧠 Examples

### Example 1

```
Input:
arr = [1, 2, 3, 4, 5]
k = 2
target = 5

Output:
3

Explanation:
Subarrays of size 2:
- [1,2] → sum = 3 → < 5 ❌
- [2,3] → sum = 5 → ✅
- [3,4] → sum = 7 → ✅
- [4,5] → sum = 9 → ✅
Total = 3 valid subarrays
```

### Example 2

```
Input:
arr = [2, 1, 1, 1, 2]
k = 3
target = 4

Output:
2

Explanation:
Valid subarrays: [2,1,1], [1,1,2]
```

### Example 3

```
Input:
arr = [1, 1, 1, 1]
k = 2
target = 3

Output:
0
```

---

## 🔒 Constraints

- `1 <= arr.length <= 10^5`
- `1 <= k <= arr.length`
- `-10^9 <= arr[i] <= 10^9`
- `-10^9 <= target <= 10^9`

---

## ✅ Approach

### Sliding Window Technique

1. **Initialize a window** of size `k` by summing the first `k` elements.
2. If the initial window’s sum ≥ target, increment the count.
3. **Slide the window** by:
    - Subtracting the element that moves out of the window,
    - Adding the element that comes into the window.
4. Repeat until the end of the array is reached.

This approach efficiently computes the sum of each subarray of size `k` in **O(n)** time without recalculating from scratch.

---

## 🧠 Time & Space Complexity

- **Time Complexity:** `O(n)` — Each element is visited once.
- **Space Complexity:** `O(1)` — No extra space required other than a few variables.

---

## 📌 Notes

- Handles both positive and negative integers.
- Works correctly for:
    - Arrays shorter or equal to `k`
    - Negative targets
    - Large input sizes due to O(n) optimization.

---

## 🧪 Test Case Summary

| Test Case | Input Array          | k | Target | Output | Description                           |
|-----------|----------------------|---|--------|--------|---------------------------------------|
| TC1       | [1, 2, 3, 4, 5]      | 2 | 5      | 3      | 3 valid subarrays                     |
| TC2       | [2, 1, 1, 1, 2]      | 3 | 4      | 2      | 2 valid windows of size 3             |
| TC3       | [5, 1, 2, 3, 1]      | 1 | 3      | 3      | Elements ≥ 3 individually             |
| TC4       | [1, 1, 1, 1]         | 2 | 3      | 0      | No subarray meets the threshold       |
| TC5       | [10, 20, 30, 40, 50] | 3 | 100    | 1      | Only last subarray is valid           |

---

## 📂 Related Topics

- Sliding Window
- Arrays
- Subarray Sum
- Optimization Techniques
- Interview Patterns

