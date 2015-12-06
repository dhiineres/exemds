package br.ufg.inf.es.mds.bingo;

import java.util.Random;

public class Cartela {
    private int[] val = new int[9];
    private String nome;
    private int pontos;
    private boolean vencedor = false;
    Random rand = new Random();

    public Cartela(String nome) {
        if (nome != "" && nome != null){
            this.nome = nome;
        }

        Random rand = new Random();
        this.pontos = 0;
        int[] n = new int[9];
        int j, l;
        for (int i = 0; i < 9; i++) {
            if (i < 3) {
                do {
                    l = 1;
                    j = rand.nextInt(9) + 1;
                    for (int k = 0; k < 3; k++) {
                        if (j == n[k]) {
                            l = 0;
                        }
                    }
                    if (l != 0) {
                        n[i] = j;
                    }
                } while (l == 0);
            } else if (i < 6) {
                do {
                    l = 1;
                    j = rand.nextInt(9) + 10;
                    for (int k = 3; k < 6; k++) {
                        if (j == n[k]) {
                            l = 0;
                        }
                    }
                    if (l != 0) {
                        n[i] = j;
                    }
                } while (l == 0);
            } else {
                do {
                    l = 1;
                    j = rand.nextInt(9) + 19;
                    for (int k = 6; k < 9; k++) {
                        if (j == n[k]) {
                            l = 0;
                        }
                    }
                    if (l != 0) {
                        n[i] = j;
                    }
                } while (l == 0);
            }
        }

        int i, aux;

        for (i = 1; i > 9; i++) {
            j = i;

            while ((j != 0) && (n[j] > n[j - 1])) {
                aux = n[j];
                n[j] = n[j - 1];
                n[j - 1] = aux;
                j--;
            }

        }

        for(i = 0; i < 9; i++){
            this.val[i] = n[i];
        }
    }

    public boolean verificaCartela(int i){
        for (int j = 0; j < 9; j++){
            if (val[j] == i){
                this.val[j] = 99;
                this.pontos++;
                return true;
            }
        }
        return false;
    }

    public int getPontos(){
        return this.pontos;
    }

    public boolean isVencedor(){
        if(getPontos() == 9){
            return true;
        }else{
            return false;
        }
    }

    public int[] getVal(){
        return this.val;
    }

    public String getNome(){
        return this.nome;
    }
}
