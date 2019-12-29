/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class Turn extends Command {
  double deg,speed,targetAngle;
  public Turn(double deg) {
    this.deg=deg;
    requires(Robot.drive);
  }

  @Override
  protected void initialize() {
    speed = deg > 0 ? 0.3:-0.3;
    targetAngle = Robot.drive.ahrs.getAngle() + deg;
  }

  @Override
  protected void execute() {
    Robot.drive.turn(speed);
  }

  @Override
  protected boolean isFinished() {
    if(speed>0)return Robot.drive.ahrs.getAngle()>=targetAngle;
    else return Robot.drive.ahrs.getAngle()<=targetAngle;
  }

  @Override
  protected void end() {
    Robot.drive.stop();
  }

  @Override
  protected void interrupted(){
    end();
  }
}
