package Heranca;

public class Pessoa {
    protected String cpf;
    protected String nome;
    protected int idade;

    public Pessoa(String _cpf, String _nome, int _idade ){
        this.cpf = _cpf;
        this.idade = _idade;
        this.nome = _nome;
    }
}
