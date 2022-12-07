package ru.wirbel.lab01.mylib;
import java.util.*;
import java.lang.*;
import java.io.*;
/**
 * Hello world!
 *
 */
public class App
{
	
	static String key1 = null;
	static String key2 = null;
	
	public App(String key1, String key2){
		this.key1 = key1;
		this.key2 = key2;
		//System.out.println(new GreetingsBuilder(key1,key2).GreetingsMethod());
	}
	
	
	public static void main(String[] args) {
	}
	
	public static String stringReturner() throws FileNotFoundException, IOException{
		return new GreetingsBuilder(key1,key2).GreetingsMethod();
	}
}
