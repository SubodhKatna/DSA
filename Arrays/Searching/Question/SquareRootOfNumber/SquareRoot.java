public class SquareRoot {
    public static void main(String[] args) {
        int number = 26;
        int sqrt = findSqrt(number);
        System.out.println("Floor square root of " + number + " is: " + sqrt);
    }

    public static int findSqrt(int n) {
        if (n < 2) return n;

        int left = 1, right = n, ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long)mid * mid == n) return mid;
            if ((long)mid * mid < n) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}
