class Constructor1 
{
void show()
	{
System.out.println("method");
}
Constructor1(){
System.out.println("constructor");}

	public static void main(String[] args) 
	{
        Constructor1  s1=new Constructor1();
		
		Constructor1  s2=new Constructor1 ();
	s1.show();
	
	}
		
}
