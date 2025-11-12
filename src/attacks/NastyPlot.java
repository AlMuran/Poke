package attacks;

import ru.ifmo.se.pokemon.*;

public final class NastyPlot extends  StatusMove{
    public NastyPlot(){

        super(Type.DARK,10,0);
    }
    @Override
    protected void applySelfEffects(Pokemon self){
        Effect nastyPlotEff = new Effect().stat(Stat.SPECIAL_ATTACK, 2);
        self.addEffect(nastyPlotEff);
    }

    @Override
    protected String describe() {
        return "повысил специальную атаку на два уровня";
    }
}
