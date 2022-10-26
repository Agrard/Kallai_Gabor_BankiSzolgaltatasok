package hu.petrik.bankiszolgatatasok;

public class HitelSzamla extends Szamla{



    private int hitelKeret;

    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = this.hitelKeret;
    }

    public int getHitelKeret() {
        return hitelKeret;
    }

    public boolean kivesz(int osszeg){
        if (aktualisEgyenleg + hitelKeret < osszeg){
            return false;
        }
        else{
            aktualisEgyenleg -= osszeg;
            return true;
        }
    }

}
