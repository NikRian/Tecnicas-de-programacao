import java.util.Scanner;

public class item15 {

    public static boolean isPalindrome(String phrase) {

        int leftIndex = 0;
        int rightIndex = phrase.length() - 1;

        while (leftIndex < rightIndex) {
            if (phrase.charAt(leftIndex) != phrase.charAt(rightIndex)) {
                return false;
            }

            leftIndex++;
            rightIndex--;
        }

        return true;
    }
    public static void main(String[] args) {
        
        try(Scanner input = new Scanner(System.in)) {
            
            String phrase = input.next();

            System.out.println(isPalindrome(phrase));
        }
    }

}