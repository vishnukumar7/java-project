import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            String dx="";
            String dy="";
            if(initialTX>lightX)
            {
                dx="W";
                initialTX-=1;
            }
            else if(initialTX<lightX)
            {
                dx="E";
                initialTX+=1;
            }
            
            if(initialTY>lightY)
            {
                dy="N";
                initialTY-=1;
            }
            else if(initialTY<lightY)
            {
                dy="S";
                initialTY+=1;
            }
            System.out.println(dy+dx);
        }
    }
}
