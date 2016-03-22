import java.util.Scanner;

public class SimpleDotComGame{
	public static void main(String[] args) {
		int numOfGuesses=0;
		GameHelper helper= new GameHelper();
		SimpleDotCom dotcom = new SimpleDotCom();
		int startPoint = (int) Math.random()*5;
		int[] locations = {startPoint, startPoint+1, startPoint+2};
		dotcom.setLocationCells(locations);
		Boolean isAlive=true;
		while(isAlive==true){
			String guess = helper.getUserInput("enter a number");
			String result = dotcom.checkYouself(guess);
			numOfGuesses++;
			if(result=="kill"){
				isAlive=false;
				System.out.println("You took "+ numOfGuesses+" guesses");
			}

		}
	}}