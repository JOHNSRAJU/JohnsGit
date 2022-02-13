import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TrafficLight extends JFrame implements ActionListener,WindowListener {
	int check=0;
	ButtonGroup bgroup = new ButtonGroup();
	JRadioButton rb1 = new JRadioButton("Red");
	JRadioButton rb2 = new JRadioButton("Yellow");
	JRadioButton rb3 = new JRadioButton("Green");
	TrafficLight(){
		setTitle("Traffic Light");
		setBounds(250,250,400,285);
		setVisible(true);
		setLayout(null);
		setBackground(Color.GRAY);
		rb1.setVisible(true);
		rb1.setBounds(175,60,100,20);
		add(rb1);
		  
		rb2.setVisible(true);
		rb2.setBounds(175,90,100,20);
		add(rb2);
		  
		rb3.setVisible(true);
		rb3.setBounds(175,120,100,20);
		add(rb3);
		bgroup.add(rb1);
		bgroup.add(rb2);
		bgroup.add(rb3);
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		rb3.addActionListener(this);
		addWindowListener(this);
	}
	public void paint(Graphics g) {
		g.drawRect(20,40,75,225);
		g.setColor(Color.DARK_GRAY);
		g.fillRect(20,40,75,225);
		
		if(check==1) {
			g.drawOval(30,50,50,50);
			g.setColor(Color.RED);
			g.fillOval(30,50,50,50);
			
			g.drawOval(30,125,50,50);
			g.setColor(Color.WHITE);
			g.fillOval(30,125,50,50);
			
			g.drawOval(30,200,50,50);
			g.setColor(Color.WHITE);
			g.fillOval(30,200,50,50);
		}
		else if(check==2) {
			g.drawOval(30,50,50,50);
			g.setColor(Color.white);
			g.fillOval(30,50,50,50);
			
			g.drawOval(30,125,50,50);
			g.setColor(Color.YELLOW);
			g.fillOval(30,125,50,50);
			
			g.drawOval(30,200,50,50);
			g.setColor(Color.white);
			g.fillOval(30,200,50,50);
		}
		else if(check==3) {
			g.drawOval(30,50,50,50);
			g.setColor(Color.white);
			g.fillOval(30,50,50,50);
			
			g.drawOval(30,125,50,50);
			g.setColor(Color.white);
			g.fillOval(30,125,50,50);
			
			g.drawOval(30,200,50,50);
			g.setColor(Color.GREEN);
			g.fillOval(30,200,50,50);
		}
		else {
			g.drawOval(30,50,50,50);
			g.setColor(Color.white);
			g.fillOval(30,50,50,50);
			
			g.drawOval(30,125,50,50);
			g.setColor(Color.white);
			g.fillOval(30,125,50,50);
			
			g.drawOval(30,200,50,50);
			g.setColor(Color.white);
			g.fillOval(30,200,50,50);
			
		}
	}
	public static void main(String []args) {
		TrafficLight tf = new TrafficLight();
	}
	public void windowOpened(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==rb1) {
			check=1;
			repaint();
		}
		else if(e.getSource()==rb2) {
			check=2;
			repaint();
		}
		else if(e.getSource()==rb3) {
			check=3;
			repaint();
		}
		else {
			check=0;
			repaint();
		}
	}
}
