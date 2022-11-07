import java.util.Scanner;

public class ATV4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args) {

        int[] numeros = new int[9];
        int referencia = 0, num = 0, menor = 0, igual = 0;

        System.out.println("Informe o valor de referência: ");
        referencia = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o número: ");
            num = sc.nextInt();
            numeros[i] = num;
        }
        for (int i = 0; i < 10; i++) {
            if (numeros[i] < referencia) {
                menor++;
            }
            if (numeros[i] == referencia) {
                igual++;
            }
            if (numeros[i] > referencia) {
                System.out.println(numeros[i]);
            }
        }
        System.out.println("--==============================================--");
        System.out.println(menor+" valores são menores que a referência.");
        System.out.println(igual+" valores são iguais a referência.");
        System.out.println("--==============================================--");
    }

}
