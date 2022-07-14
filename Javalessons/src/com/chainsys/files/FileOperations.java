package com.chainsys.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileOperations {
public static void main(String[] args) throws Exception{
	//createNewFile();
	//renamefile();
	//appendDataToFile();
	//modifyDataInFile(); 
	//readFile();
	//deleteFile();
	//copyFile();
	moveFile();
	
}
public static void createNewFile() {
	try {
		File f1 = new File("d:\\temp\\moon.txt");
		if(f1.createNewFile()) {
			System.out.println("File created:"+f1.getName());
		}else {
			System.out.println("File already exists.");
		}
	}catch(IOException e) {
		System.out.println("An error occured in creating file");
		e.printStackTrace();
	}
}		
public static void  renamefile() {
	
	File f1 = new File("d:\\temp\\moon.txt ");
	File f2 =new File("d:\\temp\\wonder.txt");
	if(f1.renameTo(f2)) {
		System.out.println("f1 file is renamed to f2 file");
	}else {
		System.out.println("f1 file does not renamed");
	}
}
public static void appendDataToFile() {
	try
	{
	    String f= "d:\\temp\\wonder.txt";
	    FileWriter obj = new FileWriter(f,true);
	    obj.write("How was the day?");
	    obj.close();
	    System.out.println("Data is successfully appended!!");
	}
	catch(IOException e)
	{
	    System.out.println("IOException: " +e.getMessage());
	}
}
public static void modifyDataInFile() throws Exception
{
    
    FileOutputStream as = new FileOutputStream("d:\\temp\\wonder.txt");
    
    String a = "What a wonderful World";
    byte[] b = a.getBytes();
    as.write(b);
    as.close();
    System.out.println("Modification is done!!!");
    
    FileInputStream a1 = new FileInputStream("d:\\temp\\wonder.txt");
    int i;
    while((i=a1.read())!=-1)
    {
    System.out.print((char)i);
    }
    a1.close();
} 
public static void readFile() {
	int c;
    FileInputStream fin=null; 
    String fname="d:\\temp\\Beast.txt"; 
    try {
    fin = new FileInputStream (fname);
    }
    catch (FileNotFoundException e)
    {
    System.out.println("File Not Found");
    return;
    }
    // checking if data isAvailable
   try
    {
    do {
    c = fin.read();
    if (c != -1) System.out.print((char) c);
    } while (c != -1);
    } catch (IOException e) {
    System.out.println("Error in read "+e.getMessage());
    }
    finally
    {
    try
    {
    if (null!=fin) fin.close();
    } catch (IOException el)
    {
    System.out.println (el.getMessage());
    }
}
}
public static void deleteFile() {
	File f1 = new File("d:\\temp\\story.txt");
	if(f1.delete())
	{
		System.out.println(f1 + " got deleted");
	}else {
		System.out.println("File is not deleted");
	}
}
public static void copyFile() {
	File f1 = new File("d:\\temp\\Beast.txt");
	File f2 = new File("d:\\temp\\world.txt");
	try {
	Files.copy(f1.toPath(),f2.toPath());
	System.out.println("f1 is successfully copied");
		
	}catch(IOException e) {
		e.printStackTrace();
	}
}
public static void moveFile() {
	File f1 = new File("d:\\temp\\Beast.txt");
	File f2 = new File("d:\\temp\\ooty\\Beast.txt");
	try {
		Files.copy(f1.toPath(),f2.toPath(),StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File movied successfully!!");
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
		