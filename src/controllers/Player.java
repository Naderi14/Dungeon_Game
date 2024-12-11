package controllers;

import java.util.Scanner;

public class Player {
    private Scanner scanner = new Scanner(System.in);

    private int posX, posY;
    public static int scoreTotal = 0;
    private static int escudos = 0;

    public Player(int posX, int posY)
    {
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX()
    {
        return posX;
    }

    public int getPosY()
    {
        return posY;
    }

    public void menuJugador()
    {
        char[][] mapa = Dungeon.getMapa();
        boolean isAvailableMove = false;
        char letra;
        System.out.println("S - Jugador / T - Tesoro / M - Monstruo / E - Escape\n(W) arriba | (A) izquierda | (S) abajo | (D) derecha            " +
                "Score: " + scoreTotal + " | Escudos: " + escudos);
        while (!isAvailableMove)
        {
            letra = scanner.next().toUpperCase().charAt(0);

            switch (letra)
            {
                case 'W':
                    if (posY - 1 < 0)
                        isAvailableMove = true;
                    else if (mapa[posY - 1][posX] == '#')
                        isAvailableMove = true;
                    else
                    {
                        updatePlayerPos('y', -1, mapa);
                        isAvailableMove = true;
                    }
                    break;
                case 'A':
                    if (posX - 1 < 0)
                        isAvailableMove = true;
                    else if (mapa[posY][posX - 1] == '#')
                        isAvailableMove = true;
                    else
                    {
                        updatePlayerPos('x', -1, mapa);
                        isAvailableMove = true;
                    }
                    break;
                case 'S':
                    if (posY + 1 >= mapa.length)
                        isAvailableMove = true;
                    else if (mapa[posY + 1][posX] == '#')
                        isAvailableMove = true;
                    else
                    {
                        updatePlayerPos('y', 1, mapa);
                        isAvailableMove = true;
                    }
                    break;
                case 'D':
                    if (posX + 1 >= mapa[0].length)
                        isAvailableMove = true;
                    else if (mapa[posY][posX + 1] == '#')
                        isAvailableMove = true;
                    else
                    {
                        updatePlayerPos('x', 1, mapa);
                        isAvailableMove = true;
                    }
                    break;
                default:
                    System.out.println("<- No se corresponde con ningún movimiento ->");
                    break;
            }
        }
    }

    public void updatePlayerPos(char coordenada, int move, char[][] mapa)
    {
        if (coordenada == 'x')
        {
            mapa[posY][posX] = ' ';
            posX += move;
            mapa[posY][posX] = 'S';
        }
        else
        {
            mapa[posY][posX] = ' ';
            posY += move;
            mapa[posY][posX] = 'S';
        }
    }

    public static void sumarEscudo()
    {
        escudos++;
        System.out.println("<- 1 Escudo ha aparecido en forma de aura ->");
    }

    public static void restarEscudo()
    {
        escudos--;
    }

    public static int getEscudos()
    {
        return escudos;
    }
}
