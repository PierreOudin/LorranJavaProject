package model;

public class Moving extends ModelFacade {

	public static char[][] moveUp(int x, int y, char map[][])
	{
		/*movement up of the object*/
		char block = map[y][x];
		map[y][x] = '0';
		map[y-32][x] = block;
		
		return map;
	}
	
	/*movement to the right of the object*/
	public static char[][] moveRight(int x, int y, char map[][])
	{
		char block = map[y][x];
		map[y][x] = '0';
		map[y][x+32] = block;
		
		return map;
	}
	
	/**movement down of the object**/
	public static char[][] moveDown(int x, int y, char map[][])
	{ 
		char block = map[y][x]; 
		map[y][x] = '4'; 
	    map[y+32][x] = block; 
	    
	    return map;
	} 
	
	/**movement to the left of the object**/
	public static char[][] moveLeft(int x, int y, char map [][]){ 

	    char block = map[y][x]; 
	    map[y][x] = '4'; 
	    map[y][x-32] = block; 
	    
	    return map;
	  }	
	
}
