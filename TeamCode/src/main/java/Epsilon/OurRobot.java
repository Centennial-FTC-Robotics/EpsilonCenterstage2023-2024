package Epsilon;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import Epsilon.Subsystems.Drivetrain;
import Epsilon.Subsystems.IMU;
import Epsilon.Subsystems.Intake;
import Epsilon.Subsystems.Outtake;
import Epsilon.Subsystems.Vision;
import com.qualcomm.robotcore.hardware.Gamepad;

public class OurRobot {
    public Drivetrain drivetrain;
    public IMU imu;
    public Intake intake;
    public Outtake outtake;
    public Vision vision;
    public Subsystem[] subsystems;



    public OurRobot(LinearOpMode opMode) {
        drivetrain = new Drivetrain(opMode.hardwareMap);
        //imu = new IMU(opMode.hardwareMap);
        intake = new Intake(opMode.hardwareMap);
        //outtake = new Outtake(opMode.hardwareMap);
        //vision = new Vision(opMode.hardwareMap);
        Subsystem[] subsystems = new Subsystem[] {
                drivetrain, intake, outtake, imu, vision
        };
    }

    public void teleOpUpdate(Gamepad gamepad1) throws InterruptedException {
        for(Subsystem subsystem : subsystems) {
            subsystem.teleOpUpdate(gamepad1);
        }
    }

}