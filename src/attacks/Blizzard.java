package attacks;
import ru.ifmo.se.pokemon.*;

public final class Blizzard extends SpecialMove {
    public Blizzard(){
        super(Type.ICE,110,70);
    }

    @Override

    protected void applyOppEffects(Pokemon opp){
        Effect blizz = new Effect().chance(0.1);
        blizz.freeze(opp);
    }

    @Override

    protected String describe(){
        return "заморозил противника";
    }
}
