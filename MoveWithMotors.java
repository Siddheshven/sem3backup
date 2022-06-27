package robotics;
import ch.aplu.robotsim.*;
public class MoveWithMotors {
    MoveWithMotors()
    {
        NxtRobot r = new NxtRobot();
        Motor m1 = new Motor(MotorPort.A);
        Motor m2 = new Motor(MotorPort.B);
        r.addPart(m1);
        r.addPart(m2);
        m1.forward();
        Tools.delay(1000);
        
        m2.forward();
        Tools.delay(1000);
        
        m1.stop();
        Tools.delay(300);
        
        m1.forward();
        Tools.delay(10000);
    }
    public static void main(String args[]){
        new MoveWithMotors();
    }
}
