package controller;

import java.awt.event.KeyEvent;

public class keyPressed{
	


public keyPressed(KeyEvent e) 
{
 
    
    int keyCode = e.getKeyCode();
    
    //char map[][] = new char[992][992];
    //map = IModel.getMap();
    switch (keyCode) 
    {
        case KeyEvent.VK_UP: 
        	//Player.movePlayUp(52, 75, map);
        	System.out.println("up");
            break;
        case KeyEvent.VK_LEFT: 
        	//Player.movePlayLeft(52, 75, map);
        	System.out.println("left");
            break;
        case KeyEvent.VK_RIGHT: 
        	//Player.movePlayRight(52, 75, map);
        	System.out.println("right");
            break;
        case KeyEvent.VK_DOWN: 
        	//Player.movePlayDown(52, 75, map);
        	System.out.println("down");
            break;
    }
}
}