import java.util.Scanner;

public class item10{

    public static boolean isTheSame(int[] vector1, int[] vector2) {

        boolean equal = true;

        for(int aux = 0; aux < vector1.length; aux++) {

            if(vector1[aux] != vector2[aux]) {
                equal = false;
            }
        }

        return equal;
    }
    public static void main(String[] args) {
        
        try(Scanner input = new Scanner(System.in)) {
            
            int size = input.nextInt();

            int[] vector1 = new int[size];
            int[] vector2 = new int[size];

            for(int aux = 0; aux < size; aux++) {
                vector1[aux] = input.nextInt();
            }

            for(int aux = 0; aux < size; aux++) {
                vector2[aux] = input.nextInt();
            }

            System.out.println(isTheSame(vector1, vector2));
        }
    }
}