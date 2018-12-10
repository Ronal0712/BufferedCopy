package com.pccu.bufferedcopy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fileWriter = null;
		FileReader fileReader = null;
		
		BufferedReader bufferedReader = null;
		PrintWriter printWriter = null;
		
		try {
			fileReader = new FileReader("src/buffered/abstract1.txt");
			fileWriter = new FileWriter("src/buffered/clonedabstract1.txt");
			
			bufferedReader = new BufferedReader(fileReader);
			printWriter = new PrintWriter(fileWriter);
			String flag = "";
			while((flag = bufferedReader.readLine()) != null) {
				printWriter.println(flag);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(printWriter != null) {
				printWriter.close();
			}
			if(fileWriter != null) {
				try {
					fileWriter.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			if(bufferedReader != null) {
				try {
					bufferedReader.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			if(fileReader != null) {
				try {
					fileReader.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
