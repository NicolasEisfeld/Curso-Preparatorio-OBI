package OBI;

import java.util.Scanner;

public class cartomancia {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int N = dado.nextInt();
        int pontos_Enzo = 0, pontos_Lobo = 0;
        String resposta_Enzo = dado.nextLine();
        String resposta_Lobo = dado.nextLine(); 
        System.out.println("fa");
        String gabarito = dado.nextLine();
        System.out.println("KA");
        for(int i=0; i < gabarito.length(); i++) {
            char resposta = resposta_Enzo.charAt(i);
            if(resposta == gabarito.charAt(i)) {
                pontos_Enzo++;
            }
            resposta = resposta_Lobo.charAt(i);
            if(resposta == gabarito.charAt(i)) {
                pontos_Lobo++;
            }
            
        }
        if(pontos_Enzo == pontos_Lobo) {
            System.out.println("Empate");
        }
        if(pontos_Enzo > pontos_Lobo) {
            System.out.println("Enzo");
        }
        if(pontos_Enzo < pontos_Lobo) {
            System.out.println("Lobo");
        }        
       

        
    }
    
}
