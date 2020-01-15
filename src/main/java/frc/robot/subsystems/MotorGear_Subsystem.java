package frc.robot.subsystems;
import edu.wpi.first.wpilibj.DoubleSolenoid;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class MotorGear_Subsystem extends SubsystemBase {
    private final DoubleSolenoid m_GearPistons = new DoubleSolenoid(Constants.k_SolenoidGearDeployChannel, 
        Constants.k_SolenoidGearRetractChannel);
    //public MotorGear_Subsystem(){
    //    SmartDashboard.putData(m_GearPistons);
    //}
        
    /**
    * Motors return to High gear.
    */
    public void setHighGear(){
        m_GearPistons.set(DoubleSolenoid.Value.kForward);
    }
    /**
    * Motors return to Low gear.
    */
    public void setLowGear(){
        m_GearPistons.set(DoubleSolenoid.Value.kReverse);
    }
}