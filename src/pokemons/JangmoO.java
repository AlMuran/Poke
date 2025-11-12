package pokemons;
import attacks.*;
import ru.ifmo.se.pokemon.*;

public final class JangmoO extends Pokemon{
    public JangmoO(String name, int level){
        super(name, level);

        setType(Type.DRAGON);
        setStats(45,55,65,45,45,45);

        setMove(new ShadowBall(), new SludgeWave(), new MetalSound(), new Absorb());
    }
}