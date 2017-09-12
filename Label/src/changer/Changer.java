package changer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Changer extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton start;
	private JButton stop;
	private JLabel label;
	private int counter = 0; 
	private Timer tm;
	private String[] list = {"icon1.png","icon2.png","icon5.png"};
	
	public Changer(){
		super("SlideShow");
		setLayout(new FlowLayout());
		start = new JButton("START");
		stop = new JButton("STOP");
		label = new JLabel();
		ImageIcon icon= new ImageIcon(list[0]);
		label.setIcon(icon);
		
		tm = new Timer(500,new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon= new ImageIcon(list[counter]);
				label.setIcon(icon);
				counter += 1;
				if(counter >= list.length)
					counter = 0;
			}
		});
		
		add(label);
		add(start);
		add(stop);
		start.addActionListener(this);
		stop.addActionListener(this);
		setSize(300,200);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == start)
			tm.start();
		if(e.getSource() == stop)
			tm.stop();
	}
}
