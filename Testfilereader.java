import java.io.*;
import java.util.*;
class Testfilereader
{
	public static void main(String[] args) throws Exception
	{FileReader f1=new FileReader("buffer.txt");
	BufferedReader b1=new BufferedReader(f1);
	int ch;
	ch=f1.read();
	while(ch!=-1){
		System.out.println((char)ch);
		ch=f1.read();
	}
		f1.close();
	}
}
