package snake.game;

import java.util.ArrayList;
import java.awt.Color;

public class DataOfSquare {

    //ArrayList that'll contain the colors
    ArrayList<Color> C = new ArrayList<Color>();
    int color; //2: snake , 1: food, 0:empty 
    SquarePanel square;

    public DataOfSquare(int col) {

        //Lets add the color to the arrayList
        C.add(Color.white); //0
        C.add(Color.CYAN);  //1
        C.add(Color.darkGray);     //2
        C.add(Color.RED);       //3
        C.add(Color.BLUE);      //4
        C.add(Color.GREEN);     //5

        color = col;
        square = new SquarePanel(C.get(color));
    }

    public void lightMeUp(int c) {
        square.ChangeColor(C.get(c));
    }
}
