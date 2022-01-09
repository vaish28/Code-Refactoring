package factory_method;
import java.lang.*;
import java.util.*;
import java.io.*;


public class factory_example 
{
	private static int type;
	public static final int Engineer = 0;
	public static final int doctor = 1;
	public static final int salesperson = 2;
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 0 for engineer 1 for doctor and 2 for salesperson ");
		type = Integer.parseInt(br.readLine());
		create(type);
	}
	
	public static factory_example create(int type)
	{
		switch(type)
		{
			case Engineer:
				return new engineer();
			case doctor:
				return new doctor();
			case salesperson:
				return new salesperson();
			default:
				System.out.println("this is default chosen");
				break;
		}
		return null;
		
	}
	
	
	
	

}


class engineer extends factory_example
{
	engineer()
	{
		System.out.println("Hello I am engineer");
	}
}


class doctor extends factory_example
{
	doctor()
	{
		System.out.println("Hello I am doctor");
	}
	
}


class salesperson extends factory_example
{
	salesperson()
	{
		System.out.println("Hello I am a salesperson");
	}
}


/*
Enter 0 for engineer 1 for doctor and 2 for salesperson 
0
Hello I am engineer


Enter 0 for engineer 1 for doctor and 2 for salesperson 
1
Hello I am doctor

Enter 0 for engineer 1 for doctor and 2 for salesperson 
2
Hello I am a salesperson




*/