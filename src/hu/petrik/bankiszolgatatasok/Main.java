package hu.petrik.bankiszolgatatasok;

public class Main {
    public static void main(String[] args) {
        Tulajdonos szemely1 = new Tulajdonos("Nagy István");
        Tulajdonos szemely2 = new Tulajdonos("Keszthelyi Áron");
        Tulajdonos szemely3 = new Tulajdonos("Sütő Ágnes");
        Tulajdonos szemely4 = new Tulajdonos("Dobos Péter");

        Szamla szamlaTulaj1 = new Szamla(szemely1);
        Kartya kartyaTulaj1 = new Kartya(szemely1,szamlaTulaj1, "5101214121827160");
        //System.out.printf("Első tulaj kártyaszáma: %d",kartyaTulaj1.getKartyaSzam());

        Bank bank1 = new Bank();
        bank1.szamlaNyitas(szemely1,10000).befizet(4000);
        bank1.szamlaNyitas(szemely1,10000).kivesz(5000);
        bank1.szamlaNyitas(szemely1,10000).befizet(5000);

        bank1.szamlaNyitas(szemely2, 3000).befizet(3600);
        bank1.szamlaNyitas(szemely2, 3000).befizet(3000);

        bank1.szamlaNyitas(szemely3, 10000).befizet(5000);
        bank1.szamlaNyitas(szemely3, 10000).befizet(6000);

        bank1.szamlaNyitas(szemely4, 5000).befizet(5000);
        bank1.szamlaNyitas(szemely4, 5000).befizet(4000);

        System.out.println(bank1.getOsszHitelkeret());

        System.out.printf("A(z) első személy összegyenlege: %d",bank1.getOsszEgyenleg(szemely1));
        System.out.printf("\nA(z) második személy összegyenlege: %d",bank1.getOsszEgyenleg(szemely2));
        System.out.printf("\nA(z) harmadik személy összegyenlege: %d",bank1.getOsszEgyenleg(szemely3));
        System.out.printf("\nA(z) negyedik személy összegyenlege: %d",bank1.getOsszEgyenleg(szemely4));

        System.out.printf("\n\nA(z) első személy legnagyobb egyenlegű számlája: %d",bank1.getLegnagyobbEgyenleguSzamla(szemely1).getAktualisEgyenleg());
        System.out.printf("\nA(z) második személy legnagyobb egyenlegű számlája: %d",bank1.getLegnagyobbEgyenleguSzamla(szemely2).getAktualisEgyenleg());
        System.out.printf("\nA(z) harmadik személy legnagyobb egyenlegű számlája: %d",bank1.getLegnagyobbEgyenleguSzamla(szemely3).getAktualisEgyenleg());
        System.out.printf("\nA(z) negyedik személy legnagyobb egyenlegű számlája: %d",bank1.getLegnagyobbEgyenleguSzamla(szemely4).getAktualisEgyenleg());


    }
}
