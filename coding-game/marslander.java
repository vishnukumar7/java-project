import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int surfaceN = in.nextInt(); // the number of points used to draw the surface of Mars.
        int landX=0,landY=0;
        for (int i = 0; i < surfaceN; i++) {
            landX = in.nextInt(); // X coordinate of a surface point. (0 to 6999)
            landY = in.nextInt(); // Y coordinate of a surface point. By linking all the points together in a sequential fashion, you form the surface of Mars.
            in.nextLine();
            
        }

        // game loop
        while (true) {
            int X = in.nextInt();
            int Y = in.nextInt();
            int hSpeed = in.nextInt(); // the horizontal speed (in m/s), can be negative.
            int vSpeed = in.nextInt(); // the vertical speed (in m/s), can be negative.
            int fuel = in.nextInt(); // the quantity of remaining fuel in liters.
            int rotate = in.nextInt(); // the rotation angle in degrees (-90 to 90).
            int power = in.nextInt(); // the thrust power (0 to 4).
            in.nextLine();
            if(vSpeed<0 && Y<landY+1250)
            {
                power=power+1;
                if(power>4)
                    power=4;
                System.out.println("0 "+power);
            }
            else
            {
                power=power-1;
                if(power<0)
                    power=0;
                System.out.println("0 "+power);
            }
        }
    }
}
