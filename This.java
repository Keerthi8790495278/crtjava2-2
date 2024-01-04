class This 
{int admno;
String name;
This (int admno,String name)
	{this.admno=admno;
this.name=name;

}
void show(){
System.out.println(admno+" "+name);}

	public static void main(String[] args) 
	{
        This  s1=new This(9,"uuu");
		
		This  s2=new This (66,"rrr");
	s1.show();
	s2.show();
	}
		
}
