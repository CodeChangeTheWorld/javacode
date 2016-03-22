import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyDrawPanel extends JPanel {
public void paintComponent(Graphics g) {
// Code to fill the oval with a random color
// See page 347 for the code
	g.fillRect(0,0,this.getWidth(), this.getHeight());
int red = (int) (Math.random() * 255);
int green = (int) (Math.random() * 255);
int blue = (int) (Math.random() * 255);
Color randomColor = new Color(red, green, blue);
g.setColor(randomColor);
g.fillOval(70,70,100,100);
}
}