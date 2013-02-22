package maelevator;

//Last updated 2/11/13 - Mike Amaral

/*Example of a basic data class*/
class Button
{
    boolean bulb;
    //class property for ON/Off
    static final boolean ON = true;
    static final boolean OFF = false;
//label?
    
    Button ()
    {
        bulb = ON; //light is on
    }

    Button (boolean pbulb)
    {
        bulb = pbulb;
    }

    boolean getBulb()
    {
        return bulb;
    }
    void setBulb(boolean pbulb)
    {
        bulb = pbulb;
    }

    boolean isLightOn()
    {
        return bulb == ON;
    }

    boolean isLightOff()
    {
        return bulb != ON;
    }

    void display()
    {
        if (isLightOn())
        {
        System.out.println("Light is ON");
        }
        else
        {
            System.out.println("Light is OFF");
        }
    }
}