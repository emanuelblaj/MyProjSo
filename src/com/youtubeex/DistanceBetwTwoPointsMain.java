package com.youtubeex;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DistanceBetwTwoPointsMain{
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat decForm = new DecimalFormat("0.##");
		double x1 = 0;
		double y1 = 0;
		double x2 = 0;
		double y2 = 0;
		double distance = 0;
		
		
		
//		input
		System.out.println("Please enter X1 coordinates: ");
		x1 = scan.nextInt();
		System.out.println("Please enter Y1 coordinates: ");
		y1 = scan.nextInt();
		System.out.println("Please enter X2 coordinates: ");
		x2 = scan.nextInt();
		System.out.println("Please enter Y2 coordinates: ");
		y2 = scan.nextInt();
		
		scan.close();
			
		distance = Math.sqrt(Math.pow(x2-x1, 2) + (Math.pow(y2-y1, 2)));
		
		System.out.println("The distance is " + decForm.format(distance));
	}

}
