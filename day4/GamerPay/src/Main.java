import Concretes.GameManager;
import Concretes.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {
    public static void main(String[] args) throws Exception {
        Gamer gamer = new Gamer();
        gamer.setFirstName("Emre");
        gamer.setLastName("Yılmaz");
        gamer.setId(1);
        gamer.setDateOfBirth(1998);
        gamer.setNationalityId("19550463890");

        GamerManager gamerManager = new GamerManager();
        gamerManager.add(gamer);
        gamerManager.getAll();

        Game game = new Game();
        game.setName("LOL");
        game.setPrice(99.0);
        game.setId(1);

        Campaign campaign = new Campaign();
        campaign.setName("Karne Hediyesi");
        campaign.setId(1);
        campaign.setDiscountedPrice(0.15);

        GameManager gameManager = new GameManager();
        gameManager.add(game);
        gameManager.sell(game,campaign,gamer);

    }
}