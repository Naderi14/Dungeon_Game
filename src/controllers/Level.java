package controllers;

import effects.IEffect;

import java.util.Random;

public class Level {
    private char[][] mapa;
    private IEffect curse;

    public Level(char[][] mapa, IEffect curse)
    {
        this.mapa = mapa;
    }

    public char[][] getMapa()
    {
        return mapa;
    }

    public void aplicarEfecto(Dungeon dungeon)
    {
        Random random = new Random();

        if (random.nextInt(101) > curse.getProbabilidad())
            curse.aplicarEfecto(dungeon);
    }

    public static char[][] mapGenerate(int width, int height, int cantMonsters, int cantTreasures, int cantRooms)
    {
        Random random = new Random();
        char[][] mapa = new char[height][width];

        for (int i = 0; i < mapa.length; i++)
        {
            for (int j = 0; j < mapa[i].length; j++)
            {
                if ((i | j) == 0)   // Meteremos siempre el jugador a 0,0
                    mapa[i][j] = 'S';
            }
        }

        return mapa;
    }
}
