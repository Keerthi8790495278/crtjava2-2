class Staticmethod2 
{
    int a=19;
    static int b=20;
void m1()
	{
System.out.println(a+" "+b);
}
static void m2(){
System.out.println(b);}

	public static void main(String[] args) 
	{
	   
        Staticmethod2  s1=new Staticmethod2();
		
		Staticmethod2  s2=new Staticmethod2 ();
	s1.m1();
	s1.m2();
	
	}
		
}
