package owner;

import java.util.*;
import java.lang.*;
import item.*;


public class owner
{
	Scanner s = new Scanner(System.in);
	String name,pass;
	int n;
	int ch=1,w=1,e=1,r=1;
	static int q=1,v=1,p=1,m=1,z=1;
	public void enter()
	{
		new Cls();
		System.out.println("\n\t<-------------SHOPPING MANAGEMENT SYSTEM------------->\n");
	System.out.print("\n\t           Enter ID :: ");
	name=s.next();
	System.out.print("\n\t           Enter PASSWORD :: ");
	pass=s.next();
	if((name.equals("mihir") && pass.equals("12345"))|| (name.equals("vivek") && pass.equals("54321")))
	{
		do
		{
			new Cls();
			System.out.print("\n\t<-------------SHOPPING MANAGEMENT SYSTEM------------->\n");
			System.out.print("\n\t|\t           Please Enter       \t\t     |\n");
			System.out.print("\n\t|\t           1.Kids            \t\t     |\n");
			System.out.print("\n\t|\t           2.Grocery         \t\t     |\n");
			System.out.print("\n\t|\t           3.Adults       \t\t     |\n");
			System.out.print("\n\t|\t           4.Furniture       \t\t     |\n");
			System.out.print("\n\t|\t           5.Stop            \t\t     |\n");
			System.out.print("\n\t<---------------------------------------------------->\n");
			System.out.print("\n\t\t            Choice:");
			ch=s.nextInt();
			
			switch(ch)
			{
				case 1:
				{
					if((v++)==1)
					{
						new Cls();
						System.out.print("\n\t<-------------SHOPPING MANAGEMENT SYSTEM------------->\n");
						System.out.print("\n\t|\t             Kids            \t\t     |\n");
						System.out.print("\n\t<---------------------------------------------------->\n");
						System.out.print("\n\t\t   Enter Number of items to input: ");
						n=s.nextInt();
					}
					inputkid k = new inputkid(n);
					if((q++)==1)
					{
						k.update();
					}
					k.menu();
					break;
				}
				case 2:
				{
					if((p++)==1)
					{
						new Cls();
						System.out.print("\n\t<-------------SHOPPING MANAGEMENT SYSTEM------------->\n");
						System.out.print("\n\t|\t             Grocery            \t     |\n");
						System.out.print("\n\t<---------------------------------------------------->\n");
						System.out.print("\n\t\t   Enter Number of items to input: ");
						n=s.nextInt();
					}
					inputgro g = new inputgro(n);
					if((w++)==1)
					{
						g.update();
					}
					g.menu();
					break;
				}
				case 3:
				{
					if((z++)==1)
					{
						new Cls();
						System.out.print("\n\t<-------------SHOPPING MANAGEMENT SYSTEM------------->\n");
						System.out.print("\n\t|\t             Adults            \t\t     |\n");
						System.out.print("\n\t<---------------------------------------------------->\n");
						System.out.print("\n\t\t   Enter Number of items to input: ");
						n=s.nextInt();
					}
					inputadu a = new inputadu(n);
					if((e++)==1)
					{
						a.update();
					}
					a.menu();
					break;
				}
				case 4:
				{
						new Cls();
						System.out.print("\n\t<-------------SHOPPING MANAGEMENT SYSTEM------------->\n");
						System.out.print("\n\t|\t             Furniture            \t     |\n");
						System.out.print("\n\t<---------------------------------------------------->\n");
						System.out.print("\n\t\t   Enter Number of items to input: ");
					n=s.nextInt();
					inputfur f = new inputfur(n);
					if((r++)==1)
					{
						f.update();
					}
					f.menu();
					break;
				}
				case 5 : 
				{
					break;
				}
				default:
				{
					//System.out.println("\n\t<-------------SHOPPING MANAGEMENT SYSTEM------------->\n");
					System.out.println("\n\t\t    Enter Valid Input ");
				}
			}
		}while(ch!=5);
	}
	else
	{
		System.out.println("Pls Enter Valid ID and PASSWORD ");
	}
	}
}