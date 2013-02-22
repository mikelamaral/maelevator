/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maelevator;

/**
 *
 * @author MTALT
 */
public class Maelevator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         * Test to see if People display
         */
        
        People newID1 = new People();//Default constructor
        People newID2 = new People(1,4,2,0,45);
        /**
         * calls display method to show that the constructors work. also shows
         * that the gets and sets work
         */
        //default        

        System.out.println("Display Test empty Person");
        newID1.displayPeople();
        //secondary
        System.out.println("Display Test with tdata");
        newID2.displayPeople();
        System.out.println("Displays if going up or down");
        newID2.displayisGoingUp();
        /** Gets+Sets
         * 
         */
       
        /*test get start floor
        System.out.println("Start floor for get test input is "+newID2.getStart());
        //test set start floor
        newID2.setStart(7);
        System.out.println("Start floor for set test input is "+newID2.getStart());
       */
        
    }
}
