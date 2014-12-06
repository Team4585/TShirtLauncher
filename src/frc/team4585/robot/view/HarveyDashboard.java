
package frc.team4585.robot.view;

import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Ivan Tachini (@Husky Robotics <Team 4585> )
 */
public class HarveyDashboard {
    
    private static boolean isDebugModeOn;
    
    public HarveyDashboard()
    {
        isDebugModeOn = false; // Debug mode starts off disabled
        
        SmartDashboard.putData("< Toggle Debug Mode >",new HarveyDashboard().ToggleDebugMode());
        SmartDashboard.putBoolean("DEBUGMODE",isDebugModeOn);
     
    }
    
    public void update()
    {
        SmartDashboard.putData("< Toggle Debug Mode >",new HarveyDashboard().ToggleDebugMode());
        SmartDashboard.putBoolean("DEBUGMODE",isDebugModeOn);
    }
    
    public Sendable ToggleDebugMode()
    {
        isDebugModeOn = !isDebugModeOn;
        return null;
    }
    
    public static boolean getDebugMode()
    {
       return isDebugModeOn;
    }
  
   
    
}
