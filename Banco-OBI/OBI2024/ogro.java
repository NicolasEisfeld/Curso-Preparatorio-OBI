import java.util.Scanner;

public class ogro {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        int E = dado.nextInt();
        int D = dado.nextInt();
        int resultado;
        if (E > D) {
            resultado = E + D;
        } else {
            resultado = 2 * (D - E);
        }
        System.out.println(resultado);
    }
            
}
