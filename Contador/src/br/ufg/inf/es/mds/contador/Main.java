package br.ufg.inf.es.mds.contador;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Contador contador = new Contador();
        int op;
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("=====================================");
            System.out.println("|             CONTADOR              |");
            System.out.println("|-----------------------------------|");
            System.out.println("|             "+String.format("%08d", contador.getItens())+"              |");
            System.out.println("|===================================|");
            System.out.println("|  1. Add   |  2. Zerar  |  3. Sair |");
            System.out.println("=====================================");
            System.out.print("-> ");
            op = in.nextInt();

            switch (op){
                case 1:
                    contador.incrementa();
                    break;
                case 2:
                    contador.setZero();
                    break;
                case 3:
                    System.out.println("Contador zerado, fim da execução!");
                    break;
                default:
                    System.out.println("Entre com um valor entre 1 e 3!");
                    break;
            }
            for(int i = 0; i<100; i++){
                System.out.println(" ");
            }
        }while (op != 3);
    }
}
