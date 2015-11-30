package br.ufg.inf.es.mds.data;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int op = 0, d, m, a;
        Scanner in = new Scanner(System.in);
        Data data = new Data();

        while (op != 5){
            System.out.println("\n\nData atual: "+ data.getData());
            System.out.println("Escolha uma opção: ");
            System.out.println(" 1. Definir nova data;\n 2. Trocar o dia;");
            System.out.println(" 3. Trocar o mês;\n 4. Trocar o ano;");
            System.out.println(" 5. Sair.");
            System.out.print("Opção: ");
            op = in.nextInt();

            switch (op){
                case 1:
                    System.out.print("Entre com o dia: ");
                    d = in.nextInt();
                    System.out.print("Entre com o mes: ");
                    m = in.nextInt();
                    System.out.print("Entre com o ano: ");
                    a = in.nextInt();

                    data.setData(d, m, a);

                    break;
                case 2:
                    System.out.print("Entre com o novo dia: ");
                    d = in.nextInt();
                    data.setData(d, data.getMes(), data.getAno());

                    break;
                case 3:
                    System.out.print("Entre com o novo mês: ");
                    m = in.nextInt();
                    data.setData(data.getDia(), m, data.getAno());

                    break;
                case 4:
                    System.out.print("Entre com o novo ano: ");
                    a = in.nextInt();
                    data.setData(data.getDia(), data.getMes(), a);

                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Entre com um número entre 1 e 5!");
                    break;
            }
        }
    }
}
