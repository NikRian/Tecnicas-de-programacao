import java.util.Scanner;

public class questão6 {

    static void clear() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) {
        
        clear();

        try(Scanner ler = new Scanner(System.in)) {

            System.out.println("Qual o tamanho de sua matriz?");
            int tamanho = ler.nextInt();

            int[][] matriz = new int[tamanho][tamanho];
            int[][] transposta = new int[tamanho][tamanho];

            clear();

            System.out.println("Insira os válores de sua matriz. Ex.: 1 2 3 4");

            for(int x = 0; x < tamanho; x++) {

                for(int y = 0; y < tamanho; y++) {

                    matriz[x][y] = ler.nextInt();

                    transposta[y][x] = matriz[x][y];
                }
            }

            clear();

            for(int x = 0; x < tamanho; x++) {

                for(int y = 0; y < tamanho; y++) {

                    System.out.print(matriz[x][y]+" ");
                }

                System.out.print(" ->  ");

                for(int y = 0; y < tamanho; y++) {

                    System.out.print(transposta[x][y]+" ");
                }

                System.out.print("\n");
            }

            for(int x = 0; x < tamanho; x++) {

                for(int y = 0; y < tamanho; y++) {

                    if (matriz[x][y] != transposta[x][y]) {
                        System.out.println("\nSua matriz não é simétrica");
                        return;
                    }
                }
            }

            System.out.println("\nSua matriz é simétrica.");

        }
    }
}