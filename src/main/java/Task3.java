import java.util.Scanner;

/**
 * @author Stepan Morgachev
 * @date 16.08.2023 21:22
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
