package com.gulamjan.t015.»ªÎª16»¯10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String string  = in.next();
			String snum = string.substring(2, string.length());
			int  number = Integer.parseInt(snum, 16);
			System.out.println(number);
		}
		in.close();
	}

}
