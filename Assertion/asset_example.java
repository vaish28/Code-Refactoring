package Assertion;

public class asset_example 
{
	public static void main(String[] args) 
	{
		/*
		int x= 8; //it will print nothing since it will be disabled due to assert
		assert(x==8);
		if(x==8)
		{
			System.out.println(x);
		}*/
		
		int value =11;
		assert value>=10 : "greater than ten";
		
	}

}
