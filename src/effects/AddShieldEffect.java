package effects;

import controllers.Dungeon;
import controllers.Player;

public class AddShieldEffect implements IEffect{
    public void aplicarEfecto(Dungeon dungeon)
    {
        Player.sumarEscudo();
    }
}