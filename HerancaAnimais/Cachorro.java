package HerancaAnimais;

public class Cachorro extends Mamifero{
    public boolean treinado;

    public Cachorro(String _nome, String _corPelo, boolean _treinado){
        super(_nome, _corPelo);
        this.treinado = _treinado;
    }

    public String comunicar(){
        return "Latir";
    }
}
