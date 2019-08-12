package com.tictactoe;

import java.util.Scanner;

public class TicTacMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Jucatorul 1: ");
		String player1Name = scanner.nextLine();
		System.out.println("Jucatorul 2: ");
		String player2Name = scanner.nextLine();
		
		System.out.println();
		
		Player player1 = new Player(player1Name, MyTicTacToe.SYMBOL_X);
		Player player2 = new Player(player2Name, MyTicTacToe.SYMBOL_0);
		
		MyTicTacToe myTicTacToe  = new MyTicTacToe(player1, player2);
		myTicTacToe.playGame();
	}

}
