package hu.petrik.bankiszolgatatasok;



public class Szamla extends BankiSzolgaltatas {

    protected int aktualisEgyenleg;

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.aktualisEgyenleg = aktualisEgyenleg;
    }

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public void befizet(int osszeg) {
        aktualisEgyenleg += osszeg;
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



    public Kartya ujKartya(String kartyaszam){
        return new Kartya(getTulajdonos(),this, kartyaszam);
    }



}
