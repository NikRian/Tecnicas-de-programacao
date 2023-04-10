import java.util.Scanner;

public class questão4 {

    static void clear() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) {

        clear();
        try(Scanner ler = new Scanner(System.in)) {
            
            System.out.println("De qual número deseja ver a tábuada de multiplicações?");
            int number = ler.nextInt(), aux = 0;

            clear();
            
            while (aux <= 10) {

                System.out.println(number+" X "+aux+" = "+(number*aux));
                aux++;
            }
        }
    }
}
