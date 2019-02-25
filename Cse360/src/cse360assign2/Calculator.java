package cse360assign2;
/**
* Program to implement a basic calculator
* @author Suraj Atmakuri 
* Class-ID: 320
*/
/*
 * Class Calculator can perform all the basic operations
 * and can also allows the user to view history 
*/
public class Calculator 
{

	private int total;
	
	/** 
	    * Class constructor.
	    */
	
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
	}
	/** 
	    * Returns the total after performing the operations for the input
	    */
	
	public int getTotal () 
	{
		return total;
	}
	/** 
	    * Adds two numbers entered by the user
	    * @param value the number inserted by the user to perform 
	    * the desired operation
	    */
	public void add (int value) 
	{
		total = total + value;
	}
	/** 
	    * Subtracts numbers entered by the user
	    * @param value the number inserted by the user to perform 
	    * the desired operation
	    */
	public void subtract (int value) 
	{
		total = total - value;
	}
	/** 
	    * Multiplies numbers entered by the user
	    * @param value the number inserted by the user to perform 
	    * the desired operation
	    */
	public void multiply (int value) 
	{
		total = total * value;
	}
	/** 
	    * Divides numbers entered by the user
	    * @param value the number inserted by the user to perform 
	    * the desired operation
	    */
	public void divide (int value)
	{
		total = total / value;
	}
	/** 
	    * Displays all the previous operations performed by the user
	    */
	public String getHistory () 
	{
		return "";
	}
}
