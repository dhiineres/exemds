package br.ufg.inf.es.mds.conta;

public class Conta {
    private int numero;
    private float saldo;
    private int chave;
    private String CPF;

    public Conta(int num, int chave, String cpf){
        this.numero = num;
        this.chave = chave;
        this.CPF = cpf;
        saldo = 0;
    }
    public Conta(){
        this.numero = 0;
        this.saldo = 0;
        this.chave = 0;
    }

    public String getCPF(){
        return CPF;
    }

    public void setNumero(int num){
        this.numero = num;
    }

    public boolean confereTitular(Pessoa X){
        return (getChave() == X.getChave());
    }

    public int getNumero(){
        return numero;
    }

    public int getChave(){
        return chave;
    }

    public float getSaldo(){
        return saldo;
    }

    public void deposita(float x){
        float s = getSaldo();
        if(x > 0){
            System.out.println("Saldo anterior: "+ s);
            s = s + x;
            System.out.println("Saldo atual: "+ s);
        }else{
            System.out.println("Operação inválida!");
        }
        this.saldo = s;
    }

    public void retira(float x){
        float s = getSaldo();
        if (x < s){
            System.out.println("Saldo anterior: "+ s);
            s = s - x;
            System.out.println("Saldo atual: "+ s);
        }else{
            System.out.println("Saldo insuficiente!");
        }
        this.saldo = s;
    }
}
