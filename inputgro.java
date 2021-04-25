package item;

import java.util.*;
import java.lang.*;

/*class ImproperDataException extends Exception
{
	ImproperDataException(String s)
	{
		super(s);
	}
}*/

abstract class grocery
{
	//Scanner s = new Scanner(System.in);
	abstract void add();
	abstract void update();
}
public class inputgro extends grocery
{
	Scanner s= new Scanner(System.in);
	int i=0,ch=1;
	static int r=1;
	static int n;
	public static String st[];
	public static int q[];
	public static float p[];
	public inputgro()
	{
		
	}
	public inputgro(int n)
	{
		if((r++)==1)
		{
		this.n=n;;
		st= new String[n];
		q=new int[n];
		p=new float[n];
		}
	}
	public void menu()
	{
		new Cls();
		System.out.print("\n\t<-------------SHOPPING MANAGEMENT SYSTEM------------->\n");
		System.out.print("\n\t|\t             Grocery            \t\t     |\n");
		System.out.print("\n\t<---------------------------------------------------->\n");
		System.out.print("\n\t\t\tPress 1 to Add Products,\n \t\t\tIncrease Quantity\n\t\t\t else Press any  ");
		ch=s.nextInt();
		if(ch==1)
		{
			add();
		}
	}
	public void update()
	{
		for(i=0;i<n;i++)
		{
			new Cls();
		System.out.print("\n\t<-------------SHOPPING MANAGEMENT SYSTEM------------->\n");
		System.out.print("\n\t|\t             Grocery            \t\t     |\n");
		System.out.print("\n\t<---------------------------------------------------->\n");
			System.out.print("\n\t\t    Please enter the Product Name : ");
			st[i]=s.next();
			while(true)
			{
				System.out.print("\n\t\t\tEnter Product Price : ");
				p[i]=s.nextFloat();
				System.out.print("\n\t\t\tEnter Product Quantity : ");
				q[i]=s.nextInt();
				try
				{
				if(p[i] < 0 || q[i]<=0)
				{
					throw new ImproperDataException("ImproperDataException");
				}
				else	 break;
				}
				catch(ImproperDataException w)
				{
					new Cls();
					System.out.print("\n\t<-------------SHOPPING MANAGEMENT SYSTEM------------->\n");
					System.out.print("\n\t|\t             Grocery            \t\t     |\n");
					System.out.print("\n\t<---------------------------------------------------->\n");
					System.out.println("\n\t\t   <<<-   ImproperDataException   ->>>");
				}
			}
		}
	}
	public void add()
	{
		new Cls();
		System.out.println("\n\t<-------------SHOPPING MANAGEMENT SYSTEM------------->\n");
		System.out.print("\n\t|\t             Grocery            \t\t     |\n");
		System.out.print("\n\t<---------------------------------------------------->\n");
		System.out.print("\n\t\t\tWhat do you want to add :\n\t\t\t1.No. of Product \n\t\t\t2.Quantity of Existing Products\n\t\t\t\t");
		int a=s.nextInt();
		switch(a)
		{
			case 1:
			{
				addpro();
				break;
			}
			case 2:
			{
				addquan();
				break;
			}
			default : 
			{
				System.out.println("Enter valid Number");
			}
		}
	}
	public void addpro()
	{
		new Cls();
		System.out.print("\n\t<-------------SHOPPING MANAGEMENT SYSTEM------------->\n");
		System.out.print("\n\t|\t             Grocery            \t\t     |\n");
		System.out.print("\n\t<---------------------------------------------------->\n");
		System.out.print("\n\t\t   Enter Number of items to input: ");
		int m= s.nextInt();
		n=m+n;
		String s1[]=new String[n];
		int q1[]=new int[n];
		float p1[]=new float[n];
		for(int i=0;i<n-m;i++)
		{
			s1[i]=st[i];
			q1[i]=q[i];
			p1[i]=p[i];
		}
		for(i=n-m;i<n;i++)
		{
			System.out.print("\n\t\t    Please enter the Product Name : ");
			s1[i]=s.next();
			while(true)
			{
				System.out.print("\n\t\t\tEnter Product Price : ");
				p1[i]=s.nextFloat();
				System.out.print("\n\t\t\tEnter Product Quantity : ");
				q1[i]=s.nextInt();
				try
				{
				if(p1[i] < 0 || q1[i]<=0)
				{
					throw new ImproperDataException("ImproperDataException");
				}
				else	 break;
				}
				catch(ImproperDataException w)
				{
					new Cls();
					System.out.print("\n\t<-------------SHOPPING MANAGEMENT SYSTEM------------->\n");
					System.out.print("\n\t|\t             Grocery            \t\t     |\n");
					System.out.print("\n\t<---------------------------------------------------->\n");
					System.out.println("\n\t\t   <<<-   ImproperDataException   ->>>");
				}
			}
		}
		st=s1;
		p=p1;
		q=q1;
	}
	public void addquan()
	{
		int k;
		new Cls();
		System.out.print("\n\t<-------------SHOPPING MANAGEMENT SYSTEM------------->\n");
		System.out.print("\n\t|\t             Grocery            \t\t     |\n");
		System.out.print("\n\t<---------------------------------------------------->\n");
		//System.out.print("\n\tPlease Enter the Serial number you want to update");
		for(k=0;k<st.length;k++)
		{
			System.out.println("\n\n\t\t\t"+(k+1)+" . "+st[k]+"  "+q[k]);
		}
		System.out.print("\t\t\t   ");
		//int a=s.nextInt();
		//System.out.print("\n\n\tPlease Enter the Quantity of the selected product");
		while(true)
		{
			System.out.print("\n\tPlease Enter the Serial number you want to update : ");
			int a=s.nextInt();
			System.out.print("\n\n\tPlease Enter the Quantity of the selected product : ");
			int r=s.nextInt();
			try
			{
				if(r<=0)
				{
					int l=q[a-1];
					throw new ImproperDataException("ImproperDataException");
				}
				else
				{q[a-1]=q[a-1]+r;	
				 break;
				}
			}
			catch(ImproperDataException w)
			{
				new Cls();
					System.out.print("\n\t<-------------SHOPPING MANAGEMENT SYSTEM------------->\n");
					System.out.print("\n\t|\t             Grocery            \t\t     |\n");
					System.out.print("\n\t<---------------------------------------------------->\n");
					System.out.println("\n\t\t   <<<-   ImproperDataException   ->>>");
			}
		}
		
	}
	public void display()
{
	new Cls();
	System.out.print("\n\t<-------------SHOPPING MANAGEMENT SYSTEM------------->\n");
	System.out.print("\n\t|\t              Grocery            \t\t     |\n");
	System.out.print("\n\t<---------------------------------------------------->\n");
	System.out.println("\n\n\t\t\t\tMENU");
	System.out.println("\n\t\tPLEASE SELECT AND ENTER QUANTITY");
	System.out.println("\n\t<--Sr No.--><--Product--><--Price--><--Quantity-->\n");
	for(int j=0;j<n;j++)
  	{
  		System.out.println("\t"+"     "+(j+1)+".  \t"+st[j]+"\t    "+p[j]+"\t  "+q[j]);
  	}
}
}
