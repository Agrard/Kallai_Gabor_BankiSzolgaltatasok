package hu.petrik.bankiszolgatatasok;

public class MegtakaritasiSzamla extends Szamla{
    public double alapKamat = 1.1;
    private static double kamat;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.kamat = alapKamat;

    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public boolean kivesz(int osszeg){
        if (aktualisEgyenleg < 0){
            return false;
        }
        else{
            aktualisEgyenleg -= osszeg;
            return true;
        }
    }

    public void kamatJovairas(){
        aktualisEgyenleg += kamat;
    }

}

