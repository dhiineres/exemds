package br.ufg.inf.es.mds.corrida;
import java.util.Random;
public class Main {

    public static void mostra(Carro um, Carro dois, int t){
        System.out.println(um.getName()+" percorreu "+ um.getDistanciaPercorrida()+
                " metros");
        System.out.println(dois.getName()+" percorreu"+
        dois.getDistanciaPercorrida()+" metros");
        System.out.println("Tempo: "+t /60 +" minutos");
    }

    public static void main(String[] args){
        int timer = 0;
        Random gerador = new Random();

        Carro meuCarro = new Carro("Maquina do mal", "roxo", 30);
        Carro oponente = new Carro("Carroca a vapor", "marrom", 25);

        meuCarro.chave();
        oponente.chave();
        System.out.println("CORRIDA INICIADA!!!");
        while ((meuCarro.getDistanciaPercorrida() < 1000) &&
                oponente.getDistanciaPercorrida() < 1000) {
            long tempo = System.currentTimeMillis();
            mostra(meuCarro, oponente, timer);
            if (tempo%2 == 0){
                int j = gerador.nextInt(10);
                meuCarro.acelera(j + 1);
            }else{
                int j = gerador.nextInt(3);
                meuCarro.acelera(j - 3);
            }

            int k = gerador.nextInt(15);
            oponente.acelera(k - 3);
            meuCarro.setDistanciaPercorrida(5);
            oponente.setDistanciaPercorrida(5);

            timer = timer + 5;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("TEMOS UM VENCEDOR!!!");
        Carro vencedor;
        if (meuCarro.getDistanciaPercorrida() >= 1000){
            vencedor = meuCarro;
        }else{
            vencedor = oponente;
        }

        oponente.freia(0);
        meuCarro.freia(0);

        oponente.chave();
        meuCarro.chave();

        System.out.println("FIM DA CORRIDA: ");
        System.out.println("Vencedor: "+vencedor.getName());
    }
}
