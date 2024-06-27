package Neps;

import java.util.Scanner;

public class bondinho {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        
        int A = dado.nextInt();

        int M = dado.nextInt();

        int total = A + M;

        if(total <= 50) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}
