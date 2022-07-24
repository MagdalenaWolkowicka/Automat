import java.util.Scanner;

public class GameMachineController {

    private boolean exit = false;
    private GameMachine gameMachine = new GameMachine();

    public void start() throws NotEnoughMoneyException, GameNotFoundException {
        Menu menu = new Menu();
        System.out.println("Witaj w automacie z grami :)");
        do {
            System.out.println(menu.showMenu());
            executeSelection();
        } while (!exit);
    }

    private void executeSelection() throws NotEnoughMoneyException, GameNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz opcję: ");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                gameMachine.showGames();
                break;
            case 2:
                buyGame();
                break;
            case 3:
                exit = true;
                break;
            default:
                System.out.println("Nie rozpoznano decyzji...");
        }
    }

    public void buyGame() throws GameNotFoundException, NotEnoughMoneyException {
        GameMachine gameMachine = new GameMachine();
        gameMachine.showGames();
        System.out.println("\nWpisz nazwę szukanej gry");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        Game game = gameMachine.findGame(title);
        int price = gameMachine.showPrice(game);
        System.out.println("Zapłać " + price + " zł");
        int money = scanner.nextInt();
        int restOfMoney = gameMachine.checkMoney(money, game);
        if (restOfMoney > 0) {
            System.out.println("Wydaję resztę: " + restOfMoney + " zł");
        }
        System.out.println("Gra " + game.getTitle() + " kupiona ;)");
    }


}
