package robotics;
import ch.aplu.robotsim.*;
public class demo {
    demo(){
        NxtRobot r = new NxtRobot();
        Gear g = new Gear();
        r.addPart(g);
        g.setSpeed(100);
        while(true){
        g.forward(800);
        g.left(280);
        g.forward(1500);
        g.left(280);
    }}
public static void main(String args[]){
        demo  m = new demo();
    }
}
