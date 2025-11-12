import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon[] allies = { new JangmoO("Леди баг", 20),
                new Ninetales("Супер Кот", 15),
                new Cleffa("Рена Руж", 17) };
        Pokemon[] foes = { new Vulpix("Бражник", 19),
                new Clefairy("Павлин", 16),
                new Clefable("Хлоя", 17) };

        for (Pokemon p : allies)
            b.addAlly(p);
        for (Pokemon f : foes)
            b.addFoe(f);

        b.go();
    }
}