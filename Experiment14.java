package basics;

import java.io.*;
import java.util.Scanner;

class ThrowClass { 
    void testMethod() throws IOException, ArithmeticException{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 2 numbers to be divided:");
		double num1=sc.nextInt();
		double num2=sc.nextInt();
		if(num2==0) {
			throw new ArithmeticException("ArithmeticException :Division by zero not possible.");
			
		}
		else {
			double div=num1/num2;
			System.out.println("Answer = "+div);
		}
	} 
}

class Experiment14{ 
	public static void main(String args[]){ 
		try{ 
			ThrowClass obj=new ThrowClass(); 
			obj.testMethod(); 
		}
		catch(Exception ex){
			System.out.println(ex);
		} 
		finally {
			System.out.println("............THANK YOU............");
		}
	}
}