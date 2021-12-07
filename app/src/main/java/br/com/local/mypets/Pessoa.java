package br.com.local.mypets;

public class Pessoa {
    private String nome;
    private String email;
    private int idade;

    public Pessoa() {

    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public void pular() {

    }

    public void andar() {
        System.out.println("Andando");
    }

    public int calculaIdade(int idade) {
        return this.idade = idade;
    }

    //criar os métodos get and set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
