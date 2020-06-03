package com.revatur.d3act.models;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileBoy {

	private File file = new File("src/resources/MusicianInfo.txt");
	
	public File WriteFile(String content) {
		
		
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter bw = new BufferedWriter(fw);
		
		try {
			bw.write(content);
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return file;
	
	}
	
	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public void ReadFile(File file) {
		
		try {
			FileReader fr = new FileReader(file);
			char[] a = new char[50];
			fr.read(a);
			for(char c : a) {
				System.out.println(c);
				
			fr.close();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
