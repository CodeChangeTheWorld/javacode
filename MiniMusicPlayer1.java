import javax.sound.midi.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class MiniMusicPlayer1{
	JFrame frame = new JFrame("My music vedio");
	MyPanel pl ;
	public static void main(String[] args) {
		MiniMusicPlayer1 mini = new MiniMusicPlayer1();
		mini.go();
	}
	public void go(){
		setupGui();
		try{
			Sequencer seqr = MidiSystem.getSequencer();
			seqr.open();
			seqr.addControllerEventListener(pl, new int[]{127});
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();

			int r = 0;
			for(int i=0;i<60;i+=4){
				r= (int)((Math.random()*50)+1);
				track.add(makeEvent(144,1,r,100,i));
				track.add(makeEvent(176,1,127,0,i));
				track.add(makeEvent(128,1,r,100,i+2));
			}

			seqr.setSequence(seq);
			seqr.start();
			seqr.setTempoInBPM(120);
		}catch(Exception ex){ex.printStackTrace();}
	}
	public void setupGui(){
		pl= new MyPanel();
		frame.setContentPane(pl);
		frame.setBounds(30,30,300,300);
		frame.setVisible(true);
	}
	public MidiEvent makeEvent(int cmod,int chan, int one,int two,int tick){
		MidiEvent event = null;
		try{
			ShortMessage a = new ShortMessage();
			a.setMessage(cmod,chan,one,two);
			event= new MidiEvent(a,tick);
		}catch(Exception e){}
		return event;
	}
	class MyPanel extends JPanel implements ControllerEventListener{
		boolean msg = false;

		public void controlChange(ShortMessage event){
			msg=true;
			repaint();
		}
		public void paintComponent(Graphics g){
			if(msg){
				Graphics2D g2= (Graphics2D)g;
				int r= (int)(Math.random()*250);
				int gr= (int)(Math.random()*250);
				int b= (int)(Math.random()*250);

				g.setColor(new Color(r,gr,b));
				int ht = (int) ((Math.random() * 120) + 10);
				int width = (int) ((Math.random() * 120) + 10);
				int x = (int) ((Math.random() * 40) + 10);
				int y = (int) ((Math.random() * 40) + 10);

				g.fillRect(x,r,ht,width);
				msg=false;
			}
		}
	}
}