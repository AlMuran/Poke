package attacks;

import ru.ifmo.se.pokemon.*;

public final class EnergyBall extends SpecialMove{
    public EnergyBall(){
        super(Type.GRASS,90,100);
    }

    @Override

    protected void applyOppEffects(Pokemon opp){
        Effect energyBallBuff = new Effect().chance(0.1);
        if (energyBallBuff.success()){
            opp.setMod(Stat.SPECIAL_DEFENSE,-1);
        }
    }

    @Override
    protected String describe() {
        return "кидает энергетический шар";
    }
}
