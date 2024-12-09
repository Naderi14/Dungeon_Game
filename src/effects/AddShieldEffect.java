package effects;

import dungeonGame.Dungeon;
import dungeonGame.Player;

public class AddShieldEffect implements IEffect{
    public void aplicarEfecto(Dungeon dungeon)
    {
        Player.sumarEscudo();
    }
}