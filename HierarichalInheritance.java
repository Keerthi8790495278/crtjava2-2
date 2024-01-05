class First
{void m1(){
	System.out.println("method 1");

}
}
class Second extends First
{
	void m2()
		{
	System.out.println("method 2");

}

}
class Third extends First
{
	void m3()
		{
	System.out.println("method 3");

}
}
class HierarichalInheritance	
{
	public static void main(String args[])
	{Third s1=new Third();
	s1.m1();
	//s1.m2();
	s1.m3();
		Second s2=new Second();
		s2.m1();
		s2.m2();
		//s3.m3();
}}