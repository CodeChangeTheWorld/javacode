import java.util.ArrayList;
public class DotCom{
	ArrayList<String> locationCells;
	private String name;
	public void DotCom(String name){
		this.name=name;
	}
	public void setLocationCells(ArrayList<String> locs){
		locationCells = locs;
	}

	public String checkYouself(String stringGuess){
		String result="miss";
		int index = locationCells.indexOf(stringGuess);
		if (index>=0){
			locationCells.remove(index);
			if(locationCells.isEmpty()){
				result="kill";
				System.out.println("Ouch! You sunk "+name+" :( ");
			}else{
				result="hit";
			}
		}
		return result;
	}
}