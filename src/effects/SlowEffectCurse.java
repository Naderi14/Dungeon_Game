package effects;

import controllers.Dungeon;

public class SlowEffectCurse implements IEffect{
    private int probabilidad;

    public SlowEffectCurse(int probabilidad)
    {
        this.probabilidad = probabilidad;
    }

    public void aplicarEfecto(Dungeon dungeon)
    {

    }

    public int getProbabilidad()
    {
        return probabilidad;
    }
}
