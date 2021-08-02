import java.util.Scanner;

public class p69 {
    // nice 👌

    /*
     * public int mySqrt(int x) { int result = 0; for (int i = 0; i < (Math.sqrt(x)
     * + 1); i++) { if (i * i == x) { result = i; break; } } return result; }
     */
    public int mySqrt(int x) {
        /**
         * if number <2 return itself call the sqrt() floor the value obtained print the
         * result
         */

        if (x <= 1) {
            return x;
        }
        // Time COMPLEXITY:O(logn) as uses newton raphson method
        return (int) Math.floor(Math.sqrt(x));
    }

    // another method
    public int myqrtSUbmit(int x) {
        // using binarySearch
        /**
         * 1.create a binarysearch return ing floor o sqrt(x) 2. init variables ans to
         * store the result 3. if the umber is <2 return itself 4. init left and right
         * values as 1 and x/2 resp 5. until left <= right Find middle of this range,
         * mid = left + right / 2 In case square of mid is equal to x, return it as it
         * is the square root If square of mid is less than x, jump to the right half by
         * setting left = mid + 1 Otherwise, jump to the left half by setting right =
         * mid – 1 and save this value in ans
         */
        // refer
        // https://www.tutorialcup.com/leetcode-solutions/sqrtx-leetcode-solution.htm
        return 0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(new p69().mySqrt(x));
    }
}
