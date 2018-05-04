package com.gulamjan.t014.»ªÎª×Ö·û´®·Ö¸î;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String string = in.next();
			divice(string);
		}
		in.close();
	}
	public static void divice(String string ) {
		if (string.length() % 8 != 0) {
			string = string + "00000000";
		}
		while(string.length() >= 8){
			System.out.println(string.substring(0, 8));
			string = string.substring(8);
		}
	}
}
