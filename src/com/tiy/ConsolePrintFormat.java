package com.tiy;

/**
 * Created by josh on 3/1/17.
 */
public class ConsolePrintFormat {

	public void printConsole(String string){
		for(int i = 0; i < string.length(); i++){
			System.out.print(string.charAt(i));
			try{
				Thread.sleep(50);
			}catch (Exception e){
				e.printStackTrace();
			}
		}

	}
}
