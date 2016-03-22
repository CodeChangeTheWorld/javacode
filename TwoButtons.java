import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer; 
import java.util.TimerTask; 

public class TwoButtons{
	JFrame frame;
	int x=0;
	int y=0;

	public static void main(String[] args){
		TwoButtons gui = new TwoButtons();
		gui.go();
	}

	public void go(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MyDrawPanel drawPanel = new MyDrawPanel();

		
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

		frame.setSize(300,300);
		frame.setVisible(true);

		//trigger a change every second
		Timer timer = new Timer(); 
		long delay1 = 1 * 1000; 
		long period1 = 1000; 
 		timer.schedule(new MyTimer(), delay1, period1); 
	}
	
	class MyDrawPanel extends JPanel{
		public void paintComponent(Graphics g){
			g.setColor(Color.orange);
			g.fillOval(x,y,100,100);
		}
	}
	class MyTimer extends TimerTask{
		public void run() { 
		x+=20;
		y+=20;
		frame.repaint();
	}
	}
}