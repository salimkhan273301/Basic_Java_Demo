package com.filehandling.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		//ArrayList<Character> str = new ArrayList<>();
		ArrayList<String> str = new ArrayList<>();
		File file = new File("C:\\\\Users\\\\ulla ulla\\\\Desktop\\\\File\\\\Salim.txt");
		if (file.createNewFile())
			System.out.println("File Created Successfully file name is " + file.getName());
		else
			System.out.println("File Already Exist");

		FileWriter fw = new FileWriter(file);
		for (int i = 0; i <= 100; i++) {
			fw.write("i Love you Ajadi");
			fw.write("\n");
		}
		fw.close();

		//FileReader fr = new FileReader(file);
		//int i = 0;
		//while ((i = fr.read()) != -1) {
			//System.out.print((char) i);
			//str.add((char)i);
		//}
		
		BufferedReader br=new BufferedReader(new FileReader("C:\\\\\\\\Users\\\\\\\\ulla ulla\\\\\\\\Desktop\\\\\\\\File\\\\\\\\Salim.txt"));
		String s=null;
		while((s=br.readLine())!=null) {
			//System.out.print(s);
			str.add(s);
		}
		
		System.out.println(str.toString());

	}

}
