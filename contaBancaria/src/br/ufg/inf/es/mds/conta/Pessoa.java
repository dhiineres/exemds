package br.ufg.inf.es.mds.conta;

public class Pessoa {

    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private String telefone;
    private String CPF;
    private int chave;

    public Pessoa(String nome, String telefone, String CPF, int key){
        this.nome = nome;
        this.telefone = telefone;
        this.CPF = CPF;
        this.chave = key;
    }
    public Pessoa(){
        this.nome = null;
        this.telefone = null;
        this.CPF = null;
        this.chave = 0;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco (String endereco){
        this.endereco = endereco;
    }

    public void setBairro (String bairro){
        this.bairro = bairro;
    }

    public void setCidade (String cidade){
        this.cidade = cidade;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public String getNome(){
        return (nome);
    }

    public String getEndereco(){
        return endereco;
    }

    public String getBairro(){
        return bairro;
    }

    public String getCidade(){
        return cidade;
    }

    public String getTelefone(){
        return telefone;
    }

    public String getCPF(){
        return CPF;
    }

    public int getChave(){
        return chave;
    }
}
