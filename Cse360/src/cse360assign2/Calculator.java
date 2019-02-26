package cse360assign2;
/**
 * link to the git repository : https://github.com/Suraj7696/Id_320.git
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
	private StringBuilder his = new StringBuilder();
	/** 
	    * Class constructor.
	    */
	
	public Calculator () 
	{
		total = 0;  
		his.append('0');
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
		his.append('+');
		his.append(value);
	}
	/** 
	    * Subtracts numbers entered by the user
	    * @param value the number inserted by the user to perform 
	    * the desired operation
	    */
	public void subtract (int value) 
	{
		total = total - value;
		his.append('-');
		his.append(value);
	}
	/** 
	    * Multiplies numbers entered by the user
	    * @param value the number inserted by the user to perform 
	    * the desired operation
	    */
	public void multiply (int value) 
	{
		total = total * value;
		his.append('*');
		his.append(value);
	}
	/** 
	    * Divides numbers entered by the user
	    * @param value the number inserted by the user to perform 
	    * the desired operation
	    */
	public void divide (int value)
	{
		boolean zeroFound = false;
		if(value ==0)
		{
			total=0;
			zeroFound = true;
		}
		if(!zeroFound)
		{
		total = total / value;
		}
		his.append('/');
		his.append(value);
	}
	/** 
	    * Displays all the previous operations performed by the user
	    * converting StringBuilder object into String object
	    */
	public String getHistory () 
	{
		String history;
		history = his.toString();
		return history;
	}
}
