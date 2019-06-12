package removeA;

public class RemoveA {
	
	public static String removingFirst2A(String str)
	{
		
		if(str.charAt(0)=='A'||str.charAt(0)=='a')
		{
			if(str.charAt(1)=='A'||str.charAt(1)=='a')
				return str=str.substring(2);
			else
				return str=str.substring(1);
		}
		
		else if(str.charAt(1)=='A'||str.charAt(1)=='a')
			return str= str.charAt(0)+str.substring(2);
		else
			return str;
		
			
	}

}
