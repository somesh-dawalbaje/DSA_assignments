import java.util.Scanner;

/**
 * PalindromeString
 */
class PalindromeString {
    public static boolean isPalindrome(String S, int start, int end){
        if(start > end){
            return true;
        }
        if(S.charAt(start) != S.charAt(end)){
            return false;
        }
        return isPalindrome(S, ++start, --end);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(isPalindrome(str, 0, str.length()-1));

    }
}