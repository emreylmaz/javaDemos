package Concretes;

import Entities.Gamer;
import MernisAdapter.BIHKPSPublicSoap;

public class MernisServiceAdapter {

    public static boolean isCheckPerson(Gamer gamer) throws Exception {
        BIHKPSPublicSoap adapter = new BIHKPSPublicSoap();
       boolean result =  adapter.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),gamer.getFirstName(),gamer.getLastName(),gamer.getDateOfBirth());
       return  result;

    }
}
