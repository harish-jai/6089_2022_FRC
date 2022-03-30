package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {

    public Joystick joystick;

    public OI() {
        joystick = new Joystick(0);
    }

    public double getLeft() {
        return joystick.getRawAxis(1);
    }

    public double getRight() {
        return joystick.getRawAxis(4);
    }
}