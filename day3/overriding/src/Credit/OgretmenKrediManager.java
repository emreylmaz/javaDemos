package Credit;

public class OgretmenKrediManager extends BaseKrediManager{
    public final double hesapla(double tutar){
        return tutar * 1.10;
    } // not overrideable
}
