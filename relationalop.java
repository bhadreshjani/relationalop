import java.util.Scanner;

public class relationalop {
	public static void main(String args[])
	{
int num1,num2,num3;
Scanner sc=new Scanner(System.in);
System.out.print("Eneter number X:");
num1 = sc.nextInt();
System.out.print("Eneter number Y:");
num2=sc.nextInt();
System.out.print("Eneter number Z:");
num3=sc.nextInt();
if (num1<num2)
{
	if (num2>num3)
	{
		System.out.print(num2 + " - Y is the the highest");
	}
	else
	{
		System.out.print(num3 + " - Z is the the highest");
	}
}
else if(num1>num3)
{
	System.out.print(num1 + " - X is the the highest");
}
else
{
	System.out.print(num3 + " - Z is the the highest");
}

/* the simple prog could be like this also
if (num1>num2 && num1>num3)
	System.out.print(num1 + "X is the the highest");
else if (num2>num1 && num2>num3)
	System.out.print(num2 + "Y is the the highest");
else if(num3>num1 && num3>num2)
	System.out.print(num3 + "Z is the the highest");

	*/
	
	}
	}
