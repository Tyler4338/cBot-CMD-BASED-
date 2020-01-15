package frc.robot.commands;
import frc.robot.subsystems.Claw_Subsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ClawSwitch extends CommandBase {
    private final Claw_Subsystem m_ClawState;
    private static boolean OpenedClaw = false;

    public ClawSwitch(Claw_Subsystem subsystem) {
      m_ClawState = subsystem;
      addRequirements(m_ClawState);
    }
    @Override
    public void initialize() {
      if(OpenedClaw){
        m_ClawState.closeClaw();
      } 
      else if(!OpenedClaw){
        m_ClawState.openClaw();
      } 
      OpenedClaw = !OpenedClaw;
    }

    @Override
    public boolean isFinished() {
        return true;
    } 
  }