package br.com.local.mypets;

public class PFisica extends Pessoa{

    private String cpf;

    public PFisica() {
    }

    public PFisica(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
