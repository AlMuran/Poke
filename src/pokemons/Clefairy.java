package pokemons;
import attacks.*;
import ru.ifmo.se.pokemon.Type;

public class Clefairy extends Cleffa{
    public Clefairy(String name, int level){
        super(name, level);

        setType(Type.FAIRY);
        setStats(70,45,48,60,65,35);

        addMove(new Growl());
    }
}
