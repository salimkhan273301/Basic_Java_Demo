package com.filehandling.filehandling;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.TreeSet;

public class FileHandlingDemo {

	public static void main(String[] args) throws Exception {
		FileWriter file2 = new FileWriter("added.csv");//for file_two data.....
		FileWriter file1 = new FileWriter("removed.csv");// for file_one data...
	     
	      
		HashMap<String, String> map2= new HashMap<String, String>();
		HashMap<String, String> map1= new HashMap<String, String>();
		 BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ulla ulla\\Desktop\\FileHandlingDemo\\file_two.csv"));
         BufferedReader r = new BufferedReader(new FileReader( "C:\\Users\\ulla ulla\\Desktop\\FileHandlingDemo\\file_one.csv"));
		String s1=null;
		String s2=null;
		ArrayList<String> list=new ArrayList<String>();
		ArrayList<String> list1=new ArrayList<String>();
		TreeSet<String> set=new TreeSet<String>();
		
		while ((s1=br.readLine())!=null)    
		{  
		 
			 
			String x=s1.strip();
			list.add(x); 
			
		  
		} 
		while ((s2=r.readLine())!=null)    
		{  
		 
			String x=s2.strip();
			list1.add(x);
			
		  
		} 
		
		for(int i=0; i<list.size(); i++) {
			String k=list.get(i).substring(0,list.get(i).length()-4);
			String v=list.get(i).substring(list.get(i).length()-4,list.get(i).length());
			String k1=list1.get(i).substring(0,list1.get(i).length()-4);
			String v1=list1.get(i).substring(list1.get(i).length()-4,list1.get(i).length());
			//System.out.println(k+"->"+v);
			map2.put(k, v);
			map1.put(k1, v1);
		}
		boolean b=list.equals(list1);//here i cheked both file  dose note hava common data so i stored the data of file_two in map2 and file_one data in map1
		System.out.println(b);
		System.out.println(list.size()+","+list1.size());// both have same size
		
		
		
		
		
		// we can print map1 data in key value form,
		map1.forEach((key,value)->{
			System.out.println(key+"-"+value);
		});
		
		
		
		// we can print map2 data in key value form,
				map2.forEach((key,value)->{
					System.out.println(key+"-"+value);
				});
				
				
				
	// here i am writing the data of list in file2 and data of list1 in file1 objects...			
				
		 String listWord; 
		 String listWord1; 
         for (int i = 0; i< list.size(); i++)
        {
              listWord = list.get(i);
             file2.write(listWord);
             file2.write("\n");
             
             listWord1=list1.get(i);
             file1.write(listWord1);
             file1.write("\n");
        }
        
         
         /*
          ->if i need to compare data of list with list1 to check equal content then i can 
         do it and store the uncommon data in map2 or map1 and from there to added.csv and removed.csv
         
         for(int i=0; i<list.size(); i++){
         for(int j=0; j<list.size(); j++){
         if(list.get(i).equals(list1.get(j))
         continue;
         else
         list3.add(list.get(i));
         }}
         
         and the data of this list3 three slice with the help of 
         substring in key value pair and store them in map
         and data of map into added or removed.csv according to condition
         
         
        -> but i found both of them unequal so direct i stored list and list1 data in 
         mentioned file;
         
         
         boolean b=list.equals(list1);//here i cheked both file  dose note hava common data so i stored the data of file_two in map2 and file_one data in map1
		System.out.println(b);
		
		for(int i=0; i<list.size(); i++){
         for(int j=0; j<list.size(); j++){
         if(list.get(i).equals(list1.get(j))
         list3.add(list.get(i));
         else
         continue;
         }}
		
         
         */
         
         // respected sir may be i could not explain or write the code as you expect ,i have not worked in past with file so i might done mistake, i will work this week part .
         
         
         
         //3. file_output_modified.csv: It will have data records of file_two.csv which exist in  file_one.csv but have different values. 

/*
 
 i will create a list and i will store the equal data in the list and ignore the diffrent data
 
 
 
 */
         
	}

}
