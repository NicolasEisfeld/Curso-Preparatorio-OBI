
package OBI;

import java.util.Scanner;

public class caixas {

    public static void main(String[] args) {
   Scanner dado = new Scanner(System.in);
        int viagens = 3;
        int A = dado.nextInt();
        int B = dado.nextInt();
        int C = dado.nextInt();
        if(A < B || A < C) {
            viagens--;
        } else {
            if(B < C || B < A) {
                viagens--;
            } else {
                if (C < B || C < A) {
                    viagens--;
                }
            }
        }
        
        if(A != B || B != C || A != C) {
            if((A+B) < C) {
                viagens -= 2;
            } else {
                if((B+C) < A) {
                    viagens -= 2;
                } else {
                    if((A+C) < B) {
                        viagens -= 2;
                    }
                }
            }
        }
    
        if (viagens == 0) {
            viagens++;
        }

        System.out.println(viagens);

    }
    
}
