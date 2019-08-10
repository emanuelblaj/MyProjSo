package com.youtubeex;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HeronFormulaMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat decForm = new DecimalFormat("0.###");
		
		int a, b, c; // sides
		double s; // half perimeter
		double area;
		
		System.out.println("Please enter the three sides of the triangle: ");
		System.out.print("a = " );
		a = scan.nextInt();
		System.out.print("b = " );
		b = scan.nextInt();
		System.out.print("c = " );
		c = scan.nextInt();
		scan.close();
		
		s = (a + b + c) / 2.00;
		
		area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
		System.out.println("The area of the triangle using Heron's formula is: " + decForm.format(area));
		
	}

}
