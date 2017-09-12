package change2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Change2 extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel1;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private Icon icon1;
	private Icon icon2;
	private Icon icon3;
	
	private JPanel panel2;
	private JTextField text1;
	private JTextField text2;
	private JButton button;
	
	public Change2(){
		super("Change");
		setLayout(new GridLayout(2, 1));
		panel1 = new JPanel(new FlowLayout());
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		icon1 = new ImageIcon("icon1.png");
		icon2 = new ImageIcon("icon2.png");
		icon3 = new ImageIcon("icon5.png");
		
		panel2 = new JPanel(new FlowLayout());
		text1 = new JTextField(2);
		text2 = new JTextField(2);
		button = new JButton("Change");
		
		label1.setIcon(icon1);
		label2.setIcon(icon2);
		label3.setIcon(icon3);
		panel1.add(label1);
		panel1.add(label2);
		panel1.add(label3);
		panel1.setBackground(Color.GREEN);
		panel2.add(text1);
		panel2.add(text2);
		panel2.add(button);
		panel2.setBackground(Color.YELLOW);
		add(panel1);
		add(panel2);
		button.addActionListener(this);
		setSize(400, 250);
		setName("Changer");
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button){
			if(Integer.parseInt(text1.getText()) == 1 && Integer.parseInt(text2.getText()) == 2){
				label1.setIcon(icon2);
				label2.setIcon(icon1);
			}
			if(Integer.parseInt(text1.getText()) == 1 && Integer.parseInt(text2.getText()) == 3){
				label1.setIcon(icon3);
				label3.setIcon(icon1);
			}
			if(Integer.parseInt(text1.getText()) == 2 && Integer.parseInt(text2.getText()) == 1){
				label1.setIcon(icon2);
				label2.setIcon(icon1);
			}
			if(Integer.parseInt(text1.getText()) == 2 && Integer.parseInt(text2.getText()) == 3){
				label3.setIcon(icon2);
				label2.setIcon(icon3);
			}
			if(Integer.parseInt(text1.getText()) == 3 && Integer.parseInt(text2.getText()) == 1){
				label1.setIcon(icon3);
				label3.setIcon(icon1);
			}
			if(Integer.parseInt(text1.getText()) == 3 && Integer.parseInt(text2.getText()) == 2){
				label3.setIcon(icon2);
				label2.setIcon(icon3);
			}
			else
				return;
		}
		
	}
	
}
