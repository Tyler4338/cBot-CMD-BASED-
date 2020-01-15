package frc.robot.commands;
import frc.robot.subsystems.MotorGear_Subsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;


public class GearSwitch extends CommandBase {
    private final MotorGear_Subsystem m_GearState;
    private boolean gearsOnLow = true;
    private boolean gearsOnHigh = false;

    public GearSwitch(MotorGear_Subsystem subsystem) {
      m_GearState = subsystem;
      addRequirements(m_GearState);
    }
    @Override
    public void initialize() {
      if(gearsOnLow && !gearsOnHigh){
        m_GearState.setHighGear();
      } 
      else if(!gearsOnLow && gearsOnHigh){
        m_GearState.setLowGear();
      } 
      gearsOnLow = !gearsOnLow;
      gearsOnHigh = !gearsOnHigh;
    }

     @Override
    public boolean isFinished() {
        return true;
    } 
  }