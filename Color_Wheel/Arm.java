package frc.robot.Color_Wheel;

import com.ctre.phoenix.motorcontrol.ControlMode;

import org.graalvm.compiler.virtual.phases.ea.ReadEliminationBlockState;

import frc.robot.Map;

public class Arm{

    public static boolean colorPistonActive = false;
    public static boolean isCompleted;
    

    public static void lift() {}
        /*
        if (Map.Controllers.xbox.getRawButtonPressed(20)) {
            if (!colorPistonActive) {
                Map.ColorWheel.SensorLift.set(true);
                colorPistonActive = true;
            } else{
                Map.ColorWheel.SensorLift.set(false);
                colorPistonActive = false;
                

            }

            
        }
        */
    

    public static void colorMatchBlue(){
        if(isCompleted == true){
            Map.ColorWheel.ColorSpinner.set(ControlMode.PercentOutput, 0);
        }else{
            if(ColorSensor.isBlue == true){
                while(ColorSensor.isBlue == true){
                    Map.ColorWheel.ColorSpinner.set(ControlMode.PercentOutput, 0.2);
                }
            }
        }
    }

  /*      
        if(ColorSensor.isBlue == false){
            while(ColorSensor.isBlue == false){
                Map.ColorWheel.ColorSpinner.set(ControlMode.PercentOutput, .5);
                if(ColorSensor.isBlue == true){
                    isCompleted = true;
                }
            }
    }   
    }
*/

    public static void colorMatchGreen(){
        if(isCompleted == true){
            Map.ColorWheel.ColorSpinner.set(ControlMode.PercentOutput, 0);
        }else{
            if(ColorSensor.isGreen == true){
                while(ColorSensor.isGreen == true){
                    Map.ColorWheel.ColorSpinner.set(ControlMode.PercentOutput, 0.2);
            }
        }
    }
    
        
        if(ColorSensor.isGreen == false){
            while(ColorSensor.isGreen == false){
                Map.ColorWheel.ColorSpinner.set(ControlMode.PercentOutput, 0.5);
                if(ColorSensor.isGreen == true){
                    isCompleted = true;
                }
        }
    }
    }

    public static void colorMatchYellow(){
        if(isCompleted == true){
            Map.ColorWheel.ColorSpinner.set(ControlMode.PercentOutput, 0);
        }else{
            if(ColorSensor.isYellow == true){
                while(ColorSensor.isYellow == true){
                    Map.ColorWheel.ColorSpinner.set(ControlMode.PercentOutput, 0.2);
            }
        }
    }
        
        if(ColorSensor.isYellow == false){
            while(ColorSensor.isYellow == false){
                Map.ColorWheel.ColorSpinner.set(ControlMode.PercentOutput, 0.5);
                if(ColorSensor.isYellow == true){
                    isCompleted = true;
                }
        }
    }
     
    }

    public static void colorMatchRed(){
        if(isCompleted == true){
            Map.ColorWheel.ColorSpinner.set(ControlMode.PercentOutput, 0);
        }else{
            if(ColorSensor.isRed == true){
                while(ColorSensor.isRed == true){
                    Map.ColorWheel.ColorSpinner.set(ControlMode.PercentOutput, 0.2);
            }
        }
    }
        
        if(ColorSensor.isRed == false){
            while(ColorSensor.isRed == false){
                Map.ColorWheel.ColorSpinner.set(ControlMode.PercentOutput, 0.5);
                if(ColorSensor.isRed == true){
                    isCompleted = true;
                }
        }
    }

    }

    public static void spin(double pwr){
            Map.ColorWheel.ColorSpinner.set(ControlMode.PercentOutput, pwr);
    }

    public static void SpinThreeTimes(){
        int counter = 0;
        bool start = true;
        bool on_start_color = false;
        bool ready_to_count = false;

        while (counter <= 7) {
            //We run this code until we see the starting color 7 times
            if (start == true) {
                //When we run it the first time we get the initial color and the set start to false so that we never re-run this code
                Color starting_color = ColorSensor.getColor();
                start = false;
            } else if (counter <= 7) {
                Map.ColorWheel.ColorSpinner.set(ControlMode.PercentOutput, 0.3);
                if (on_start_color = true) {
                    //If we are on the starting color, we set that we are ready to count to true so that when we go off that color we know to count by 1
                    ready_to_count = true;
                } else if (on_start_color = false && ready_to_count == true) {
                    //This if statement says that if you just saw the starting color but aren't seeing it anymore, count by one
                    counter += 1;
                    ready_to_count = false;
                }

            } else {
                //Once we pass the starting color 7 times, we stop the motor from running and exit the loop
                Map.ColorWheel.ColorSpinner.set(ControlMode.PercentOutput, 0);
            }

            if (ColorSensor.getColor() == starting_color) {
                //This if statement just makes it easier to check wether we are on the strting color
                on_start_color = true;
            } else {
                on_start_color = false;
            }

        }

    }

}