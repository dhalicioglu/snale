package cli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import gameManagement.GameManager;

public class SnaleCli {
	
	private static GameManager gameManager;

	public static void main(String[] args) {
		gameManager = new GameManager();
		gameManager.createBoard(11, 11);
		
		play();
	}
	
	
	public static void play(){
		String cmd = "";
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (!cmd.equals("quit")) {

			System.out.print("SNALE> ");

			try {
				cmd = reader.readLine();
			}
			catch (IOException e) {
				e.printStackTrace();
			}

			String[] cmdArr = cmd.split(" ");

			if (cmdArr.length != 0) {
				if (cmdArr[0].equals("r")) {
					gameManager.moveRight(gameManager.getBoard());
				}
				else if (cmdArr[0].equals("l")) {
					gameManager.moveLeft(gameManager.getBoard());
				}
				else if (cmdArr[0].equals("u")) {
					gameManager.moveUp(gameManager.getBoard());
				}
				else if (cmdArr[0].equals("d")) {
					gameManager.moveDown(gameManager.getBoard());
				}
				else if (cmdArr[0].equals("q")) {
					System.out.println(gameManager.getBoard().getSnale().getSnaleCoordinateX());
					System.out.println(gameManager.getBoard().getSnale().getSnaleCoordinateY());
				}
			}
		}
	}

}
