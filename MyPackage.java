package mypack;

import java.math.BigDecimal;
import java.util.Scanner;


  public class MyPackage {
static private BigDecimal a;

 static private BigDecimal b;
 
 static Scanner sc=new Scanner(System.in);
	 static MyPackage my=new MyPackage();
	public void display() 
	{
	Calculator ca=new Calculator();
	System.out.println("enter the number A:");
			a=sc.nextBigDecimal();
	     System.out.println("enter the number B:");
	       b=sc.nextBigDecimal();
	       System.out.println("1.add:\n");
	       System.out.println("2.sub:\n");
	       System.out.println("3.mul:\n");
	       System.out.println("4.div:\n");
	      
switch(sc.nextInt())
{
case 1:	
	 System.out.println("add:\n");
	ca.add(a,b);
	my.display();
	break;
case 2:
	System.out.println("sub:\n");
	ca.sub(a,b);
	my.display();
	break;
case 3:
	System.out.println("mul:\n");
	ca.mul(a,b);
	my.display();
	break;
case 4:
	System.out.println("div:\n");
	ca.mul(a,b);
	my.display();
	break;
default:
	System.out.println("error occurs");
	System.exit(0);
	break;
}
	}
	
	public static void main(String[] args) {
		MyPackage my=new MyPackage();
		my.display();
	}	
	}




                  
