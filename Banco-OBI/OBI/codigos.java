
package OBI;
import java.util.Scanner;
public class codigos {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int N = dado.nextInt();
        int nums[] = new int[N];
        int i, cont = 0;
        
        for(i=0; i<nums.length; i++) {
            nums[i] = dado.nextInt();
            if(nums[i] == 1) {
                if(nums[i+1] == 0) {
                    if(nums[i+2] == 0) {
                        cont++;
                    }
                }
            }
           
        }
        System.out.println(cont);

    }
}

