class First
{void m1(){
	System.out.println("method 1");

}
void m2()
{	System.out.println("method 2");

}}
class Second extends First
{
	void m3()
		{
	System.out.println("method 3");

}

}
class Inheritance	
{
	public static void main(String args[])
	{Second s1=new Second();
	s1.m1();
	s1.m2();
	s1.m3();
}}