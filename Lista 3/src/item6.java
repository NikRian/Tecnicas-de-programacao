import java.util.Scanner;

public class item6 {

    public static int[] ascendingOrder(int[] vector) {

        int size = vector.length-1;

        for(int aux = size; aux > 0; aux--) {

            if (vector[aux] < vector[aux-1])
            {
                int temp = vector[aux];
                vector[aux] = vector[aux-1];
                vector[aux-1] = temp;
                aux = size+1;
            }
        }

        return vector;

    }
    public static void main(String[] args) {
        
        try(Scanner input = new Scanner(System.in)) {
            
            int size = input.nextInt();

            int[] vector = new int[size];

            for(int aux = 0; aux < size; aux++) {
                vector[aux] = input.nextInt();
            }

            int[] acendingVector = ascendingOrder(vector);

            for(int aux = 0; aux < size; aux++) {
                System.out.println(acendingVector[aux]);
            }

        }
    }

}