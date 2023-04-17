import java.util.Scanner;

public class item11 {

    public static float exponentiation(float base, int exponent) {
        float baseTemp = base;
        for(int aux = 1; aux < exponent; aux++) {
            base *= baseTemp;
        }
        return base;
    }
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            float base = input.nextFloat();
            int exponent = input.nextInt();

            System.out.println(exponentiation(base, exponent));
        }
    }
}
