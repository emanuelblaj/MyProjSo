package com.univjava.streetpushbackinstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PushbackInputStream;

// need push.dat with name of street

public class PushBackInStre {
	public static void main(String[] args) throws IOException {
		String prefix = "Str. ", nume;
		byte[] temp = new byte[10];
		String s_temp = " ";
		int poz, nr, dif;
		
		
		PushbackInputStream p = new PushbackInputStream(new FileInputStream("push.dat"), 10);
		nume = " ";
		while(p.available() > 0) {
			nr = p.read(temp);
			s_temp = new String(temp);
			s_temp = s_temp.substring(0, nr);
			nume += s_temp;
			poz = nume.indexOf(prefix);
			
			if(poz >= 0) {
				dif = nume.length()-poz-5;
				System.out.println("Strada noua: Str. " + 
									nume.substring(0, poz));
				s_temp = s_temp.substring(s_temp.length()-dif);
				nume = " ";
				if(dif > 0) {
					p.unread(temp, nr-dif, dif);
				}
			}
		}
		System.out.println("Strada noua: Str. " + s_temp );
	}
}
