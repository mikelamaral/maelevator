package maelevator;
/**Mike Amaral 2/1/13 -last edited
 */
/** package maelevator
 */


/**
 * @People Class (Public)
 */

public class People
{ 
    //properties
    int iStartF;
    int iStopF;
    int iIDNum;
    int iStartTime;
    int iStopTime;
    boolean bDirection;
    
    /**Adding counter as static class property
    * static int Counter = 0;
    */
 
  
    
    //Methods
 public People()
    { //default constructor
    //processing variables
    int iStartF = 0;
    int iStopF = 0;
    int iIDNum = 0;
    getIDNumber();//modifies iID
    int iStartTime = 0;
    int iStopTime = 0;
    boolean bDirection = true;//true
    }
    
    public People(int pIDNum, int pStart, int pStop, int pStartTime, int pStopTime)
    {//secondary constructor
        iIDNum = pIDNum;
        iStartF = pStart;
        iStopF = pStop;
        iStartTime = pStartTime;
        iStopTime = pStopTime;
 
     }
    
    /**
     * Gets and Sets are Below
     *
     * 
     */
    
int getStartF()
    {
        return iStartF;
                        }
    
    void setStartF(int pStartF)
    {
        iStartF = pStartF;
                        }
    
    
 int getStopF()
    {
        return iStopF;
                        }
    
    void setStopF(int pStopF)
    {
        iStopF = pStopF;
                        }

int getIDNum()
    {
        return iIDNum;
                        }
    
    void setIDNum(int pIDNum)
    {
        iIDNum = pIDNum;
                        }
    
    //way to access counter
    void getIDNumber()
    {
        //iIDNum = Counter ++;
        iIDNum = Config.getPersonCounter();
    }
    
    

int getStartTime()
    {
        return iStartTime;
                        }
    
    void setStartTime(int pStartTime)
    {
        iStartTime = pStartTime;
                        }
    
int getStopTime()
    {
        return iStopTime;
                        }
    
    void setStopTime(int pStopTime)
    {
        iStopTime = pStopTime;
                        }

/**
 * 
 * This is where I make my Direction Decision.
 * the Direction is derived from the start and stop floors.
 * the start and stop floors will be determined from the people generator class
 * 
 * @author Mike
 * @param isGoingUp
 * @see boolean 
 * 
 */
        
        
        
        
boolean isGoingUp()
        
        {
            boolean Returnvalue = false;
            
            if(iStartF>iStopF)
            {
                Returnvalue = false;
            }
            else 
            {
                Returnvalue = true;
            }
            
            return Returnvalue;
        }
   /**
    * This is where I call the display for my Direction Boolean
    * @return Going Up or Going Down
    * @see isGoingUp()
    * 
    */
    
       
    void displayisGoingUp()
    {
        if(isGoingUp())
                {
                 System.out.println("Going Up");   
                }
        else
        {
              System.out.println("Going Down");
        }
    }


void displayPeople()
{ //prints test stub
    System.out.println("  ID Number: "+iIDNum+"  Start Floor: "+iStartF+"  Stop Floor: "+iStopF+"  Start Time: "+iStartTime+"  Stop Time:  "+iStopTime+"  Direction:  ");
}




}//end People
