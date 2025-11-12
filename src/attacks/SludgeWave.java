package attacks;

import ru.ifmo.se.pokemon.*;

public final class SludgeWave extends SpecialMove{
    public SludgeWave(){
        super(Type.POISON,95,100);
    }
    @Override
    protected void applyOppEffects(Pokemon opp){
        Effect sludgeWaveDebuff = new Effect().chance(0.1);
        sludgeWaveDebuff.poison(opp);
    }
    @Override
    protected String describe(){
        return "отравил противника";
    }
}
