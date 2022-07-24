import java.util.ArrayList;
import java.util.List;

public class Menu {

    public String showMenu() {
        List<String> menuOptions = new ArrayList<>();
        menuOptions.add("\n1. Pobierz listę gier");
        menuOptions.add("2. Kup grę");
        menuOptions.add("3. Zamknij program");
        return String.join("\n", menuOptions);
    }
}

