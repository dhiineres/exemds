package br.ufg.inf.es.mds.agenda;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Pessoa> contatos;

    public Agenda(){
        contatos = new ArrayList();
    }

    public void adicionar(Pessoa pessoa){
        contatos.add(pessoa);
    }

    public Pessoa find(String name){
        for (int i = 0; i < contatos.size(); i++){
            Pessoa pessoa = contatos.get(i);
            if(pessoa.getName().equalsIgnoreCase(name)){
                return contatos.get(i);
            }
        }
        return null;
    }

    public Pessoa[] getAll(){
        Pessoa[] vetor = new Pessoa[contatos.size()];

        return (contatos.toArray(vetor));
    }

    public int getTamanho(){
        return contatos.size();
    }
}