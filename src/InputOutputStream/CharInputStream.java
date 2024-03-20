package InputOutputStream;

import java.io.FileReader;
import java.io.FileWriter;

public class CharInputStream {
	void fileOperation1() throws Exception
	{
		System.out.println("Reading the data");
		FileReader fr=new FileReader("D:\\Program\\OutputStream.txt");
		System.out.println("Connection Created");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println();
		System.out.println("Data is Retrived");
		fr.close();
		System.out.println("=======================================");
	}
	void fileOperation2() throws Exception
	{
		System.out.println("writing Data ");
		FileWriter fw=new FileWriter("D:\\Program\\file4.txt",true);
		String data="Today is Tuesday";
		fw.write(data);
		System.out.println("data Entered");
		fw.close();
	}
public static void main(String[] args) throws Exception
{
	CharInputStream obj=new CharInputStream();
	obj.fileOperation1();
	obj.fileOperation2();
}
}
