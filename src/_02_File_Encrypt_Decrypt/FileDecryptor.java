package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDecryptor {
	// Create a program that opens the file created by FileEncryptor and display
	// the decrypted message to the user in a JOptionPane.
	static String decrypt;
	public static void main(String[] args) {
		try {
			FileEncryptor fe = new FileEncryptor();
			fe.encrypt();
			BufferedReader br = new BufferedReader(new FileReader("src/_02_File_Encrypt_Decrypt/text.txt"));
			String line = br.readLine();
			line = new StringBuffer(line).reverse().toString();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
		}
		catch(FileNotFoundException e1) {
			e1.printStackTrace();
		}
		catch(IOException e2){
			e2.printStackTrace();
		}
	}
}
