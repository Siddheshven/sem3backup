
package robotics;
import ch.aplu.robotsim.*;
public class MoveWithGear {
    MoveWithGear(){
        NxtRobot r = new NxtRobot();
        Gear g = new Gear();
        r.addPart(g);
        g.forward(2000);
        g.setSpeed(30);
        g.left(100);
        g.forward(1000);
        r.exit();
    }
    public static void main(String args[]){
        MoveWithGear  m = new MoveWithGear();
    }
}
