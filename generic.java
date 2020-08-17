//import java.util.*;
public class generic<E> {
	public static <E> void get_result(E n)
	{
		try
		{
			if(n.getClass().getName()=="String")
			{
				throw new Exception();
			}
			else {
				System.out.println("2/3 of "+n+" is : " +((int)n*2)/3);
			}
		} 
		catch(Exception e) 
		{ 
			System.out.println("Strings not allowed!");
		} 
	}
	public static void main(String[] args) 
	{
		get_result(1000);
		get_result("one");
	}
}