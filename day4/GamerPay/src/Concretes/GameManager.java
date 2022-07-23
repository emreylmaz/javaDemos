package Concretes;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;


import java.util.ArrayList;
import java.util.List;

public class GameManager implements GameService {
    List<Game> gamesList = new ArrayList<Game>();
    @Override
    public void add(Game game) {
        gamesList.add(game);
        System.out.println("Oyun Eklendi: " + game.getName());

    }

    @Override
    public void delete(Game game) {
        gamesList.remove(game);
        System.out.println("Oyun Silindi :" + game.getName());

    }

    @Override
    public void update(Game game) {
        gamesList.add(game);
        System.out.println("Oyun Güncellendi : " + game.getName());
    }

    public List<Game> getAll(){

        return gamesList;

    }

    public void sell(Game game, Campaign campaign, Gamer gamer){
        double discountedPrice = game.getPrice() - (game.getPrice() * campaign.getDiscountedPrice());   ;
        System.out.println("Sold: " + game.getName() + " Before Sell Price : " + game.getPrice()+ "Discounted Sell Price: " + discountedPrice );




    }
    public void sell(Game game, Gamer gamer){
        System.out.println("Sold: " + game.getName() + "  Sell Price : " + game.getPrice()  );


    }
}
