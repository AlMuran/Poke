package attacks;

import ru.ifmo.se.pokemon.*;

public final class DoubleTeam extends StatusMove{
    public DoubleTeam(){
        super(Type.NORMAL,10,0);
    }

    @Override

    protected void applySelfEffects(Pokemon self){
        Effect evasiveness = new Effect().stat(Stat.EVASION, -1);
        self.addEffect(evasiveness);
    }

    @Override
    protected String describe() {
        return "уклоняется от атак";
    }
}
