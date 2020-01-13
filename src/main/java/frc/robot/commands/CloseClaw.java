package frc.robot.commands;
import frc.robot.subsystems.Claw_Subsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class CloseClaw extends CommandBase {
    private final Claw_Subsystem m_ClawClose;

    public CloseClaw(Claw_Subsystem subsystem) {
      m_ClawClose = subsystem;
      addRequirements(m_ClawClose);
    }
    @Override
    public void initialize() {
        m_ClawClose.closeClaw();
    }

     @Override
    public boolean isFinished() {
        return true;
    } 
  }