import java.util.Scanner;

/**
 * Created by zacharyyonash on 11/10/16.
 */
public class Fibonacci {

    public static int getNth(int n){

        int current = 0;
        int next = 1;
        int temp = 0;

        if(n==1){
            return current;
        }
        for(int i = n; i > 0; i--) {
            temp = next;
            next += current;
            current = temp;
        }

        return current;
    }

    public static void main(String args[]){

        System.out.print("Please enter a number: ");
        Scanner reader = new Scanner(System.in);
        int nth = getNth(reader.nextInt());
        System.out.println(nth);
    }
}
