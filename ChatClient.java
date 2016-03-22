import java.io.*;
import javax.swing.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class ChatClient{
JTextField outgoing;
PrintWriter writer;
Socket sock;
public void go() {
// make gui and register a listener with the send button
// call the setUpNetworking() method
	JFrame f=new JFrame();
	JPanel p=new JPanel();
	outgoing = new JTextField();
	JButton b= new JButton("Send");
	b.addActionListener(new SendButtonListener());
	p.add(outgoing);
	p.add(b);
	f.getContentPane().add(p);
	setUpNetworking();
	f.setSize(400,500);
	f.setVisible(true);
}
private void setUpNetworking() {
// make a Socket, then make a PrintWriter
// assign the PrintWriter to writer instance variable
	try{
		sock =new Socket("127.0.0.1",4242);
		writer = new PrintWriter(sock.getOutputStream());}
	catch(IOException ex){
		ex.printStackTrace();
		}

}
public class SendButtonListener implements ActionListener {
public void actionPerformed(ActionEvent ev) {
// get the text from the text field and
// send it to the server using the writer (a PrintWriter)
	try{
	writer.println(outgoing.getText());
	writer.flush();
} catch(Exception ex) {
	ex.printStackTrace();
	}
	outgoing.setText("");
	outgoing.requestFocus();
}
} // close SendButtonListener inner class
public static void main(String[] args) {
	new ChatClient().go();
}
} // close outer class
