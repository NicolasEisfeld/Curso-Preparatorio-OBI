
import java.util.Scanner;


public class sanduiche {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        
        int N = dado.nextInt();
        int D = dado.nextInt();
        int C[] = new int[N];
        int soma = 0;
        int resposta = 0;
        
        for(int i = 0; i < N; i++) {
            C[i] = dado.nextInt();
        }
        
        for(int i = 0; i < N; i++) {
            
            soma += C[i]; // Somatório até i
            
            if(soma == D) {
                resposta++;
            }
        }
    }
}
