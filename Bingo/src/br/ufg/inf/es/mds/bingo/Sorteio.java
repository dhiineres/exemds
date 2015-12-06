package br.ufg.inf.es.mds.bingo;

import java.util.Random;

public class Sorteio {
    private int[] sort = new int[28];

    public Sorteio(){
        for (int i = 1; i < 28; i ++){
            this.sort[i] = 0;
        }
    }

    public int sorteio(){
        Random rand = new Random();
        int i = rand.nextInt(27) + 1;
        return i;
    }

    public boolean validade(int i, int[] sort){
        if (sort[i] == 0){
            this.sort[i] = i;
            return true;
        }else{
            return false;
        }
    }

    public int[] getSort(){
        return this.sort;
    }

}
