package com.primenumber;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check:");
		int number=sc.nextInt();
		int loopcounter=0, flag=0;
		for (int i = 2; i <=Math.sqrt(number) ; i++) {
			System.out.println(loopcounter);
			if(number%i==0)
			{
				flag=1;
				break;
			}
			loopcounter++;
		}
		if(flag==0)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("Not prime");
		}

	}

}
