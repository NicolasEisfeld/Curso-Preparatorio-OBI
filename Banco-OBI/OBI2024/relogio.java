import java.util.Scanner;

public class relogio {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        // Horas
        int H = dado.nextInt();
        // Minutos
        int M = dado.nextInt();
        // Segundos 
        int S = dado.nextInt();
        // Segundos adiados
        int T = dado.nextInt();
        S = S + T;
        
        if (S >= 60) {
            M = M + S / 60;
            S = S % 60;
            
        } 
        if (M >= 60) {
                H = H + M / 60;
                M = M % 60;
            }
        if (H > 23) {
            // Dias
            int D = H / 24;
            H = H % 24;
        }
        System.out.println(H);
        System.out.println(M);
        System.out.println(S);
    }
}
