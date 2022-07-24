public class Main {

    public static void main(String[] args) {

        GameMachineController gameMachineController = new GameMachineController();

        try {
            gameMachineController.start();
        } catch (GameNotFoundException | NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        }
    }
}
