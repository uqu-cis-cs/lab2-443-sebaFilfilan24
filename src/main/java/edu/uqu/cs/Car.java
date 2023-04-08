package edu.uqu.cs;
/*
 * Lab 2 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/
import java.util.Scanner;

public class Car{

    /************ Part 1 **************/
    /**
     * Decalre all instance variables 
     * model of type String
     * inOutGarage of type boolean
     * Make sure they are all private
     * Syntax:
     * private dataType name;
     *
     */
    private  String model;
    private boolean inOutGarage;



    /************ Part 2 **************/
    /**
     * Define a default constructor and set 
     * all instance variables to their default values
     * model ="";
     * inOutGarage =false;
     * Syntax:
     * public className (){
     *      //body
     * }
     */
    public className {

        this.model = "";
        this.inOutGarage = false;

    }



    /************ Part 3 **************/
    /**
     * Define all getter methods below
     * for each instance variable
     * Syntax:
     * public dataType getInstanceVariableName (){
     *      return this.InstanceVariableName;
     * }
     */
    public String getModel( ) {

      public String getModel( ){

        return this.model;

      }

      public boolean 
        getInOutGarage(){
            return this.inOutGarage;
        }
      

    }

    /************ Part 4 **************/
    /**
     * Define all setter methods below
     * for each instance variable
     * public void setInstanceVariableName (parameter){
     *      this.InstanceVariableName= parameter;
     * }
     *
     */

    public void setModel(String model){
        this.model = model;
    }

    public void
    setInOutGarage(boolean inOutGarage){
        this.inOutGarage = inOutGarage;
    }

    /************ Part 5 **************/
    /**
     * Implement the following two methods
     * moveCarOut() to set the inOutGarage flag to false;
     * moveCarIn() to set the inOutGarage flag to true;
     *
     */
     
     public void movecarOut() {
        this.inOutGarage = false;
     }

    public void moveCarin() [
        this.inOutGarage = true;
    ]


}