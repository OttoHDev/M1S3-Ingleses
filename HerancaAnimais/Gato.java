package HerancaAnimais;

public class Gato extends Mamifero{
    public boolean temPelo;

    public Gato(String _nome, String _corPelo, boolean _temPelo) {
        super(_nome, _corPelo);
        this.temPelo = _temPelo;
    }

    public String comunicar(){
        return "Miar!";
    }

    public String atacar(){
        return "Arranhar!";
    }

}
