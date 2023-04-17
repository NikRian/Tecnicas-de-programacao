import java.util.Scanner;

public class item5 {

    public static int[] vectorCopy(int[] vector) {

        int[] vectorClone = vector.clone();

        return vectorClone;
    }
    public static void main(String[] args) {
        
        try(Scanner input = new Scanner(System.in)) {
            
            int size = input.nextInt();

            int[]   vector = new int[size];

            for(int aux = 0; aux < size; aux++) {
             vector[aux] = input.nextInt();
            }

            int[] clone = vectorCopy(vector);

            for(int aux = 0; aux < size; aux++) {
                System.out.println(clone[aux]);
            }
        }
    }

}