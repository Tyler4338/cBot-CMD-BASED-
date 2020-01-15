/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.ClawToggle_CMD;
import frc.robot.commands.CloseClaw;
import frc.robot.commands.DefaultDrive;
import frc.robot.commands.GearSwitch;
import frc.robot.commands.OpenClaw;
import frc.robot.subsystems.Claw_Subsystem;
import frc.robot.subsystems.Drivetrain_Subsystem;
import frc.robot.subsystems.MotorGear_Subsystem;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a "declarative" paradigm, very little robot logic should
 * actually be handled in the {@link Robot} periodic methods (other than the
 * scheduler calls). Instead, the structure of the robot (including subsystems,
 * commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  // Controllers// x a s
  public final XboxController m_pilot = new XboxController(Constants.k_Controler_port);

  private final Compressor compressor = new Compressor(0);
  

  // Subsystems//
  private final MotorGear_Subsystem m_GearState = new MotorGear_Subsystem();
  private final Claw_Subsystem m_Claw = new Claw_Subsystem();
  private final Drivetrain_Subsystem m_Drive = new Drivetrain_Subsystem();
  // commands//
  private final GearSwitch m_GearSwitch = new GearSwitch(m_GearState);
  private final CloseClaw m_CloseClaw = new CloseClaw(m_Claw);
  private final OpenClaw m_OpenClaw = new OpenClaw(m_Claw);
  private final DefaultDrive m_DefaultDrive = new DefaultDrive(m_Drive, m_pilot);
  private final ClawToggle_CMD m_TOGGLE = new ClawToggle_CMD(m_Claw);
  //CMD GROUPS//

  /**
   * The container for the robot. Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    SmartDashboard.putData(m_Drive);
    SmartDashboard.putData(m_Claw);
    SmartDashboard.putData(m_GearState);

    compressor.setClosedLoopControl(true);
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be
   * created by instantiating a {@link GenericHID} or one of its subclasses
   * ({@link edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then
   * passing it to a {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    Trigger Gear_Button = new JoystickButton(m_pilot, XboxController.Button.kX.value)
                  .whenPressed(m_GearSwitch);
    // JoystickButton Gear_ButtonX = new JoystickButton(pilot,
    // XboxController.Button.kX.value);
    Trigger Claw_Button = new JoystickButton(m_pilot, XboxController.Button.kA.value)
                  .whenPressed(m_TOGGLE);//Change
    //Trigger Claw_ButtonO = new JoystickButton(m_pilot, XboxController.Button.kY.value)
    //              .whenPressed(m_OpenClaw);
    //Trigger Claw_ButtonC = new JoystickButton(m_pilot, XboxController.Button.kB.value)
    //              .whenPressed(m_CloseClaw);
    //JoystickButton Claw_Button = new JoystickButton(pilot, XboxController.Button.kA.value);
    Trigger DriveEnabler_Button = new JoystickButton(m_pilot, XboxController.Button.kStart.value)
                  .whenPressed(m_DefaultDrive);

    Trigger DriveDisabler_Button = new JoystickButton(m_pilot, XboxController.Button.kB.value)
                 .and(new JoystickButton(m_pilot, XboxController.Button.kY.value))
                .cancelWhenActive(m_DefaultDrive);

    //JoystickButton y_Value = new JoystickButton(pilot, XboxController.Button.kStickLeft.value);
    //JoystickButton X_Value = new JoystickButton(pilot, XboxController.Button.kStickRight.value);
  }
  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
}
