public class SimpleDotComTestDrive{
	public static void main(Stringp[] args){
		SimpleDotCom dot = new SimpleDotCom();
		int[] logcations = {2,3,4};
		dot.setLocationCells(locations);

		String userGuess="2";
		String result =dot.checkYourself(userGuess);
		String testresult ="failed";
		if(result.equals("hit")){
			testResult="passed";
		}
		System.out.println(testResult);
	}
}