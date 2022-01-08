package icici.loans.eduloans;

import java.util.Scanner;

public class SingleDiaArray {

	public static void main(String[] args) {
		

		Scanner Sc=new Scanner(System.in);
		int asize=Sc.nextInt();
		
		int[] a= new int[asize];
		int Sum=0;
		
		for(int i=0;i<a.length;i++)
		{
		a[i]=Sc.nextInt();
		System.out.println("a[i]");
		Sum=Sum+a[i];
		}
		System.out.println(Sum);
	}

}
