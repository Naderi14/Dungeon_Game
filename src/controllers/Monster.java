package controllers;

import java.util.List;
import java.util.Random;

public class Monster {
    private int posX, posY;
    private int planX, planY;   // Las variables estas se usarán para evitar errores futuros con los conflictos entre monstruos
    private int beforeX, beforeY;
    private char symbol = 'M';

    public Monster(int x, int y)
    {
        this.posX = x;
        this.posY = y;
        this.planX = x;
        this.planY = y;
    }

    public int getPosX()
    {
        return posX;
    }

    public int getPosY()
    {
        return posY;
    }

    public void planearMove(char[][] mapa)
    {
        Random random = new Random();
        boolean isAvailableMove = false;

        while(!isAvailableMove)
        {
            int tempX = 0, tempY = 0;
            int vectorDirection = random.nextInt(4) + 1;

            switch (vectorDirection)
            {
                case 1: // Arriba
                    tempY = -1;
                    break;
                case 2: // Izquierda
                    tempX = -1;
                    break;
                case 3: // Abajo
                    tempY = 1;
                    break;
                case 4: // Derecha
                    tempX = 1;
                    break;
            }

            int newX = posX + tempX;
            int newY = posY + tempY;

            if (newX >= 0 && newX < mapa[0].length && newY >= 0 && newY < mapa.length)
            {
                if (mapa[newY][newX] == ' ' || mapa[newY][newX] == 'S')
                {
                    planX = newX;
                    planY = newY;
                    isAvailableMove = true;
                }

                else if (mapa[newY][newX] == 'M')
                {

                    isAvailableMove = true;
                    planearMove(mapa);
                }
            }
        }
    }

    public boolean checkConflicts(List<Monster> monsterList)
    {
        for (Monster other : monsterList)
        {
            if (other != this && other.planX == this.planX && other.planY == this.planY)
            {
                planX = posX;
                planY = posY;
                return false;
            }
        }
        return true;
    }

    public void applyMove(char[][] mapa)
    {
        beforeX = posX;
        beforeY = posY;
        mapa[posY][posX] = ' ';
        posX = planX;
        posY = planY;
        mapa[posY][posX] = symbol;
    }

    public void killMonster(List<Monster> monsterList, char[][] mapa)
    {
        mapa[posY][posX] = ' ';
        monsterList.remove(this);
    }

    public void retrocederPosicion(char[][] mapa)
    {
        posX = beforeX;
        posY = beforeY;
        mapa[posY][posX] = symbol;
    }
}

