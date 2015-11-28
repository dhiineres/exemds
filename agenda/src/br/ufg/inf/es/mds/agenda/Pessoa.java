package br.ufg.inf.es.mds.agenda;

import javax.lang.model.element.Name;

public class Pessoa {
    private String name;
    private String email;
    private int num;

    public Pessoa(String name, int num){
        this.name = name;
        this.num = num;
    }

    public void setName(String n){
        this.name = n;
    }

    public void setEmail(String n){
        this.email = n;
    }

    public void setNum(int n){
        this.num = n;
    }

    public int getNum(){
        return (num);
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }
}
