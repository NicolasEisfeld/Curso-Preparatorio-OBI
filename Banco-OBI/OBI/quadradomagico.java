
package OBI;

import java.util.Scanner;

public class quadradomagico {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        int N = dado.nextInt();
        int nums[][] = new int[N][N];
        int cont = 0;
        int soma[] = new int[N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                nums[i][j] = dado.nextInt();
                soma[i] = soma[i] + nums[i][j];
                
            }
            if(soma[i] == soma[i+1]) {
                
            } else{soma[i'] = -1;}
            
        }
        System.out.println(soma);
        
    }
}
