import java.util.Scanner;

public class item3 {

    public static Float weightedAvarage(float[] values, int[] weight) {

        float result = 0;
        int totalWeight = 0;

        for(int aux = 0; aux < values.length; aux++) {
            result += (values[aux]*weight[aux]) ;
            totalWeight += weight[aux];
        }

        result /= totalWeight;

        return result;
    }
    public static void main(String[] args) {
        
        try(Scanner input = new Scanner(System.in)) {
            
            int size = input.nextInt();

            float[] grades = new float[size];
            int[] weight = new int[size];

            for(int aux = 0; aux < size; aux++) {
                grades[aux] = input.nextFloat();
                weight[aux] = input.nextInt();
            }

            System.out.println(weightedAvarage(grades, weight));
        }
    }
}