package normalprog;

import java.util.Scanner;

public class tcsArray 
{
	public static void main(String[] args) 
	{
		int[] id1= {1,2,3,4,5};
		String[] name1= {"apple","banana","mango","jackfruit","grapes"};
		int[] rs1= {10,20,30,40,50};
		int[] count1= {5,6,7,8,9,11};
       int n,amount=0,num;
       Scanner s=new Scanner(System.in);
       n=s.nextInt();
       num=s.nextInt();
			if(num<count1[n])
			{
				System.out.println(id1[n]);
				System.out.println(name1[n]);
				amount=rs1[n]*num;
				System.out.println(amount);
				count1[n]=count1[n]-num;
				System.out.println(count1[n]);
			}
			else
			{
				System.out.println(id1[n]);
				System.out.println(name1[n]);
				amount=rs1[n]*num;
				System.out.println(amount);
				System.out.println("out of stack");
			}
		
		
		
		
		
		
		
	}
	

}
