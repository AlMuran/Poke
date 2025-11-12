package pokemons;
import attacks.*;
import ru.ifmo.se.pokemon.*;

public final class Clefable extends Clefairy {
    public Clefable(String name, int level){
        super(name, level);

        setType(Type.FAIRY);
        setStats(95,70,73,95,90,60);

        addMove(new Blizzard());
    }
}
