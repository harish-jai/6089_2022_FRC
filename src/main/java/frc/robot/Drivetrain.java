package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivetrain {

    public WPI_TalonSRX driveFR;
    public WPI_TalonSRX driveFL;
    public WPI_TalonSRX driveRR;
    public WPI_TalonSRX driveRL;

    //public DoubleSolenoid shifter;

    public SpeedControllerGroup right;
    public SpeedControllerGroup left;

    public DifferentialDrive drive;

    public Drivetrain() {

        driveFR = new WPI_TalonSRX(0);
        driveFL = new WPI_TalonSRX(12);
        driveRR = new WPI_TalonSRX(3);
        driveRL = new WPI_TalonSRX(15);

        //shifter = new DoubleSolenoid(0, 1);

        right = new SpeedControllerGroup(driveFR, driveRR);
        left = new SpeedControllerGroup(driveFL, driveRL);

        drive = new DifferentialDrive(left, right);
        
    }

    public void shift() {
        // if(shifter.get() == Value.kForward) {
        //     shifter.set(Value.kReverse);
        // } else {
        //     shifter.set(Value.kForward);
        // }
    }

    public void drive(double rSpeed, double lSpeed){
        right.set(rSpeed);
        left.set(lSpeed);
    }
}