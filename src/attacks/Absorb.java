package attacks;

import ru.ifmo.se.pokemon.*;

public final class Absorb extends SpecialMove{
    public Absorb(){
        super(Type.GRASS,20,100);
    }


    @Override
    protected void applySelfEffects(Pokemon self){
        super.applySelfEffects(self);

        self.setMod(Stat.HP, -(int)(0.5 * self.getStat(Stat.ATTACK)));
    }

    @Override
    protected String describe() {
        return "восстанавливает здоровье на 50%";
    }
}
