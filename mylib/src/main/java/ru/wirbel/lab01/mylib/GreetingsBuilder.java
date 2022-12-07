package ru.wirbel.lab01.mylib;

import java.util.*;
import java.lang.*;
import java.io.*;


public class GreetingsBuilder{
	
	String key1 = "en";
	String key2 = "of";
	
	String klu41;
	String klu42;
	
	public GreetingsBuilder(String klu41, String klu42){
		this.klu41 = klu41;
		this.klu42 = klu42;
	}
	
	public String GreetingsMethod() throws FileNotFoundException, IOException{
	File file;
		if(klu41 == key1){ //lang == en
			file = new File("C:/Users/viro.asus01/Desktop/worklr2/projects/lab01/mylib/src/main/resources/messages_en.properties");
			FileInputStream fs = new FileInputStream(file);
			BufferedReader br = new BufferedReader(new InputStreamReader(fs));
			
			//String key = br.readLine();	

			return greetingsConstructor(br);
			
		} else { //ru
			file = new File("C:/Users/viro.asus01/Desktop/worklr2/projects/lab01/mylib/src/main/resources/messages_ru.properties");
			FileInputStream fs = new FileInputStream(file);
			BufferedReader br = new BufferedReader(new InputStreamReader(fs));
			
			//String key = br.readLine();
			
			return greetingsConstructor(br);
		}
	}
	
	private String greetingsConstructor(BufferedReader br) throws IOException{
		String key = br.readLine();
		if(klu42 == key2){ //of
				while(!(key.equals("--- of ---"))){
					key = br.readLine();
					break;
				}
				String res = br.readLine();
				return res;
				
			} else { //unof
				while(!(key.equals("--- unof ---"))){
					key = br.readLine();
				}
				String res = br.readLine();
				return res;
			} 
	}
	
}
