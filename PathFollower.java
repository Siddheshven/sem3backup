package robotics;
import ch.aplu.robotsim.*;

public class PathFollower {
    public PathFollower()
  {
    NxtRobot robot=new NxtRobot();
    Gear gear=new Gear();
    gear.setSpeed(100);
    LightSensor ls1=new LightSensor(SensorPort.S1);
    LightSensor ls2=new LightSensor(SensorPort.S2);
    robot.addPart(gear);
    robot.addPart(ls1);
    robot.addPart(ls2);
    gear.forward();
   
    while(true)
    {
      int rightValue=ls1.getValue();
      int leftValue=ls2.getValue();
      
      int d=rightValue - leftValue;
        System.out.println(d);
      if(d>100)
        gear.rightArc(0.1);
//      less value is dark and more value is light
      if(d < -100)
        gear.leftArc(0.1);
      if(d > -100 && d < 100 && rightValue > 500)
        gear.forward();
    }
  }
  public static void main(String args[])
  {
     new PathFollower();
  }
  static
  {
    NxtContext.setStartPosition(80,428);
    NxtContext.setStartDirection(-90);
    NxtContext.useBackground("sprites/path.gif");
  }
  } 

