import java.util.Scanner;

public class OddSeries2 {
	public static void main(String args[])
	{
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter series");
		int count=sc.nextInt();
		
		for(int i=1;i<=count;i++)
		{
			
			System.out.print("a:"+i+" ");
			System.out.print("Output:");
		
			for(int j=1;j<=i*2;j=j+2)
			{
					
				   System.out.print(j +" ");
				
			}
			System.out.println();
		}
	}
}
