/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OBI;

import java.util.Scanner;
public class pedras {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int N = dado.nextInt();
        while(N != 0) {
            N -= 1;
            if(N == 0) {
                System.out.println("Lalic");
                break;
            }
            N -= 2;
            if(N == 0) {
                System.out.println("Enzo");
                break;
            }
            
        }
        
    }
    
}
