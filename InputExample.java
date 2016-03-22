import java.io.*;
import java.util.Scanner;
public class InputExample{
	public static void main(String[] args) throws IOException{
	Scanner input = new Scanner(System.in);
System.out.print("Please enter an integer: ");
while (!input.hasNextInt()) {
input. nextLine();
System.out.print("That' s not an integer; please enter an integer: ");
}
int i = input.nextInt();
	}
}