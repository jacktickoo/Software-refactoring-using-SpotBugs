package oose.w2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * 
 * @author <Jack> <Tickoo> , <2397224T>
 *
 */
public class Util {
	/**
	 * A custom reader that reads first n characters from a file and swaps 
	 * every even char with a blank then prints the output. For a file with
	 * less than n chars, customCharReader does not care about how many 
	 * characters were actually read by the BufferedReader.
	 * @param file
	 * @param n
	 */
	public void customCharReader(File file, int n) {
		char[] buffer = new char[n];

		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));			
			try {
				reader.read(buffer,0,n);
				}
			finally {
				reader.close();
				}
		}
		catch(RuntimeException e) {
			throw e;
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
				
		for(int i=1;i<=buffer.length-1;i++) {
			int swap = i % 2;
			if (Integer.toString(swap).equals(Integer.toString(1))) { 
				buffer[i] = ' ';
			}
		}
		System.out.print(buffer);
	}
}
