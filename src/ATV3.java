import java.util.Scanner;

public class ATV3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int tamanho = 0;
        System.out.printf("Informe quantos números você quer ordenar: ");
        tamanho = sc.nextInt();
        int[] ordenacao = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            int numero;
            System.out.printf("Informe o número: ");
            numero = sc.nextInt();
            ordenacao[i] = numero;
        }
        boolean troca = true;
        int auxiliar;
        while (troca) {
            troca = false;
            for (int i = 0; i < tamanho - 1; i++) {
                if (ordenacao[i] > ordenacao[i + 1]) {
                    auxiliar = ordenacao[i];
                    ordenacao[i] = ordenacao[i + 1];
                    ordenacao[i + 1] = auxiliar;
                    troca = true;
                }
            }
        }
        for(int i=0;i<tamanho;i++){
            System.out.println(ordenacao[i]);
        }
    }
}