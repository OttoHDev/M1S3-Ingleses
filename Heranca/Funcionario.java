package Heranca;

public class Funcionario extends Pessoa{
    public double salario;

    public Funcionario(String _cpf, String _nome, int _idade, double _salario){
        super(_cpf, _nome, _idade);
        this.salario = _salario;
    }
}
