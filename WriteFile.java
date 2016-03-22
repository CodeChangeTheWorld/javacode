import java.io.*;
class WriteFile{
	public static void main(String[] args) {
		try{
			FileWriter writer = new FileWriter("Foo.txt")
			writer.write("hello ")；
			writer.close)(;)
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
}