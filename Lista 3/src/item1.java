import java.util.Scanner;

public class item1 {

    public static Float arraySum(float[] array) {

        float sum = 0;

        for (int aux = 2; aux < (array.length-2); aux++) {
            
            sum += array[aux];
        }

        return sum;
    }
    public static void main(String[] args) {

        try(Scanner scan = new Scanner(System.in)) {

            int size = scan.nextInt();

            float[] array = new float[size];

            for (int aux = 0; aux < size; aux++) {
            
                array[aux] = scan.nextFloat();
            }

            System.out.println(arraySum(array));
        }
    }
}