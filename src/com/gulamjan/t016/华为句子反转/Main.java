package com.gulamjan.t016.华为句子反转;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String string = null;
		while((string = in.readLine()) != null){
			String[] array = string.split(" ");
			String newString = "";
			for (int i = array.length-1; 0 < i; i--) {
				newString +=array[i]+" ";
			}
			System.out.print(newString);
			System.out.println(array[0]);
		}
	}
}
