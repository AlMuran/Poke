package pokemons;
import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Cleffa extends Pokemon{
    public Cleffa(String name, int level){
        super(name, level);

        setType(Type.FAIRY);
        setStats(50,25,28,45,55,15);

        setMove(new Sing(), new Flamethrower());
    }
}