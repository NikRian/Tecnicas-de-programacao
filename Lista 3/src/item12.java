import java.util.Scanner;

public class item12 {

    public static boolean isPrime(int number) {
        boolean prime = true;
        for (int aux = 2; aux < number; aux++) {
            if(number % aux == 0) {
                prime = false;
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {

            int number = input.nextInt();

            System.out.println(isPrime(number));
        }
    }
}
