
package robotics;
import ch.aplu.robotsim.*;
public class CircleWithGear {
    CircleWithGear(){
        NxtRobot r = new NxtRobot();
        Gear g = new Gear();
        r.addPart(g);
        g.setSpeed(500);
        while(true){ 
        g.leftArc(0.5);
    }}
  public static void main(String args[]){
        CircleWithGear  m = new CircleWithGear();
    }
}