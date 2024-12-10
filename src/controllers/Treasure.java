package controllers;

import effects.IEffect;

import java.util.Random;

public class Treasure {
    private int posX, posY, value;
    private IEffect effect;

    public Treasure(int x, int y, int value, IEffect effect)
    {
        this.posX = x;
        this.posY = y;
        this.value = value;
        this.effect = effect;
    }

    public int getPosX()
    {
        return posX;
    }

    public int getPosY()
    {
        return posY;
    }

    public int getValue()
    {
        return value;
    }

    public void aplicarEfecto(Dungeon dungeon)
    {
        Random random = new Random();

        if (random.nextInt(101) > effect.getProbabilidad())
            effect.aplicarEfecto(dungeon);
    }
}
