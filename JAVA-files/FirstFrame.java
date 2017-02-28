import javax.swing.*;							//importing relevant packages
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstFrame extends JFrame implements ActionListener {	
	
	JFrame f;							// declaring all JFrame variables
	JPanel mainPanel;
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem save;
	JMenuItem open;
	JMenuItem exit;

	public FirstFrame(){						// main interface constructor 
		
		f = new JFrame();					// creating the main jframe for interface 
		
		f.setTitle("Patient Moinitor System");

		f.pack();
		f.setSize(600,600); 					// default size is 0,0...
    		f.setLocationRelativeTo(null);
		
		mainPanel = new MainPanel();				// calling on MainPanel.java and creating a panel for interface
		f.add(mainPanel);					// adding the panel to the empty jframe

		menuBar = new JMenuBar();				// creating a menu bar
		menu = new JMenu("File");				// creating a dropdown menu item "File" for the menu bar 
		menuBar.add(menu);					// adding the dropdown menu to the bar
		
		save = new JMenuItem("Save");				// creating all JMenuItems for the menubar(s)
		open = new JMenuItem("Open");
		exit = new JMenuItem("Exit");
	
		menu.add(open);						// adding all buttons to dropdown menu
		menu.add(save);
		menu.add(exit);

		f.setJMenuBar(menuBar);					// setting the menu bar for the main frame 
		f.setVisible(true);					// setting the frame to be visible

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Standard default closeing operation for JFrame
		exit.addActionListener(this);				// adding listener to button(s) <-- will be added to other menu buttons


	}
  	public static void main(String[] args) {			// main method to create interface
    		new FirstFrame();
	}

	@Override
    	public void actionPerformed(ActionEvent e) {			//adding listener methjod(s) to menu buttons

     		if("Exit".equals(e.getActionCommand())){
			System.exit(NORMAL);
       		}
	}


}
