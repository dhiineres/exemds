package br.ufg.inf.es.mds.bingo;

import java.util.Random;

public class Cartela {
    private int[] M = new int[3];
    private int[] D = new int[3];
    private int[] S = new int[3];

    public Cartela(){
        Random rand = new Random();
        int[] n = new int[9];
        int j, l;
        for (int i = 0; i < 9; i++){
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
                }while (l == 0);
            }else if(i < 6){
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
                }while (l == 0);
            }else{
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
                }while (l == 0);
            }
        }

        for (int i = 0; i < 9; i ++){
            for (int k = 0; k < 0; k++){
                if ((i < j) && )
            }
        }
    }
}
