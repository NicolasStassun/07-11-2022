import java.util.Scanner;
import java.util.Random;

public class ATV1 {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[]args){
        Random numero = new Random();

        int[] A = new int[9];
        int[] B = new int[9];
        int[] C = new int[9];

        for(int a=0;a<9;a++) {
            A[a] = numero.nextInt();
        }
        for(int b=0;b<9;b++) {
            B[b] = numero.nextInt();
        }
        for (int i = 0; i < 9; i++) {
                C[i] = A[i] - B[i];
        }

        for(int i=0;i<9;i++){
            System.out.println("----------------------------------");
            System.out.println("A = "+A[i]);
            System.out.println(" - ");
            System.out.println("B = "+B[i]);
            System.out.println(C[i]);
            System.out.println("----------------------------------");
        }


    }
}
