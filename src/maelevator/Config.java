package maelevator;

/**
 *
 * @author MTALT(edited  2/12/13)
 */
class Config
{
    //alternate way to do person counter
    //way to store config items in effect globals
    
    public static int  MAXFLOORS = 10;//treated as a constant for now
    
    private static int PersonCounter = 0;
    
    public static int getPersonCounter()
    {
        return PersonCounter++;
    }
}