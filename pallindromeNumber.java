import java.util.Scanner;

public class pallindromeNumber {
    public boolean isPallindrome(int x) {
        int newNum = 0;
        int copy = x;
        if (x < 0) {
            return false;
        } else {
            while (x != 0) {
                int p = x % 10;
                newNum = newNum * 10 + p;
                x = x / 10;
            }
            if (newNum == copy) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(new pallindromeNumber().isPallindrome(num));

    }
}