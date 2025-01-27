// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;





import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArcadeDriveSubsystem extends SubsystemBase {
  
  public ArcadeDriveSubsystem() {}

  private final CANSparkMax LEFT1 = new CANSparkMax(13, MotorType.kBrushless);
  private final CANSparkMax LEFT2 = new CANSparkMax(11, MotorType.kBrushless); 
  private final CANSparkMax RIGHT1 = new CANSparkMax(9, MotorType.kBrushless); 
  private final CANSparkMax RIGHT2 = new CANSparkMax(14, MotorType.kBrushless); 
  
  private final DifferentialDrive m_Drive1 = new DifferentialDrive(LEFT1, RIGHT1);
  private final DifferentialDrive m_Drive2 = new DifferentialDrive(LEFT2, RIGHT2);

  public void ArcadeDrive (double speed, double rotation){
    
   m_Drive1.arcadeDrive(speed, rotation);
   m_Drive2.arcadeDrive(speed, rotation);
  }
  


  
  /**
   * Example command factory method.
   *
   * @return a command
   */
  public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
