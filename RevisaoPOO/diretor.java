package RevisaoPOO;

public class diretor {

    private String nomeCompleto;
    private int idade;
    private String CPF;
    private String CEP;
    private double salario;
    private double bonusSal;

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public double getSalario() {
        return salario+bonusSal;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setBonusSal(double bonusSal) {
        this.bonusSal = bonusSal;
    }
}
