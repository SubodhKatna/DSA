# 🇳🇱 Dutch National Flag Algorithm

## 🧩 Problem Statement

You are given an array `arr[]` containing only **three distinct values**: `0`, `1`, and `2`.

Your task is to **sort the array in-place** such that:

- All `0`s come first,
- Followed by all `1`s,
- Followed by all `2`s.

This problem is known as the **Dutch National Flag problem**, proposed by Edsger Dijkstra.

---

## 📥 Input

- An array `arr[]` of length `n` where each element is either `0`, `1`, or `2`.

---

## 📤 Output

- Modify the array **in-place** to group the elements in the order: `0s`, then `1s`, then `2s`.

---

## 🧠 Examples

### Example 1

```
Input:  [2, 0, 2, 1, 1, 0]
Output: [0, 0, 1, 1, 2, 2]
```

### Example 2

```
Input:  [2, 0, 1]
Output: [0, 1, 2]
```

### Example 3

```
Input:  [0]
Output: [0]
```

---

## 🔒 Constraints

- `1 <= arr.length <= 10^5`
- `arr[i] ∈ {0, 1, 2}` for all valid indices `i`

---

## ✅ Approach: Dutch National Flag Algorithm

This is a **three-pointer approach**:

- **Low pointer (`low`)**: Marks the end of the `0`s section.
- **Mid pointer (`mid`)**: Current index under consideration.
- **High pointer (`high`)**: Marks the start of the `2`s section.

### Steps:

1. Initialize:  
   `low = 0`, `mid = 0`, `high = n - 1`

2. Loop while `mid <= high`:
    - If `arr[mid] == 0`: Swap with `arr[low]`, increment both `low` and `mid`
    - If `arr[mid] == 1`: Leave it, just increment `mid`
    - If `arr[mid] == 2`: Swap with `arr[high]`, decrement `high`

3. Continue until all elements are in place.

---

## 🧠 Time & Space Complexity

- **Time Complexity:** `O(n)` — Every element is visited at most once.
- **Space Complexity:** `O(1)` — Sorting is done in-place using pointers.

---

## 📌 Notes

- No sorting algorithm (like QuickSort or MergeSort) is used.
- Works only when the array contains exactly three distinct known values.
- Efficient and widely used in problems involving **categorical data** with 3 states.

---

## 🧪 Test Case Summary

| Test Case | Input               | Output              | Notes                     |
|-----------|---------------------|----------------------|---------------------------|
| TC1       | [2, 0, 2, 1, 1, 0]  | [0, 0, 1, 1, 2, 2]   | Classic case              |
| TC2       | [0, 1, 2, 0, 1, 2]  | [0, 0, 1, 1, 2, 2]   | Interleaved values        |
| TC3       | [2, 2, 2, 2]        | [2, 2, 2, 2]         | All values same (2s)      |
| TC4       | [0, 0, 0, 0]        | [0, 0, 0, 0]         | All values same (0s)      |
| TC5       | [1, 1, 1, 1]        | [1, 1, 1, 1]         | All values same (1s)      |
| TC6       | [1, 2, 0]           | [0, 1, 2]            | Random short input        |

---

## 📂 Related Topics

- Arrays
- Two Pointers
- Sorting
- In-Place Algorithms
- Interview Algorithms

---

Let me know if you'd like:
- A variation for `n` unique values instead of 3,
- Counting occurrences instead of sorting, or
- An animated walkthrough or visualization.
