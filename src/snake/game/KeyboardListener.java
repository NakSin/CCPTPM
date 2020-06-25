package snake.game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class KeyboardListener extends KeyAdapter {

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 39:	// -> Right 
                //if it's not the opposite direction
                if (ThreadsController.directionSnake != 2) {
                    ThreadsController.directionSnake = 1;
                }
                break;
            case 38:	// -> Top
                if (ThreadsController.directionSnake != 4) {
                    ThreadsController.directionSnake = 3;
                }
                break;

            case 37: 	// -> Left 
                if (ThreadsController.directionSnake != 1) {
                    ThreadsController.directionSnake = 2;
                }
                break;

            case 40:	// -> Bottom
                if (ThreadsController.directionSnake != 3) {
                    ThreadsController.directionSnake = 4;
                }
                break;
            case 32:	// -> Change Snake Color
                int[] color = {2, 3, 4, 5};
                switch (ThreadsController.colorSnake) {
                    case 2:
                        ThreadsController.colorSnake = color[1];
                        break;
                    case 3:
                        ThreadsController.colorSnake = color[2];
                        break;
                    case 4:
                        ThreadsController.colorSnake = color[3];
                        break;
                    case 5:
                        ThreadsController.colorSnake = color[0];
                        break;
                }
                break;
            case 77: // -> Change Mode
                ThreadsController.mode = !ThreadsController.mode;
            default:
                break;
        }
    }

}
