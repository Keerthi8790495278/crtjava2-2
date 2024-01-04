class Constructor 
{int admno;
String name;
Constructor (int x,String y)
	{admno=x;
name=y;

}
void show(){
System.out.println(admno+" "+name);}

	public static void main(String[] args) 
	{
        Constructor  s1=new Constructor(9,"uuu");
		
		Constructor  s2=new Constructor (66,"rrr");
	s1.show();
	s2.show();
	}
		
}
