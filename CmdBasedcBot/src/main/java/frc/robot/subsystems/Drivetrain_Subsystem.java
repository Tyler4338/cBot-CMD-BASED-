package frc.robot.subsystems;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Victor;

public class Drivetrain_Subsystem extends SubsystemBase {
    //Victor groups left and right

    //Left
    private final Victor m_leftVictor1 = new Victor(0);
    private final Victor m_leftVictor2 = new Victor(1);
    private final Victor m_leftVictor3 = new Victor(2);
    //Right
    private final Victor m_RightVictor1 = new Victor(3);
    private final Victor m_RightVictor2 = new Victor(4);
    private final Victor m_RightVictor3 = new Victor(5);

    
    //m_right = new SpeedControllerGroup(new SpeedControllerGroup(new Victor(3), new Victor(4) ), new Victor(5) );

    //Speed Groups left and right
    private final SpeedControllerGroup m_left= new SpeedControllerGroup(m_leftVictor1 , m_leftVictor2 , m_leftVictor3);
    private final SpeedControllerGroup m_right= new SpeedControllerGroup(m_RightVictor1 , m_RightVictor2 , m_RightVictor3);
    
    //Drivetrain
    private DifferentialDrive drive = new DifferentialDrive(m_left, m_right); 

    /**
    * Drive method
    */
    public void arcadeDrive (double xSpeed, double zRotation){
          drive.arcadeDrive(xSpeed, zRotation);
      }
}