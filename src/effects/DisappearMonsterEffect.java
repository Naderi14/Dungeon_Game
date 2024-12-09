package effects;

import controllers.Dungeon;
import controllers.Monster;

import java.util.List;
import java.util.Random;

public class DisappearMonsterEffect implements IEffect {
    private Random random = new Random();

    public void aplicarEfecto(Dungeon dungeon)
    {
        List<Monster> monsterList = Dungeon.getMonsters();

        if (!monsterList.isEmpty())
        {
            int index = random.nextInt(monsterList.size());
            Monster monster = monsterList.get(index);
            System.out.println("<- Ha desaparecido un monstruo en (" + monster.getPosY() + "," + monster.getPosX() + ")");
            monster.killMonster(monsterList, Dungeon.getMapa());
        }
    }
}
