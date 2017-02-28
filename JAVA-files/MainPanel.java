import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
	private Container contain;
	public MainPanel(){
		setLayout(new BorderLayout());
		setBackground(Color.BLUE);
		JButton measureButton=new JButton("Measure");
		JLabel label1=new JLabel("Patient Mointor System",JLabel.CENTER);
		label1.setFont(new Font("Serif", Font.PLAIN, 32));
		label1.setForeground(Color.RED);
		measureButton.setBounds(200,400,200,100);
		add(measureButton);
	   	add(label1);
		//ActionMeasure measure = new ActionMeasure();
		measureButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				System.out.println("high Blood Suger");
				JPanel measurements = new MeasurementsPanel();
	        		removeAll();	
				add(measurements);
				repaint();
				revalidate();
			}
		}
		);
	}

}
