package exercicios.java;

import java.util.Scanner;

/*
    Dado um número inteiro X, encontre todos os divisores de X.

    Entrada
    A entrada consiste de apenas uma linha contendo o número X.

    Saída
    A saída do seu programa deve conter apenas uma linha com os divisores de 

    X separados por um espaço em branco. O divisores devem ser impressos em ordem crescente.
*/

public class Todos_os_Divisores {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        
        int X = dado.nextInt();
        for(int i=1; i<=X; i++) {
            if(X % i == 0) {
                System.out.print(i+ " ");
            }
        }
    }
}
