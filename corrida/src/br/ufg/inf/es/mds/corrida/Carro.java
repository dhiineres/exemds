package br.ufg.inf.es.mds.corrida;

public class Carro {
    private String name;
    private String color;
    private float velocidade;     // m/s
    private float velocidadeMax;  // m/s
    private boolean ligado = false;
    private float distanciaPercorrida = 0; //m

    public void setColor(String cor){
        this.color = cor;
    }

    public String getColor(){
        return this.color;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public boolean getLigado(){
        return this.ligado;
    }

    public float getVelocidade(){
        return this.velocidade;
    }

    public float getVelocidadeMax(){
        return this.velocidadeMax;
    }

    public float getDistanciaPercorrida(){
        return this.distanciaPercorrida;
    }

    public void setDistanciaPercorrida(int tempo){
        float i = tempo * this.velocidade;
        this.distanciaPercorrida = this.distanciaPercorrida + i;
    }

    public Carro(String nome, String cor, int velocidadeMax){
        velocidade = 0;
        this.color = cor;
        this.name = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public boolean chave(){
        if(this.ligado){
            if(getVelocidade() == 0) {
                this.ligado = false;
                System.out.println(getName()+" foi desligado!");
            }else{
                System.out.println(getName()+" está em movimento," +
                        " não pode ser desligado!");
            }
        }else{
            this.ligado = true;
            System.out.println(getName()+" foi ligado!!");
        }
        return this.ligado;
    }

    public void acelera(int qtd){
        if (velocidade + qtd <= velocidadeMax){
            this.velocidade = this.velocidade + qtd;
        }else{
            velocidade = velocidadeMax;
        }
    }

    public void freia(int esperado){
        if (velocidade <= esperado){
            System.out.println("Não é necessário freiar!");
        }else{
            while (velocidade > esperado + 5){
                velocidade = velocidade - 5;
            }
            velocidade = esperado;
        }
    }
}
