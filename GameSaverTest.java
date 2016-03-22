import java.io.*;
public class GameSaverTest{
	public static void main(String[] args) {
		GameCharacter one = new GameCharacter(50,"Elf",new String[]{"bow", "sword", "dust"});
		GameCharacter two = new GameCharacter(200,"Troll",new String[]{"bare hands", "big ax"});
		GameCharacter three = new GameCharacter(120,"Megician",new String[]{"spells", "invisibility"});

		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
			os.writeObject(one);
			os.writeObject(two);
			os.writeObject(three);
			os.close();
		} catch(IOException ex){ ex.printStackTrace();}
	
	one = null;
	two=null;
	three=null;
	try{
		ObjectInputStream is= new ObjectInputStream(new FileInputStream("Game.ser"));
		GameCharacter oners = (GameCharacter) is.readObject();
		GameCharacter twors = (GameCharacter) is.readObject();
		GameCharacter threers = (GameCharacter) is.readObject();

		System.out.println("One's weapon: "+ oners.getWeapons());
		System.out.println("Two's weapon: "+ twors.getWeapons());
		System.out.println("Three's weapon: "+ threers.getWeapons());
	}catch(Exception ex){ex.printStackTrace();}
}}