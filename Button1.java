import javax.swing.*;
import java.awt.*;

public class Button1{
	public static void main(String[] args) {
		Button1 gui = new Button1();
		gui.go();
	}
	public void go(){
		JFrame f = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		JButton b = new JButton("Shock me");
		JButton b1 = new JButton("kiss me");
		JButton buttonThree = new JButton("huh?fadfadfasdfasdfadsf");
		panel.add(b);
		panel.add(b1);
		panel.add(buttonThree);

		f.getContentPane().add(BorderLayout.EAST, panel);
		f.setSize(250,200);
		f.setVisible(true);
	}
}