package cli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import timeMeasurement.TimeMeasure;
import gameManagement.GameManager;

public class SnaleCli {
	
	private static GameManager gameManager;
	private static TimeMeasure timer;

	public static void main(String[] args) {
		gameManager = new GameManager();
		gameManager.createBoard(11, 11);
		
		play();
	}
	
	
	public static void play(){
		boolean isGameStarted = false;
		timer = new TimeMeasure();
		
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
					if(!isGameStarted){
						isGameStarted = true;
						timer.startTimer();
					}
					gameManager.moveRight(gameManager.getBoard());
					if(gameManager.getBoard().getEndSlot().isPassed()){
						timer.endTimer();
						System.out.println((timer.getEndTime() - timer.getStartTime()) / 1000);
					}
				}
				else if (cmdArr[0].equals("l")) {
					gameManager.moveLeft(gameManager.getBoard());
					if(gameManager.getBoard().getEndSlot().isPassed()){
						timer.endTimer();
						System.out.println((timer.getEndTime() - timer.getStartTime()) / 1000);
					}
				}
				else if (cmdArr[0].equals("u")) {
					if(!isGameStarted){
						isGameStarted = true;
						timer.startTimer();
					}
					gameManager.moveUp(gameManager.getBoard());
					if(gameManager.getBoard().getEndSlot().isPassed()){
						timer.endTimer();
						System.out.println((timer.getEndTime() - timer.getStartTime()) / 1000);
					}
				}
				else if (cmdArr[0].equals("d")) {
					gameManager.moveDown(gameManager.getBoard());
					if(gameManager.getBoard().getEndSlot().isPassed()){
						timer.endTimer();
						System.out.println((timer.getEndTime() - timer.getStartTime()) / 1000);
					}
				}
			}
		}
	}

}
