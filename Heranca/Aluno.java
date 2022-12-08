package Heranca;

public class Aluno extends Pessoa {
    public String curso;
    public int semestre;

    public Aluno(String _cpf, String _nome, int _idade, String _curso, int _semestre){
        super(_cpf, _nome, _idade);
        this.curso = _curso;
        this.semestre = _semestre;

    }

    public void retornaNome(){
        System.out.println("Aluno: "+nome);
    }

}
