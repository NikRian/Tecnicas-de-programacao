public class questao1 {

    static void clear() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) {

        clear();

        for (int contador = 1; contador <= 100; contador++) {

            System.out.println(contador);
        }
    }
}
