package br.ufg.inf.es.mds.agenda;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Objeto {

    public static void displayPessoa(Pessoa x){
        System.out.println(x.getName());
        System.out.println(x.getNum());
        System.out.println(x.getEmail());
    }

    public static void displayAgenda (Agenda y){
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        Pessoa[] x = y.getAll();
        for (int i = 0; i < x.length; i++){
            displayPessoa(x[i]);
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        }
    }

    public static void main(String args[]){
        Agenda agenda = new Agenda();

        Pessoa x = new Pessoa("Joao", 11223344);
        x.setEmail("joao@gmail.com");
        agenda.adicionar(x);

        Pessoa y = agenda.find("Joao");
        displayPessoa(y);

        Pessoa j = new Pessoa("Dhiogo", 22334455);
        j.setEmail("dhiogo@hotmail.com");
        agenda.adicionar(j);

        displayAgenda(agenda);
    }
}
