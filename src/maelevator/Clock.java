package maelevator;
/**Mike Amaral 2/11/13 -last edited
 */
/** package maelevator
 */


/*Clock Class (Public)*/

public class Clock
{ 
    
    //properties
    int iTime;
    
    Clock()
    {
        int iTime = 0;
    }
    
    
    Clock(int pTime)
    {
    // do we need secondary constructor? is data derived?
        iTime = pTime;
    }
    
    
    int getTime()
            
    {
        return iTime;
    }
    
    void setTime(int pTime)
    {
        iTime = pTime;
    }
    
    //would void be the proper return value type
    void Reset()
    {
      //is this the correct way to reset time?
        setTime(0);
    }
    
    void Tick()
    {
        //not sure how to automate this.
    iTime ++;
    }
    
    
}