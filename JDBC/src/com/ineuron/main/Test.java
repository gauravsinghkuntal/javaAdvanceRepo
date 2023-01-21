package com.ineuron.main;

import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		
		FileWriter fr= new FileWriter("gfdc.txt");
		fr.write("kjhg");
		fr.close();
	}
}
