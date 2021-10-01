import java.io.*;
import java.util.*;

class Login{
   public static void main(String args[]) {
	System.out.println("if you have tickets input 1 if no input  0");
	
	Scanner sc=new Scanner(System.in);
	int ch=sc.nextInt();
  	if(ch==0)
	{

		System.out.println("enter your credential and your ticket will be booked");
		System.out.println("please Enter username:");
		String uN=sc.next();
		System.out.println("please Enter password:");
		String pass=sc.next();
		System.out.println("please Enter no of tickets?");
		int tickets=sc.nextInt();

		for(int i=1;i<=tickets;i++)
		{
		System.out.println("please Enter the name of passenger" + i +" :\n");
	   	String pasi=sc.next();
		}

		Ticket.create(uN,pass,tickets);
	}
	else{
		System.out.println("please Enter username:");
		String uN=sc.next();
		System.out.println("please Enter password:");
		String pass=sc.next();
		if(pass.equals(Ticket.password(uN)))
		{
			System.out.println("***************");
			Ticket.display(uN);
		}
		else
		{
		System.out.println("Invalid credentials!! please enter valid username and password");
		}
	}

   }
}