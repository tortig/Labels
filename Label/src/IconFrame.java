import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class IconFrame extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label;
	private JButton button;
	private TextArea text;
	private JPanel panel;
	private Icon icon;
	
	public IconFrame(){
		setLayout(new FlowLayout());
		icon = new ImageIcon("Desert.jpg");
		label = new JLabel();
		button = new JButton("Check");
		text = new TextArea(10, 10);
		panel = new JPanel();
		label.setIcon(icon);
		panel.add(label);
		panel.add(text);
		panel.add(button);
		add(panel);
		button.addActionListener(this);
		setSize(300,300);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button){
			text.setText(icon.toString());
		}
		
	}
}
