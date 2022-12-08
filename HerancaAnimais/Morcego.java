package HerancaAnimais;

public class Morcego extends Mamifero{
    public boolean frutivero;

    public Morcego(String _nome, String _corPelo, boolean _frutivero) {
        super(_nome, _corPelo);
        this.frutivero = _frutivero;
    }

    public String locomover(){
        return "Voar...";
    }

    public String comunicar(){
        return "Sonar";
    }

}
