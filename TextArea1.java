import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextArea1 implements ActionListener{
	JTextArea text;
	public static void main(String[] args) {
		TextArea1 gui=new TextArea1();
		gui.go();
	}
	public void go(){
		JFrame f=new JFrame();
		JPanel p =new JPanel();
		JButton b=new JButton("Just click it");
		b.addActionListener(this);
		text = new JTextArea(10,20);
		text.setLineWrap(true);

		JScrollPane scroller = new JScrollPane(text);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		p.add(scroller);
		f.getContentPane().add(BorderLayout.CENTER,p);
		f.getContentPane().add(BorderLayout.SOUTH,b);
		
		f.setSize(350,300);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent event ){
		text.append("Button clicked \n");
	}
}