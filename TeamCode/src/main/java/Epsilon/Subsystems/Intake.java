package Epsilon.Subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import Epsilon.Subsystem;
import com.qualcomm.robotcore.hardware.Gamepad;

public class Intake implements Subsystem {
    public Servo leftServo;
    public Servo rightServo;
    public DcMotor wheelMotor;
    public Intake(final HardwareMap hMap) {
        leftServo = hMap.get(Servo.class, "left");
        rightServo = hMap.get(Servo.class, "right");
        wheelMotor = hMap.get(DcMotor.class, "wheel");
    }

    public void spinWheel(double power) {
        wheelMotor.setPower(power);
    }

    public void moveIntake(double pos) {
        leftServo.setPosition(pos);
        rightServo.setPosition(pos);
    }

    public void teleOpUpdate(Gamepad gamepad1, Gamepad gamepad2) {}
}
