package attacks;

import ru.ifmo.se.pokemon.*;

public final class Sing extends StatusMove {
    public Sing(){
        super(Type.NORMAL,10,55);
    }
    @Override

    protected void applyOppEffects(Pokemon opp){
        Effect singSleep = new Effect().turns(2);
        singSleep.sleep(opp);
    }

    @Override

    protected String describe(){
        return "усыпил противника";
    }
}
