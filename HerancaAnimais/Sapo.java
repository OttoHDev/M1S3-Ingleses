package HerancaAnimais;

public class Sapo extends Anfibio{

    public Sapo(String _nome, String _corPele) {
        super(_nome, _corPele);
    }

    public String locomover(){
        return "Nadar...";
    }

    public String comunicar(){
        return "Coaxar!";
    }


}
