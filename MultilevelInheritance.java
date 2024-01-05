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
class Third extends Second
{
	void m4()
		{
	System.out.println("method 4");

}
}
class MultilevelInheritance	
{
	public static void main(String args[])
	{Third s1=new Third();
	s1.m1();
	s1.m2();
	s1.m3();

s1.m4();}}