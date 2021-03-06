/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Intake extends Subsystem {
  public VictorSP intake = new VictorSP(RobotMap.INTAKE_PORT);
  public void intake(double speed){
    intake.set(speed);
  }
  public void stop(){
    intake.set(0);
  }
  @Override
  public void initDefaultCommand() {
  }
}
