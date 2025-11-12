package attacks;

import ru.ifmo.se.pokemon.*;

public final class ShadowBall extends SpecialMove {
    public ShadowBall(){
        super(Type.GHOST,80,100);
    }
    @Override
    protected void applyOppEffects(Pokemon opp){
        Effect shadowBallDebuff = new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE, -1);
        opp.addEffect(shadowBallDebuff);
    }

    @Override
    protected String describe(){
        return "нанёс урон с вероятностью 20%";
    }
}