package frc.robot.commands;
import frc.robot.subsystems.Claw_Subsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;



public class ClawToggle_CMD extends CommandBase {
    private static boolean OpenedClaw = false;
    private final Claw_Subsystem m_claw;
    
    public ClawToggle_CMD(Claw_Subsystem subsystem) {
      m_claw = subsystem;
      addRequirements(m_claw);
    }
    public void initialize(){
        if(!OpenedClaw){
          new OpenClaw(m_claw);
        }
        else if(OpenedClaw){
          new CloseClaw(m_claw);
        }
        OpenedClaw =  !OpenedClaw;
    }
    
    @Override
    public boolean isFinished() {
        return true;
    } 
  }