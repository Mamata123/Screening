import java.util.Scanner;

public class Calculator1 {
	public String add(double a,double b)
	{
		return Double.toString(a+b);
	}
	public String sub(double a,double b)
	{
		return Double.toString(a-b);
	}
	public String mul(double a,double b)
	{
		return Double.toString(a*b);
	}
	public String div(double a,double b)
	{
		return Double.toString(a/b);
	}
	public static void main(String args[])
	{
		Calculator1 c=new Calculator1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		double a =  sc.nextDouble();
		double b=sc.nextDouble();
		String result;
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter Choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			result=c.add(a, b);
			System.out.println("Addition:"+result);
			break;
		case 2:
			result=c.sub(a, b);
			System.out.println("substraction:"+result);
			break;
		case 3:
			result=c.mul(a, b);
			System.out.println("Multiplication:"+result);
			break;
		case 4:
			result=c.div(a, b);
			System.out.println("Division:"+result);
			break;
		}
	}
}
