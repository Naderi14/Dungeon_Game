package effects;

import controllers.Dungeon;
import controllers.Player;

public class AddShieldEffect implements IEffect{
    public int probabilidad;

    public AddShieldEffect(int probabilidad)
    {
        this.probabilidad = probabilidad;
    }

    public void aplicarEfecto(Dungeon dungeon)
    {
        Player.sumarEscudo();
    }

    public int getProbabilidad()
    {
        return probabilidad;
    }
}