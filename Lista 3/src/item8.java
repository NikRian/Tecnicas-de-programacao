import java.util.Scanner;

public class item8{

    public static int highNumber(int[] vector, int control) {

        int size = vector.length-1;

        for(int aux = size; aux > 0; aux--) {

            if (vector[aux] < vector[aux-1])
            {
                int temp = vector[aux];
                vector[aux] = vector[aux-1];
                vector[aux-1] = temp;
                aux = vector.length;
            }
        }

        int kNumber = vector[size];

        for(int aux = size; aux >= 0; aux--) {
            if((kNumber >= vector[aux]) && (control > 0)) {
                kNumber = vector[aux];
                control--;
            }
        }

        return kNumber;

    }
    public static void main(String[] args) {
        
        try(Scanner input = new Scanner(System.in)) {
            
            int size = input.nextInt();

            int[] vector = new int[size];

            for(int aux = 0; aux < size; aux++) {
                vector[aux] = input.nextInt();
            }

            int control = input.nextInt();

            System.out.println(highNumber(vector, control));

        }
    }
}