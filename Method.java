class class Method 
{int a,b;
void get()
	{a=10;
b=20;

}
void show(){
System.out.println(a+" "+b);}

	public static void main(String[] args) 
	{
        Method s1=new Method();
		
		Method s2=new Method();
		s1.get();
		s2.get();
		s1.show();
		s2.show();
	

	}
}
 
