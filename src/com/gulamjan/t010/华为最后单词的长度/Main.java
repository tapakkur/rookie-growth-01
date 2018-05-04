package com.gulamjan.t010.华为最后单词的长度;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string = null;
		while((string = br.readLine()) != null){
			System.out.println(lastWordLength(string));
		}
	}
	public static int lastWordLength(String string) {
		String array[] = string.split(" ");
		int len = 0;
		String lastsString = array[array.length-1];
		len = lastsString.length();
		return len;
	}
}
