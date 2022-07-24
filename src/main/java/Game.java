public class Game {

    String title;
    int price;

    public Game(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Nazwa gry: " + title + ", cena: " + price;
    }
}
