package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public final class Ninetales extends Vulpix {
    public Ninetales(String name, int level){
        super(name, level);

        setType(Type.FIRE);
        setStats(73,76,75,81,100,100);

        addMove(new NastyPlot());
    }
}
