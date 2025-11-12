package attacks;

import ru.ifmo.se.pokemon.*;

public final class MetalSound extends StatusMove{
    public MetalSound(){
        super(Type.STEEL,10,85);
    }

    @Override
    protected void applyOppEffects(Pokemon opp){
        Effect metalSoundDebuff = new Effect().turns(2).stat(Stat.SPECIAL_DEFENSE, -1);
        opp.addEffect(metalSoundDebuff);
    }
    @Override
    protected String describe(){
        return "снизил специальную защиту противника";
    }
}
