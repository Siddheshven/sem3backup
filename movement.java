

package robotics;

import ch.aplu.robotsim.*;
public class movement {
    movement(){
        TurtleRobot t = new TurtleRobot();
        t.forward(200);//move forward 200pixels
        t.left(95);//move left at 45 degree angle
        t.forward(200);
        t.exit();
//        t.forward(200);
//        t.left(90);
//        t.forward(200);
//        t.left(90);
//        t.forward(200);
//        t.left(90);
//        t.forward(200);
//        t.left(90);
    }

public static void main(String args[]){
    movement m = new movement();
}}
