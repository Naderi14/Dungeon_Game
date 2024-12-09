package controllers;

public class Level {
    private char[][] mapa;

    public Level(char[][] mapa)
    {
        this.mapa = mapa;
    }

    public char[][] getMapa()
    {
        return mapa;
    }
}
