import java.util.Scanner;

public class item4 {

    public static int hmtNumber(int[] vector1, int[] vector2, int nWanted) {

        int hmt = 0;

        for(int aux = 0; aux < vector1.length; aux++) {

            if (vector1[aux] == nWanted) {
                hmt ++;
            }
        }

        for(int aux = 0; aux < vector2.length; aux++) {

            if (vector2[aux]== nWanted) {
                hmt ++;
            }
        }

        return hmt;
    }
    public static void main(String[] args) {
        
        try(Scanner input = new Scanner(System.in)) {
            
            int size1 = input.nextInt(),
                size2 = input.nextInt();

            int[]   vector1 = new int[size1],
                    vector2 = new int[size2];

            for(int aux = 0; aux < size1; aux++) {
             vector1[aux] = input.nextInt();
            }

            for(int aux = 0; aux < size2; aux++) {
             vector2[aux] = input.nextInt();
            }

            int number = input.nextInt();

            System.out.println(hmtNumber(vector1,vector2, number)); //hmt == How Manny Times
        }
    }

}