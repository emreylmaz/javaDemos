package Concretes;

import Abstract.GamerService;
import Entities.Gamer;

import java.util.ArrayList;
import java.util.List;

public class GamerManager implements GamerService {
    List<Gamer> gamersList = new ArrayList<Gamer>();

    @Override
    public void add(Gamer gamer) throws Exception {
        if (MernisServiceAdapter.isCheckPerson(gamer)){
            gamersList.add(gamer);
            System.out.println("Gamer Eklendi : " + gamer.getFirstName());
        }else {
            System.out.println("Gerçek Kişi değilsiniz.");
        }


    }

    @Override
    public void delete(Gamer gamer) {
        gamersList.remove(gamer);
        System.out.println("Gamer Silindi : " + gamer.getFirstName());

    }

    @Override
    public void update(Gamer gamer) {
        gamersList.add(gamer);

        System.out.println("Gamer güncellendi : " + gamer.getFirstName());

    }

    public List<Gamer> getAll(){
        return gamersList;

    }

}
