import java.util.Scanner;

public class questão_9 {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");  
        System.out.flush();  

        try (Scanner ler = new Scanner(System.in)) {

            System.out.print("\nInsira o valor de A: ");
            int A = ler.nextInt();
            
            System.out.print("\nInsira o valor de B: ");
            int B = ler.nextInt();

            if (A > 10 && A + B == 20) {

                System.out.println("\nA + B == 20");

            } else {

                System.out.println("\nnúmero não válido");

            }
        }
    }
}
