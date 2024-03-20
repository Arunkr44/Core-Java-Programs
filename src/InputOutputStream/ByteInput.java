package InputOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteInput {
	void fileoperation1() throws Exception
	{
		System.out.println("implementing Byte Streams ");
		FileInputStream fis=new FileInputStream("D:\\Program\\arun.txt");
		System.out.println("Connection Created ");
		/*
		int i=fis.read();
		int i1=fis.read();
		int i2=fis.read();
		System.out.println((char)i);
		System.out.println((char)i1);
		System.out.println((char)i2);
		*/
		
		int j;
		while((j=fis.read())!=-1)
		{
			System.out.print((char)j);
		}
		System.out.println();
		
		System.out.println("Data retrieved");
		fis.close();
	}
	void fileOperation2() 
	{
		System.out.println("=======================");
		System.out.println("\nWriting a data into file");
		try {
		FileOutputStream fos=new FileOutputStream("D:\\Program\\OutputStream.txt",true);
//		String data="Java is Awesome";
		String data=" ,so i love it";
		byte arr[]=data.getBytes();
		fos.write(arr);
		System.out.println("Data is written");
		fos.close();
		}
		catch(Exception e) {
			
		}
		System.out.println("Connection is created ");	
	}
	void fileOperation3() throws Exception
	{
		System.out.println("Copying the data ");
		FileInputStream fis=new FileInputStream("D:\\Program\\OutputStream.txt");
		FileOutputStream fos=new FileOutputStream("D:\\Program\\OutputStream1.txt");
		System.out.println("Connection Created ");
		int i;
		while((i=fis.read())!=-1)
		{
			fos.write(i);
		}
		System.out.println("Data is Copied");
		fis.close();
		fos.close();
	}
public static void main(String[] args) throws Exception 
 {
	ByteInput obj=new ByteInput();
//	obj.fileoperation1();
//	obj.fileOperation2();
	obj.fileOperation3();
}
}
