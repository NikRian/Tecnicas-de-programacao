import java.util.Scanner;

public class item14 {

    public static int[] removeElement(int[] vector,int element) {

        int count = 0;

        for(int aux = 0; aux < vector.length; aux++) {
            if(vector[aux] == element) {
                count++;
            }
        }

        int size = vector.length-count;
        
        int[] newVector = new int[size];

        int index = 0;
        

        for(int aux = 0; aux < vector.length; aux++) {

            if(vector[aux] != element) {
                newVector[index] = vector[aux];
                index++;
            }
        }


        return newVector;
    }
    public static void main(String[] args) {
        
        try(Scanner input = new Scanner(System.in)) {
            
            int size = input.nextInt();

            int[] vector = new int[size];


            for(int aux = 0; aux < size; aux++) {
                vector[aux] = input.nextInt();
            }

            int number = input.nextInt();

            int[] resultVector = removeElement(vector,number);

            for(int aux = 0; aux < resultVector.length; aux++) {
                System.out.println(resultVector[aux]);
            }
        }
    }

}