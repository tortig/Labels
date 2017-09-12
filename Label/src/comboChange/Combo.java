package comboChange;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Combo extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	@SuppressWarnings("rawtypes")
	private JComboBox combo;
	private JLabel label;
	private Icon icon1;
	private Icon icon2;
	private Icon icon3;
	
	public Combo(){
		setLayout(new FlowLayout());
		panel = new JPanel();
		String str[] = {"icon1","icon2","icon3"};
		combo = new JComboBox<>(str);
		label = new JLabel();
		icon1 = new ImageIcon("icon1.png");
		icon2 = new ImageIcon("icon2.png");
		icon3 = new ImageIcon("icon5.png");
		
		add(panel);
		panel.add(label);
		panel.add(combo);
		combo.addActionListener(this);
		label.setText("EMPTY");
		setSize(300,200);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == combo){
			if(combo.getSelectedItem() == "icon1"){
				label.setIcon(icon1);
				label.setText(null);
			}
			if(combo.getSelectedItem() == "icon2"){
				label.setIcon(icon2);
				label.setText(null);
			}
			if(combo.getSelectedItem() == "icon3"){
				label.setIcon(icon3);
				label.setText(null);
			}
		}
		
	}

}
