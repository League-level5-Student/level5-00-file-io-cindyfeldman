package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileEncryptor {
	String reverse;
	// Create a program that takes a message from the user.
	// Use the methods in the String and Character classes to save
	// an encrypted form of the message to a file
	
void  encrypt() {
		try {
	String message = JOptionPane.showInputDialog("type in a message");
	reverse = new StringBuffer(message).reverse().toString();
	System.out.println(reverse);
FileWriter fw = new FileWriter("src/_02_File_Encrypt_Decrypt/text.txt",true);
fw.write(reverse);
fw.close();

		}
		catch(IOException e ) {
			e.printStackTrace();
		}	
		}
}
