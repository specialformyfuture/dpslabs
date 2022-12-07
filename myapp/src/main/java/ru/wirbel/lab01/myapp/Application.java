package ru.wirbel.lab01.myapp;

import ru.wirbel.lab01.mylib.App;

public class Application {
	
	public static void main(String[] args){
		//setConsoleEncoding();
		String key1 = "en"; //args[0]; //language
		String key2 = "of";//args[1]; //of/unof
		try{
			
			System.out.println(new App(key1,key2).stringReturner());
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println();
	}
	
	public static final String DEFAULT_CONSOLE_ENCODING = "UTF-8";
	public static final String CONSOLE_ENCODING_PROPERTY = "consoleEncoding";
	
	/* private static void setConsoleEncoding(){
		String consoleEncoding = System.getProperty(CONSOLE_ENCODING_PROPERTY,DEFAULT_CONSOLE_ENCODING);
		
		try{
			System.setOut(new PrintStream(System.out,true,consoleEncoding));
		} catch (UnsupportedEncodingException ex){
			System.err.println("Unsupported encoding set for this console: " + consoleEncoding);
		}
	} */
}