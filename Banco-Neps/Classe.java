/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Neps;
import java.util.Scanner;

public class Classe {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        
        double A = dado.nextInt();

        double B = dado.nextInt();

        double media = (A + B) / 2;

        if(media < 4) {
            System.out.println("Reprovado");    
        } else {
            if(media >= 4 && media < 7) {
                System.out.println("Recuperacao");
            } else {
                System.out.println("Aprovado");
            }
        }
    }
}

}
