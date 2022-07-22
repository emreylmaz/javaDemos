package inharitance;
public class Main {
    public static void main(String[] args) {

        KrediUi krediUi = new KrediUi();
        //Polimorfizm
        krediUi.KrediHesapla(new OgretmenKrediManager());
    }
}