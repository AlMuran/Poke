package attacks;

import ru.ifmo.se.pokemon.*;

public final class Flamethrower extends SpecialMove {
    public Flamethrower(){
        super(Type.FIRE,90,100);
    }

    @Override

    protected void applyOppEffects(Pokemon opp){
        Effect flame = new Effect().chance(0.1);
        flame.burn(opp);
    }

    @Override

    protected String describe(){
        return "поджигает противника";
    }
}
