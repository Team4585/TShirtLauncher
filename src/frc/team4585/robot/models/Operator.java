
package frc.team4585.robot.models;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import frc.team4585.robot.controller.RobotController;

/**
 *
 * @author 
 */
public class Operator
{
    
    //Declaration Section
    private final RobotDrive RobotHarvey;
    private final Joystick Extreme3DPro;
    private final Joystick Attack3;
    private final Compressor Compressor;
    
    /**
     * Constructs Objects
     * RobotHary, Extreme3DPo
     * Attack3, Compressor
     */
    public Operator()
    {
        //Initalization section
        RobotHarvey  = RobotController.getRobotChassis();
        Extreme3DPro = RobotController.getExtreme3DPro();
        Attack3      = RobotController.getAttack3();
        Compressor   = RobotController.getCompressor();
       
    }
    
    /**
     * Called when robot enters operator control.
     */
   public void executeCode()
   {
     //Call Your Methods here          
     yourMethod();           
             
   }
   
   public void yourMethod()
   {
       //Example Method
        if(Extreme3DPro.getRawButton(7))
           RobotHarvey.tankDrive(0,0);
   }
  
    
}
