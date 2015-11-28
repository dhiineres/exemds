package br.ufg.inf.es.mds.contador;

public class Contador {

    private int itens;
    private boolean zero;

    public Contador(){
        itens = 0;
        zero = false;
    }

    public void incrementa(){
        this.itens = getItens() + 1;
    }

    public int getItens(){
        return this.itens;
    }

    public boolean isZero(){
        return zero;
    }

    public void setZero(){
        if (isZero()){
            System.out.println("Contador já está zerado...");
        }else{
            this.itens = 0;
            System.out.println("Contador zerado...");
        }
    }
}
