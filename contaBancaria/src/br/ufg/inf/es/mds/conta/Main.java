package br.ufg.inf.es.mds.conta;

import java.util.Scanner;

public class Main {

    public static void acesso(Pessoa x, Conta conta){
        int op = 0;
        float valor;
        Scanner in = new Scanner(System.in);
        System.out.println("Bem vindo ao gerenciamento de contas!");
        System.out.print("Entre com a chave de sua conta: ");
        int key = in.nextInt();
        if (key == conta.getChave() && key == x.getChave()){
            while (op != 5) {
                System.out.println("Por favor, escolha uma opção:");
                System.out.println("1. Consultar Saldo;");
                System.out.println("2. Sacar;");
                System.out.println("3. Depositar;");
                System.out.println("4. Exibir detalhes da conta;");
                System.out.println("5. Sair.");
                System.out.print("Opção: ");
                op = in.nextInt();

                switch (op){
                    case 1:
                        System.out.println("Saldo da conta: "+conta.getSaldo());
                        System.out.println(" ");
                        break;
                    case 2:
                        System.out.print("Entre com o valor a ser retirado: ");
                        valor = in.nextFloat();
                        conta.retira(valor);
                        break;
                    case 3:
                        System.out.print("Entre com o valor a ser depositado: ");
                        valor = in.nextFloat();
                        conta.deposita(valor);
                        break;
                    case 4:
                        exibeConta(conta, x);
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Entre com um numero entre 1 e 5");
                        break;
                }
            }
        }
    }

    public static void exibeConta(Conta conta, Pessoa pessoa){
        System.out.println("==============================");
        System.out.println("       DETALHES DA CONTA      ");
        System.out.println("");
        System.out.println("Titular: "+pessoa.getNome());
        System.out.println("Número: " +conta.getNumero());
        System.out.println("Saldo: "+ conta.getSaldo());
        System.out.println("==============================");
    }

    public static void main(String args[]){
        int op, qtd, i, j=0;
        String cpf;
        Pessoa x = new Pessoa();
        Conta y = new Conta();
        Scanner in = new Scanner(System.in);

        Pessoa[] cliente = new Pessoa[100];
        Conta[] conta = new Conta[100];

        cliente[0] = new Pessoa("João das Neves", "5660-7669", "12345678910",
                112358);
        conta[0] = new Conta(972003, 112358, "12345678910");

        cliente[1] = new Pessoa("George Tolkien", "5778-4776", "10987654321",
                132134);
        conta[1] = new Conta (200948, 132134, "10987654321");

        System.out.print("Por favor entre com seu CPF: ");
        cpf = in.nextLine();

        for(i = 0; (i < 100 && cliente[i].getChave() != 0); i++){
            if (cliente[i].getCPF().equals(cpf)) {
                x = cliente[i];
                for (j = 0; (j < 100 && conta[j].getChave() != 0); j++) {
                    if (x.getCPF().equals(conta[j].getCPF())) {
                        y = conta[j];
                        j = 1000;
                    }
                    i = 1000;
                }
            }else {
                j = 1;
            }
        }

        if (i < 1000 || j < 1000){
            System.out.println("Conta nao cadastrada!");
        }else{
            acesso(x, y);
        }
    }
}
