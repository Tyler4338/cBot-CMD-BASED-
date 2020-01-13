package frc.robot.subsystems;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Claw_Subsystem extends SubsystemBase {
    private final DoubleSolenoid m_clawPistons = new DoubleSolenoid(Constants.k_SolenoidClawDeployChannel, 
        Constants.k_SolenoidClawRetractChannel);
        
    /**
    * Opens Claw.
    */
    public void openClaw(){
        m_clawPistons.set(DoubleSolenoid.Value.kForward);
    }
    /**
    * Closes Claw.
    */
    public void closeClaw(){
        m_clawPistons.set(DoubleSolenoid.Value.kReverse);
    }
}