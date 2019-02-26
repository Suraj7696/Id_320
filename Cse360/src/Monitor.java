import cse360assign2.*;
public class Monitor {
public static void main(String args[])
{
	Calculator c = new Calculator();
	c.add(3);
	c.subtract(2);
	c.multiply(6);
	c.divide(0);
	System.out.println(c.getTotal());
	System.out.println(c.getHistory());
}
}
