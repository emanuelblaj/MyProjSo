package com.youtubeex;

import java.util.Random;

public class PhoneNoMain {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int first = rand.nextInt(8);
		int second = rand.nextInt(8);
		int third = rand.nextInt(8);
		int middle = rand.nextInt(742);
		int last = rand.nextInt(9999);
		
		String middleString;
		String lastString;
		
		middleString = Integer.toString(middle);
		lastString = Integer.toString(last);
		
		while(middleString.length() < 3) {
			middleString = "0" + middleString;
			
		}
		
		while(lastString.length() < 4) {
			lastString = "0" + lastString;
		}
		
		System.out.println(Integer.toString(first) + Integer.toString(second) + Integer.toString(third) + "-" + middleString + "-" + lastString);
	}

}
