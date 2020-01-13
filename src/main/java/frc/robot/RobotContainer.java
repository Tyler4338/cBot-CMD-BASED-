/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.Claw_Subsystem;
import frc.robot.subsystems.Drivetrain_Subsystem;
import frc.robot.subsystems.MotorGear_Subsystem;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem(); 
  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);
  //
  private final MotorGear_Subsystem m_GearState = new MotorGear_Subsystem();
  private final Claw_Subsystem m_Claw = new Claw_Subsystem();
  private final Drivetrain_Subsystem m_Drive = new Drivetrain_Subsystem();

 

  //Controllers// x a s
  public final XboxController pilot = new XboxController(0);

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }
  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    JoystickButton x_Button = new JoystickButton(pilot, XboxController.Button.kX.value);
    JoystickButton a_Button = new JoystickButton(pilot, XboxController.Button.kA.value);
    JoystickButton start_Button = new JoystickButton(pilot, XboxController.Button.kStart.value);
    //JoystickButton y_Value = new JoystickButton(pilot, XboxController.Button.kStickLeft.value);
    //JoystickButton X_Value = new JoystickButton(pilot, XboxController.Button.kStickRight.value);
  }
  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
