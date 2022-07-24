import java.util.ArrayList;
import java.util.List;

public class GameMachine {

    private List<Game> games = new ArrayList<>();

    public GameMachine() {
        games.add(new Game("Minecraft", 150));
        games.add(new Game("The Sims", 50));
        games.add(new Game("GTA", 100));
        games.add(new Game("World of Warcaft", 200));
        games.add(new Game("Close Combat", 80));
    }

    public void showGames() {
        for (Game game : games) {
            System.out.println(game);
        }
    }

    public Game findGame(String title) throws GameNotFoundException {
        for (Game game : games) {
            if (game.getTitle().equalsIgnoreCase(title)) {
                return game;
            }
        }
        throw new GameNotFoundException("Nie znaleziono gry :(");
    }

    public int showPrice(Game game) {
        return game.getPrice();
    }

    public int checkMoney(int money, Game game) throws NotEnoughMoneyException {
        if (money >= game.getPrice()) {
            return money - game.getPrice();

        }
        throw new NotEnoughMoneyException("Za mało pieniędzy");
    }


}
