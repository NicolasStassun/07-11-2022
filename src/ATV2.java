import java.sql.SQLOutput;
import java.util.Scanner;

public class ATV2{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int TamanhoVetor=0,i=0;
        System.out.println("Informe o tamanho do vetor: ");
        TamanhoVetor = sc.nextInt();
        String[] nomes = new String[TamanhoVetor];
        long[] telefone = new long[TamanhoVetor];

        while(i<TamanhoVetor){
            System.out.println("Informe o nome: ");
            nomes[i] = sc.next();
            sc.nextLine();
            System.out.println("Informe o telefone: ");
            telefone[i] = sc.nextLong();
            i++;
        }
        for(int opcao=0; opcao!=2;opcao=opcao) {
            String consultaNome="";
            System.out.println(" ======== MENU ======== \n" +
                    "1) Consultar telefone \n" +
                    "2) Sair do programa \n" +
                    "—————————————————————————————— \n");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.printf("Qual o nome que você deseja consultar: ");
                    consultaNome = sc.next();
                    sc.nextLine();
                    for(int a=0; a<TamanhoVetor; a++){
                        if(nomes[a].equals(consultaNome)){
                            System.out.println(nomes[a]);
                            System.out.println(telefone[a]);
                        }
                    }
                break;
            }
        }

    }
}