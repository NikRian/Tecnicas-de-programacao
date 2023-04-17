import java.util.Scanner;

public class item7 {

    public static boolean isAscending(int[] vector) {

        boolean isAcending = true;

        for(int aux = vector.length-1; aux > 0; aux--) {

            if (vector[aux] < vector[aux-1])
            {
                isAcending = false;
            }
        }

        return isAcending;

    }
    public static void main(String[] args) {
        
        try(Scanner input = new Scanner(System.in)) {
            
            int size = input.nextInt();

            int[] vector = new int[size];

            for(int aux = 0; aux < size; aux++) {
                vector[aux] = input.nextInt();
            }

            if (isAscending(vector)) {
                System.out.println("é");
            } else {
                System.out.println("nun é");
            }

        }
    }

}