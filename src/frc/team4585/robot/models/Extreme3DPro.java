/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frc.team4585.robot.models;

import edu.wpi.first.wpilibj.Joystick;

/**
 *
 * @author Ivan Tachini @HuskyRobotics <Team 4585>
 */
public class Extreme3DPro {
    
    private final Joystick Extreme3DPro;
    
    /*
     *  Extreme3DPro Joystick Axis:
     * ( Min | Center | Max)
     * (-1.0 >  0.0   > 1.0)
     */
    private double XAxis;
    private double YAxis;
    private double ZAxis;
    private double TwistAxis;
    private double ThrottleAxis;
    
    
    
    
    public Extreme3DPro(int USBPORT)
    {
        Extreme3DPro = new Joystick(USBPORT);
    }
    
    
    
            
   
    
}
