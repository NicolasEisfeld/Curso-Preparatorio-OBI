package OBI;

import java.util.Scanner;

public class zerinhoouum {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        int A = dado.nextInt();
        int B = dado.nextInt();
        int C = dado.nextInt();

        if (B == C && A != B) {
            System.out.println("A");
        } else if (A == C && B != A) {
            System.out.println("B");
        } else if (A == B && A != C){
            System.out.println("C");
        } else {System.out.println("*");}

    }

}
