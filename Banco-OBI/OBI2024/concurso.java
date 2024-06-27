import java.util.Scanner;

public class concurso {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        // Num de participantes
        int N = dado.nextInt();
        // Num de aprovados min
        int K = dado.nextInt();
        // Começo da nota de corte
        int C = 0;
        // Começo da lista de Notas
        int A = dado.nextInt();
        if (C < A) {
                C = A;
            }
        for (int i=1; i<N; i++) {
            A = dado.nextInt();

            if (C < A) {
                C = A;
            }
        }
        
        System.out.println(C);
    }
}
