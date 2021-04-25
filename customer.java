package customer;

import java.util.*;
import java.lang.*;
import java.io.*;
import item.*;

class QuantityOutOfLimitExcp extends Exception
{
	QuantityOutOfLimitExcp(String s)
	{
		super(s);
	}
}
public class customer 
{
	int ch,a,b,i=0;
	static float bill=0;
	int u=1;
	Scanner s = new Scanner(System.in);
	public void choice() throws Exception
	{
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:/Users/Shivashish/Desktop/JAVA/pro/BILL.txt"));
		BufferedWriter bf=new BufferedWriter(new FileWriter("C:/Users/Shivashish/Desktop/JAVA/pro/BILL.txt",true));
		if((u++)==1)
		{
			bf.write("Sr No.\tProduct\tPrice\tQuantity\tFinal Price");
			bf.newLine();
		}
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
					inputkid kc = new inputkid();
					{
						kc.display();
						System.out.print("\n\t\tPress 1 to Order or Press any : ");
						int y=s.nextInt();
						if(y==1)
						{
							System.out.print("\n\t\t\tEnter Serial Number : ");
							a=s.nextInt();		//Serial Number
							System.out.print("\n\t\t\tEnter Quantity : ");
							b=s.nextInt();
							if(b>kc.q[a-1])
							{
								throw new QuantityOutOfLimitExcp("");
							}
							else
							{
								new Cls();
								System.out.print("\n\t<-------------SHOPPING MANAGEMENT SYSTEM------------->\n");
								System.out.print("\n\t|\t             Kids            \t\t     |\n");
								System.out.print("\n\t<---------------------------------------------------->\n");
								System.out.println("\n\t\t\tOrdered Succesfully");
								kc.q[a-1]=kc.q[a-1]-b;
								bill=bill+(b*kc.p[a-1]);
								bf.newLine();
								bf.write((++i)+"\t"+kc.st[a-1]+"\t"+kc.p[a-1]+"\t"+b+"\t"+(b*kc.p[a-1])+"\n");
							}
						}
					}
					break;
				}
				case 2:
				{
					inputgro gc = new inputgro();
					{
						gc.display();
						System.out.print("\n\t\tPress 1 to Order or Press any : ");
						int y=s.nextInt();
						if(y==1)
						{
							System.out.print("\n\t\t\tEnter Serial Number : ");
							a=s.nextInt();		//Serial Number
							System.out.print("\n\t\t\tEnter Quantity : ");
							b=s.nextInt();
							if(b>gc.q[a-1])
							{
								throw new QuantityOutOfLimitExcp("");
							}
							else
							{
								new Cls();
								System.out.print("\n\t<-------------SHOPPING MANAGEMENT SYSTEM------------->\n");
								System.out.print("\n\t|\t             Grocery            \t\t     |\n");
								System.out.print("\n\t<---------------------------------------------------->\n");
								System.out.println("\n\t\t\tOrdered Succesfully");
								gc.q[a-1]=gc.q[a-1]-b;
								bill=bill+(b*gc.p[a-1]);
								bf.newLine();
								bf.write((++i)+"\t"+gc.st[a-1]+"\t"+gc.p[a-1]+"\t"+b+"\t"+(b*gc.p[a-1])+"\n");
							}
						}
					}
					break;
				}
				case 3:
				{
					inputadu ac = new inputadu();
					{
						ac.display();
						System.out.print("\n\t\tPress 1 to Order or Press any : ");
						int y=s.nextInt();
						if(y==1)
						{
							System.out.print("\n\t\t\tEnter Serial Number : ");
							a=s.nextInt();		//Serial Number
							System.out.print("\n\t\t\tEnter Quantity : ");
							b=s.nextInt();
							if(b>ac.q[a-1])
							{
								throw new QuantityOutOfLimitExcp("");
							}
							else
							{
								new Cls();
								System.out.print("\n\t<-------------SHOPPING MANAGEMENT SYSTEM------------->\n");
								System.out.print("\n\t|\t             Adults            \t\t     |\n");
								System.out.print("\n\t<---------------------------------------------------->\n");
								System.out.print("\n\t\t\tOrdered Succesfully");
								ac.q[a-1]=ac.q[a-1]-b;
								bill=bill+(b*ac.p[a-1]);
								bf.newLine();
								bf.write((++i)+"\t"+ac.st[a-1]+"\t"+ac.p[a-1]+"\t"+b+"\t"+(b*ac.p[a-1])+"\n");
							}
						}
					}break;
				}
				case 4:
				{
					inputfur fc = new inputfur();
					{
						fc.display();
						System.out.print("\n\t\tPress 1 to Order or Press any : ");
						int y=s.nextInt();
						if(y==1)
						{
							System.out.print("\n\t\t\tEnter Serial Number : ");
							a=s.nextInt();		//Serial Number
							System.out.print("\n\t\t\tEnter Quantity : ");
							b=s.nextInt();
							if(b>fc.q[a-1])
							{
								throw new QuantityOutOfLimitExcp("");
							}
							else
							{
								new Cls();
								System.out.print("\n\t<-------------SHOPPING MANAGEMENT SYSTEM------------->\n");
								System.out.print("\n\t|\t             Furniture            \t\t     |\n");
								System.out.print("\n\t<---------------------------------------------------->\n");
								System.out.println("\n\t\t\tOrdered Succesfully");
								fc.q[a-1]=fc.q[a-1]-b;
								bill=bill+(b*fc.p[a-1]);
								bf.newLine();
								bf.write((++i)+"\t"+fc.st[a-1]+"\t"+fc.p[a-1]+"\t"+b+"\t"+(b*fc.p[a-1])+"\n");
							}
						}
					}break;
				}
				case 5:
				{
					bf.newLine();
					bf.newLine();
					bf.write("TOTAL BILL IS "+bill);
					bf.newLine();
					bf.newLine();
					bf.write("Thanks for Visiting !!! Happy Shopping");
					bf.newLine();
					bf.newLine();
					bill=0;
					bf.close();
					break;
				}
				default:
				{
					System.out.println("Please Enter Valid Number");
				}
			}
		}while(ch!=5);
	}
	public void viewbill() throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("BILL.txt"));
		String s;
		new Cls();
		do
		{
			s=br.readLine();
			System.out.println("\n\t\t"+s);
		}while(!(s.equals("Thanks for Visiting !!! Happy Shopping")));
		br.close();
	}
}