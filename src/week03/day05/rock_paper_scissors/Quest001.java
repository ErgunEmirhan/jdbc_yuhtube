package week03.day05.rock_paper_scissors;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Quest001 {
	int compWin = 0, userWin = 0;
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Quest001 runner = new Quest001();
		runner.gameInterface();
	}
	
	void gameInterface() {
		
		boolean isRunning = true;
		int userSelection;
		
		do {
			System.out.println("--- Rock Paper Scissors ---");
			System.out.println("1-Rock");
			System.out.println("2-Paper");
			System.out.println("3-Scissors");
			System.out.println("4-Reset Scores");
			System.out.println("0-Exit");
			System.out.print("Your selection: ");
			try {
				userSelection = sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("\nPlease enter a numeric value!");
				continue;
			}
			finally {
				sc.nextLine();
			}
			switch (userSelection) {
				case 1, 2, 3: {
					gameResult(userSelection, computerSelection());
					score();
					break;
				}
				case 4:{
					compWin = 0;
					userWin = 0;
					break;
				}
				case 0: {
					isRunning = false;
					break;
				}
				default:
					System.out.println("Please enter a valid value!");
				
			}
		} while (isRunning);
	}
	
	private void score() {
		System.out.println("user score: " + userWin+ " computer score: "+ compWin);
		System.out.println();
	}
	
	private int computerSelection() {
		Random rand = new Random();
		return rand.nextInt(1, 4);
	}
	
	private void gameResult(int userSelection, int computerSelection) {
		System.out.println();
		if (computerSelection == userSelection) {
			System.out.println("result: draw");
		}
		else {
			switch (userSelection) {
				case 1: { // user is rock
					if (computerSelection == 2) { // ai is paper
						System.out.println("result: You lost!");
						compWin++;
					}
					else if (computerSelection == 3) { //ai is scissors
						System.out.println("result: You win!");
						userWin++;
					}
					break;
				}
				case 2: { // user is paper
					if (computerSelection == 3) { // ai is scissors
						System.out.println("result: You lost!");
						compWin++;
					}
					else if (computerSelection == 1) { //ai is rock
						System.out.println("result: You win!");
						userWin++;
					}
					break;
				}
				case 3: { // user is scissors
					if (computerSelection == 1) { // ai is rock
						System.out.println("result: You lost!");
						compWin++;
					}
					else if (computerSelection == 2) { //ai is paper
						System.out.println("result: You win!");
						userWin++;
					}
					break;
				}
				default:
					System.out.println("Somet");
			}
		}
		
	}
	
	
}