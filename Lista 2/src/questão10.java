import java.util.Scanner;

public class questão10 {

    /*public static int meio
    (int number) {

        number/=2;

        return number;
    }*/

    static void clear() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        clear();

        try(Scanner ler = new Scanner(System.in)) {

            int tamanho = ler.nextInt();

            clear();

            /*for(int x = 0; x < tamanho; x++) {

                for(int y = 0; y <= x; y++) {

                    System.out.print(y+ "   ");
                }
                System.out.print("\n");
            }*/

            /*int control = 0;

            for(int x = 0; x < tamanho; x++) {

                for (int y = 0; y < tamanho; y++) {

                    if(control % 2 == 0) {
                        System.out.print("@   ");
                    } else {
                        System.out.print("*   ");
                    }
                    control++;
                }
                System.out.print("\n");
            }*/
            

            for(int x = 0; x < tamanho; x ++) {
                if (x == (tamanho/2)) {
                    for(int y = 0; y < tamanho; y++) {
                        System.out.print("@   ");
                    }
                }else if (x % 2 == 0) {
                    for(int y = 0; y < tamanho; y++) {
                        if(y == (tamanho/2)) {
                            System.out.print("@   ");
                        } else {
                            System.out.print(y+"   ");
                        }
                    }
                } else{
                    for(int y = tamanho -1;y >= 0; y--) {
                        if(y == (tamanho/2)) {
                            System.out.print("@   ");
                        } else {
                            System.out.print(y+"   ");
                        }
                    }
                }

                System.out.print("\n");
            }
            
            
            
        }
    }
}
