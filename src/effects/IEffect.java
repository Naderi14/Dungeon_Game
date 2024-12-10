package effects;

import controllers.Dungeon;

public interface IEffect
{
    void aplicarEfecto(Dungeon dungeon);
    int getProbabilidad();
}
