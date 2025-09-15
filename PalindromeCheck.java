public class PalindromeCheck {


    public boolean isPalindrome(int number) {
        if (number < 0) {
            return false; 
        }

        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        PalindromeCheck checker = new PalindromeCheck();

        int num1 = 121;
        int num2 = 123;
        int num3 = -121;
        int num4 = 9889;

        System.out.println(num1 + " is a palindrome? " + checker.isPalindrome(num1));
        System.out.println(num2 + " is a palindrome? " + checker.isPalindrome(num2));
        System.out.println(num3 + " is a palindrome? " + checker.isPalindrome(num3));
        System.out.println(num4 + " is a palindrome? " + checker.isPalindrome(num4));
    }
}
