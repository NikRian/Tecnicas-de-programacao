import java.util.Scanner;

public class questão5 {

    static void clear() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) {

        clear();
        
        try(Scanner ler = new Scanner(System.in)) {

            System.out.println("Qual o limite para a sequência?");
            int limite = ler.nextInt();

            clear();

            for(int x = 0; x <= limite; x++) {

                for(int y = 0; y <= limite; y++) {

                    System.out.println(x+" - "+y);
                }
            }
        }
    }
}
