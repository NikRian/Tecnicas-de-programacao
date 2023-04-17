import java.util.Scanner;

public class item9{

    public static int lowNumber(int[] vector, int control) {

        for(int aux = vector.length-1; aux > 0; aux--) {

            if (vector[aux] < vector[aux-1])
            {
                int temp = vector[aux];
                vector[aux] = vector[aux-1];
                vector[aux-1] = temp;
                aux = vector.length;
            }
        }

        int kNumber = vector[0];

        for(int aux = 0; aux < vector.length; aux++) {
            if((kNumber <= vector[aux]) && (control > 0)) {
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

            System.out.println(lowNumber(vector, control));

        }
    }
}