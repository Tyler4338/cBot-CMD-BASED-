/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.SPI;
/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

        //X-Box controler
        public static final int k_Controler_port = 0;

        //Gyro Related ports and constants
        public static final SPI.Port k_GyroPort = SPI.Port.kOnboardCS0;
    
        //Designated solenoid ports to PCM
        public static final int k_SolenoidClawDeployChannel = 0;
        public static final int k_SolenoidClawRetractChannel = 1;
        public static final int k_SolenoidGearDeployChannel = 2;
        public static final int k_SolenoidGearRetractChannel = 3;
}
