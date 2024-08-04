/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OBI;

import java.util.Scanner;
public class iguaisg {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int N = dado.nextInt();
        int V[] = new int[N];
        int pontos = 1, maior = 1;
        for(int i=0; i < N; i++) {
            V[i] = dado.nextInt();
        }
        for(int i=1; i < N; i++) {
            
            if(V[i] == V[i-1]) {
                pontos++;
                if(pontos > maior) {
                    maior = pontos;
                }
            } else {
                pontos = 1;
            }
        }
        System.out.println(maior);

    }
}

