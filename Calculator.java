import java.util.*;
public class Calculator {
	interface cal
	{
		void op(int x,int y);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the numbers : ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.print("Enter the operation (+ or - or * or /) to perform : ");
		char c=sc.next().charAt(0);
		cal add=(int a,int b)->{
			System.out.println(a+b);
		};
		cal difference=(int a,int b)->{
			System.out.println(a-b);
		};
		cal product=(int a,int b)->{
			System.out.println(a*b);
		};
		cal safeDivision=(int a,int b)->{
			System.out.println(a/b);
		};
		sc.close();
		switch(c)
		{
		case('+'):
		{
			add.op(m,n);
			break;
		}
		case('-'):
		{
			difference.op(m,n);
			break;
		}
		case('*'):
		{
			product.op(m,n);
			break;
		}
		case('/'):
		{
			safeDivision.op(m,n);
			break;
		}
		default:
			System.out.println("Invalid operation!");
		}
	}
}
