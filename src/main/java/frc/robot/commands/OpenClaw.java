package frc.robot.commands;
import frc.robot.subsystems.Claw_Subsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class OpenClaw extends CommandBase {
    private final Claw_Subsystem m_ClawOpen;

    public OpenClaw(Claw_Subsystem subsystem) {
      m_ClawOpen = subsystem;
      addRequirements(m_ClawOpen);
    }
    @Override
    public void initialize() {
        m_ClawOpen.openClaw();
    }

     @Override
    public boolean isFinished() {
        return true;
    } 
  }