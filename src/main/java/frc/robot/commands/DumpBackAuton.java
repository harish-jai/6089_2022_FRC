package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.Timer;
import frc.robot.Drivetrain;

public class DumpBackAuton extends CommandGroup {
    private Drivetrain drive;
    private Timer timer;

    public DumpBackAuton(Drivetrain drive) {
        this.drive = drive;
        timer = new Timer();
        timer.start();
        //addRequirements(drive);
    }

    // shoots preloaded ball and backs off tarmac
    public void execute() {
        if(timer.get() <= 2) {
            System.out.println("Moving Forward");
            drive.drive(0.5, 0.5);
        }
        
        else if(timer.get() > 2 && timer.get() <= 6){
            System.out.println("Backing off Tarmac");
            drive.drive(-0.5, -0.5);
        }
        else{
            System.out.println("Robot Stopped");
            drive.drive(0, 0);
        }
    }
}
