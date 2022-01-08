package sindhu.practice.patterns;

public class TrianglePattern {

	public static void main(String[] args) {
		
		
	for(int i=1;i<=5;i++) 
	{
		for(int j=1;j<=i;j++) //first time j=1,even i=1, j<=1, so it will print one star n go out ot the for loop to outer for loop
		{
			System.out.print("* ");
		}
		System.out.println(" ");
	}
	for(int i=1;i<=4;i++) 
	{
		for(int j=i;j<=4;j++) //first time j=i=1, j<=5, so it will print 5 stars n go out ot the for loop to outer for loop
		{						// 2nd time j=i=2, so it will print 4 stars
			System.out.print("* ");
		}
		System.out.println(" ");
	}
	
	for(int i=1;i<=4;i++) 
	{
		for(int j=1;j<=4;j++) //first time j=i=1, j<=4, so it will print 1,2,3,4 stars n go out ot the for loop to outer for loop
		{						// 2nd time j=i=2, so it will print 2,3,4 stars(i.e 3 stars- like 2-4 stars)
			System.out.print("* ");
		}
		System.out.println(" ");
	}
	System.out.println("===========================");
	System.out.println(" ");
	for(int i=1;i<=5;i++) 
	{
		for(int j=i;j<=5;j++) //first time j=i=1, j<=4, so it will print 1,2,3,4 stars n go out ot the for loop to outer for loop
		{						// 2nd time j=i=2, so it will print 2,3,4 stars(i.e 3 stars- like 2-4 stars)
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) //first time j=i=1, j<=4, so it will print 1,2,3,4 stars n go out ot the for loop to outer for loop
		{						// 2nd time j=i=2, so it will print 2,3,4 stars(i.e 3 stars- like 2-4 stars)
			System.out.print("*");
		}
		System.out.println(" ");
	}
	
	for (int i=1;i<=5;i++)
	{
		for (int j=i;j<=5;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println("  ");

	}
	for (int i=1;i<=5;i++)
	{
		for (int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
		for (int j=i;j<=4;j++)
		{
			System.out.print("*");
		}
		System.out.println("  ");

	}
}
}


