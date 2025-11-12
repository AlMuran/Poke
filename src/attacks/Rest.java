package attacks;

import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove{
    public Rest(){
        super(Type.PSYCHIC,10,0);
    }

    @Override

    protected void applySelfEffects(Pokemon self){
        Effect sleepEff = new Effect().turns(2);
        self.restore();
        sleepEff.sleep(self);
    }
    @Override

    protected String describe(){
        return "спит";
    }

}
