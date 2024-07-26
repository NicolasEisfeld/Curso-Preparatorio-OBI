package OBI;

import java.util.Scanner;

public class campeonato {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        
        int L = 0, K = 0;
        int diferenca = 0;
        for(int i=1; i<=16; i++) {
            int X = dado.nextInt();
            if(X == 9) {
                K = i;
            }
            if(X == 1) {
                L = i;
            }            
        }
        if(K > L) {
            diferenca = K - L;
            if(diferenca < 2) {
                System.out.print("oitavas");
            } 
            if(diferenca < 5 && diferenca >= 2) {
                System.out.print("quartas");
            }
            if(diferenca < 9 && diferenca >= 5) {
                System.out.print("semifinal");
            }
            if(diferenca < 16 && diferenca >= 9) {
                System.out.print("final");  
            }
        }
        if(K < L) {
            diferenca = L - K;
            if(diferenca < 2) {
                System.out.print("oitavas");
            } 
            if(diferenca < 5 && diferenca >= 2) {
                System.out.print("quartas");
            }
            if(diferenca < 9 && diferenca >= 5) {
                System.out.print("semifinal");
            }
            if(diferenca < 16 && diferenca >= 9) {
                System.out.print("final");  
            }
        }     
    }
}
