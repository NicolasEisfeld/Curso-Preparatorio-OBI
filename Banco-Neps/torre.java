/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OBI;

import java.util.Scanner;

public class torre {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int N = dado.nextInt();
        int soma_i = 0, soma_j = 0;
        int torre = 0;
        int X[][] = new int[N][N];
        for(int i=0; i < N; i++) {
            for(int j=0; j < N; j++) {
                X[i][j] = dado.nextInt();
                
            }
            
        }
        for(int i=0; i < N; i++) {
            for(int j=0; j < N; j++) {
                soma_i += X[i][j];
                soma_j += X[i][j];                
            }
            
            
        }
        for(int i=0; i < N; i++) {
            for(int j=0; j < N; j++) {
                torre = soma + soma[j] - (2 * soma[i][j]);          
            }
            
            
        }        
        
    }
    
}
