package controller;

public class Player extends Moving{

    static /*Initialization of the variables counting the number of recovered's purse and crystal ball*/
    int p; //Purse
    static int c; //Crystal Ball
    
    /*Player movement toward up*/
    public static void movePlayUp(int x, int y, char map[][])
    {
        if(map[y-32][x] == 0|| map[y-32][x] == 1 || map[y-32][x] == 3 || map[y-32][x] == 6)
        {
            if(map[y-32][x] == 1)
            {
                p = p+1;
            }
        if(map[y-32][x] == 3)
            {
            c = c+1;
            }
        moveUp(y, x, map);
        }
    }
    
    /*Player movement toward left*/
    public static void movePlayLeft(int x, int y, char map[][])
    {
        if(map[y][x-32] == 0|| map[y][x-32] == 1 || map[y][x-32] == 3 || map[y][x-32] == 6)
        {
            if(map[y][x-32] == 1)
            {
                p = p+1;
            }
        if(map[y][x-32] == 3)
            {
            c = c+1;
            }
        moveLeft(y, x, map);
        }
    }
    
    /*Player movement toward right*/
    public static void movePlayRight(int x, int y, char map[][])
    {
        if(map[y][x+32] == 0|| map[y][x+32] == 1 || map[y][x+32] == 3 || map[y][x+32] == 6)
        {
            if(map[y][x+32] == 1)
            {
                p = p+1;
            }
        if(map[y][x+32] == 3)
            {
            c = c+1;
            }
        moveRight(y, x, map);
        }
    }
    
    /*Player movement toward down*/
    public static void movePlayDown(int x, int y, char map[][])
    {
        if(map[y+32][x] == 0|| map[y+32][x] == 1 || map[y+32][x] == 3 || map[y+32][x] == 6)
        {
            if(map[y+32][x] == 1)
            {
                p = p+1;
            }
        if(map[y+32][x] == 3)
            {
            c = c+1;
            }
        moveDown(y, x, map);
        }
    }


}