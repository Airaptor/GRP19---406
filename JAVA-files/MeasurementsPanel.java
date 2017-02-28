import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MeasurementsPanel extends JPanel{

	public MeasurementsPanel(){
	setLayout(new BorderLayout());
	final String DEGREE = "\u00b0";
	setBackground(Color.BLACK);
	JLabel label1=new JLabel("Heart rate:100bpm. Safe:60-100bpm");
	JLabel label2=new JLabel("Temperature:37" + DEGREE + "C Safe: 38.2" + DEGREE + "C ");
	JLabel label3=new JLabel("Blood oxygen level:80% Safe:90%");
	JLabel label4=new JLabel("Blood Pressure: 130/80mmHg Safe:120/80-140/90");
	
	add(label1,BorderLayout.NORTH);
	add(label2,BorderLayout.WEST);
	add(label3,BorderLayout.EAST);
	add(label4,BorderLayout.SOUTH);
	label1.setFont(new Font("Serif", Font.PLAIN, 20));
	label2.setFont(new Font("Serif", Font.PLAIN, 20));
	label3.setFont(new Font("Serif", Font.PLAIN, 20));
	label4.setFont(new Font("Serif", Font.PLAIN, 20));
	label1.setForeground(Color.WHITE);
	label2.setForeground(Color.WHITE);
	label3.setForeground(Color.RED);
	label4.setForeground(Color.WHITE);
	/*label1.setBounds(100,20,86,14);
	label2.setBounds(200,20,140,14);
	label3.setBounds(300,20,80,14);
	label4.setBounds(400,20,80,14);
	
	label1.setSize(86, 14);
	label2.setSize(140, 14);
	label3.setSize(80, 14);
	label4.setSize(80, 14);
	repaint();*/
	}
}
