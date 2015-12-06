package br.ufg.inf.es.mds.bingo;

public class Main {

    public static void showPoints(Sorteio sorteio){
        int[] x = sorteio.getSort();
        System.out.println("Relação dos números sorteados:");
        System.out.println("===================");
        System.out.println("|  M  |  D  |  S  |");
        for (int i = 1; i <= 9; i++){
            System.out.println("| "+String.format("%02d", x[i])+"  | "
                    +String.format("%02d", x[i+9])+"  | "+String.format("%02d", x[i+18])+"  |");
        }
        System.out.println("===================");
    }

    public static void showChart(Cartela cartela){
        int [] x = cartela.getVal();
        System.out.println("===================");
        System.out.println("|  M  |  D  |  S  |");
        System.out.println("| "+String.format("%02d", x[0])+"  | "+x[3]+"  | "+x[6]+"  |");
        System.out.println("| "+String.format("%02d", x[1])+"  | "+x[4]+"  | "+x[7]+"  |");
        System.out.println("| "+String.format("%02d", x[2])+"  | "+x[5]+"  | "+x[8]+"  |");
        System.out.println("===================");
    }

    public static void main(String args[]){
        boolean ok = false;
        int i;
        Sorteio sorteio = new Sorteio();
        Cartela jogador = new Cartela("Voce");
        Cartela oponente = new Cartela("Seu oponente");
        showChart(jogador);
        showChart(oponente);

        while (!jogador.isVencedor() && !oponente.isVencedor()){
            do {
                i = sorteio.sorteio();
                ok = sorteio.validade(i, sorteio.getSort());
            }while (ok == false);

            jogador.verificaCartela(i);
            oponente.verificaCartela(i);
        }
        System.out.println("Temos um vencedor!!!");

        System.out.println("\nSua cartela:");
        showChart(jogador);
        System.out.println("\nCartela do oponente:");
        showChart(oponente);

        showPoints(sorteio);

        if (jogador.isVencedor()){
            System.out.println("O vencedor é "+ jogador.getNome());
        }else{
            System.out.println("O vencedor é "+ oponente.getNome());
        }
    }
}
