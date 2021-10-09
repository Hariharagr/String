class  stringclasssplit
{
	public static void main(String[] args) 
	{
	String s =("java string split demo");
	String[] s1 = s.split("\\s");  // split by space charater
	for(String s2 : s1 )
		{
		System.out.println(s2);
		}
	}
}