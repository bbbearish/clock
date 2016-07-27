package Clock;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
public class Clock extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JTextField field;
	JPanel panel;
	
	public Clock(){
		
		super("BEARISH CLOCK");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,1000);

		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
		

		
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		field = new JTextField(10);
		field.setEditable(false);
		field.setFont(new Font("Arial", Font.BOLD	, 100));
		field.setBackground(Color.CYAN);
		
		
		panel.add(field);
		
		add(panel);
		Timer t = new Timer(1000, new Listener());
		t.start();
	}
		class Listener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				Calendar rightNow=Calendar.getInstance();
				int hour = rightNow.get(Calendar.HOUR_OF_DAY);
				int min = rightNow.get(Calendar.MINUTE);
				int sec = rightNow.get(Calendar.SECOND);
				field.setText(hour+":"+min+":"+sec);
			}
	}

	
}
