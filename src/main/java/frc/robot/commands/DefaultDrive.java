package frc.robot.commands;

import frc.robot.subsystems.Drivetrain_Subsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;


public class DefaultDrive extends CommandBase {
    private final Drivetrain_Subsystem m_drive;
    private final double m_forward;
    private final double  m_rotation;
  
    //CheckThis//
    public DefaultDrive(Drivetrain_Subsystem subsystem, double forward, double rotation) {
      m_drive = subsystem;
      m_forward = forward;
      m_rotation = rotation;
      addRequirements(m_drive);
    }
  
    @Override
    public void execute() {
      m_drive.arcadeDrive(m_forward, m_rotation);
    }
  }