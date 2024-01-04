class Methodargs 
{int a,b;
void get(int x,int y)
	{a=x;
b=y;

}
void show(){
System.out.println(a+" "+b);}

	public static void main(String[] args) 
	{
        Methodargs s1=new Methodargs();
		
		Methodargs s2=new Methodargs();
		s1.get(13,35);
		s2.get(44,33);
		s1.show();
		s2.show();
	

	}
}
