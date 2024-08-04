
package OBI;

import java.util.Scanner;
public class damas {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int N = dado.nextInt();
        int dama[][] = new int[N][2];
        int resposta[] = new int[N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < 2; j++) {
                dama[i][j] = dado.nextInt();
                
                
            }
            
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < 2; j++) {
                if(dama[i][0] == dama[i][1]) {
                    resposta[i]++;
                }
                if(i > 0 && dama[i][j] == dama[i-1][j]) {
                    resposta[i]++;
                }

              
                
                
            }
            
            
            
            
        }    
        for(int i = 0; i < N; i++) {
            System.out.println(resposta[i]);
        }
        

    }
    
}
