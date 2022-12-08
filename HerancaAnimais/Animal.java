package HerancaAnimais;

public class Animal {
    public String nome;

    public Animal(String _nome) {
        this.nome = _nome;
    }

    public String locomover(){
        return "Caminhar...";
    }

    public String comunicar(){
        return "Barulho!!!";
    }

    public String atacar(){
        return "Morder!";
    }

    final public String comer(){
        return "Comendo...";
    }


}
