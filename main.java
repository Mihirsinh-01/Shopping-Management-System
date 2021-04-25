package main;

import java.util.*;
import java.lang.*;
import owner.*;
import customer.*;
import item.*;


public class main
{
	public static void main(String args[])
	{
		new Cls();
		System.out.println("\n\t<-------------SHOPPING MANAGEMENT SYSTEM------------->\n");
		Scanner s = new Scanner(System.in);
		int ch=1;
		do
		{
			switch(ch)
			{
				case 1 :
				// This case for Owner to check and Update goods
				//System.out.println("case 1");
				{
					owner o = new owner();
					o.enter();					break;

				}

				case 2 :
				// This case for Buyer to add Product or Update Cart
				{
					customer c = new customer();
					try
					{
						c.choice();
					}
					catch(Exception e)
					{
						System.out.println("\n\t\t\tSorry !!! Less Quantity Available ");
					}
					break;
					
				}
				case 3 : 
				{
					customer cr = new customer();
					try
					{
						cr.viewbill();
						System.out.print("\n\t\t\tPress any to Continue ");
						s.next();
					}
					catch(Exception e)
					{
						System.out.println("\n\t\t\tException Generated");
					}
					break;
				}
				default:
				System.out.println("Please Enter a valid Number"); 
			}
			new Cls();
			System.out.print("\n\t<-------------SHOPPING MANAGEMENT SYSTEM------------->\n");
			System.out.print("\n\t|\t           Please Enter       \t\t     |\n");
			System.out.print("\n\t|\t           1.Owner Login            \t     |\n");
			System.out.print("\n\t|\t           2.Customer         \t\t     |\n");
			System.out.print("\n\t|\t           3.View Bill       \t\t     |\n");
			System.out.print("\n\t|\t           4.Quit      \t\t \t    |\n");
			System.out.print("\n\t<---------------------------------------------------->\n");
			System.out.print("\n\t\t            Choice:");
			ch=s.nextInt();
		}while(ch!=4);
	}
}