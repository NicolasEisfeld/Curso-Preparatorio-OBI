/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OBI;

import java.util.Scanner;
public class espelhos {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int N = dado.nextInt();
        int intervalo = 0;
        int a[] = new int[N];
        for(int i: a) {
            a[i] = dado.nextInt();

            
            
        }
        int Q = dado.nextInt();
        for(int j=0; j < Q; j++) {
            String caractere = dado.nextLine();
            int L = dado.nextInt();
            int R = dado.nextInt();
            if (caractere == "?") {
                for(int i = L; i < R; i++) {
                    intervalo += a[i];
                    if(a[i] != a[R-1]) {
                        a[i+1] *= 10;
                    }
                    
                }
                if(intervalo % 3 == 0) {
                    System.out.println("S");
                } else {System.out.println("N");}
                    
            }
            if(caractere == "!") {
                for(int i: a) {
                    if(a[i] == 2) {
                        a[i] = 5;
                    }
                    if(a[i] == 5) {
                        a[i] = 2;
                    }
                    if(a[i] == 6) {
                        a[i] = 9;
                    }
                    if(a[i] == 9) {
                        a[i] = 6;
                    }
                }
            }      
            
        }
        

    }
    
}
