package InputOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
public class ClassA {
public static void main(String[] args) throws IOException {
	//file name Data.txt
	File m= new File("D:\\Program\\arunkm.txt");
	String str="This is File";
	
	
	if(m.createNewFile())
	{
		System.out.println("file Successfully Created");
	}
	else {
		System.out.println("File already exists");
	}
	
		
	/*
	if (myFile.exists()) 
	{
	//to print the file name
	System.out.println(myFile.getName() + " exists");
	System.out.println("The file is " + myFile.length() + " bytes long");
	//to check if the file can be read
	     if (myFile.canRead()) {
	System.out.println(" ok to read");
	     }
	else {
	System.out.println(" not ok to read");}
	//to check if the file can be write
	if (myFile.canWrite()) {
	System.out.println(" ok to write");}
	else {
	System.out.println(" not ok to write");}
	//print the file path
	System.out.println("path: " +myFile.getAbsolutePath());
	//print the file name
	System.out.println("File Name: "+ myFile.getName());
	//print the file length
	System.out.println("File Size: "+ myFile.length() + " bytes");
	}
	else
	System.out.println("File does not exist");
	*/
	
}
}
