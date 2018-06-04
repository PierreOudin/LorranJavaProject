package model;

public class Enemy extends Moving {

	public void moveMobOneThree(int x, int y, char map[][])
	{
		if(map[y][x-32] == 0)
		{
			moveLeft(y, x, map);
		}
		else if(map[y-32][x] == 0)
		{
			moveUp(y, x, map);
		}
		else if (map[y][x+32] == 0){
			moveRight(y, x, map);
		}
		else if (map[y+32][x] == 0){
			moveDown(y, x, map);
		}
	}
	
	public void moveMobTwoFour(int x, int y, char map[][])
	{
		if(map[y][x+32] == 0){
			moveRight(y, x, map);
		}
		else if(map[y-32][x] == 0){
			moveUp(y, x, map);
		}
		else if(map[y][x-32] == 0){
			moveLeft(y, x, map);
		}
		else if(map[y+32][x] == 0){
			moveDown(y, x, map);
		}
	}
}
