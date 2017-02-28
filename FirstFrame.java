import javax.swing.*;

public class FirstFrame extends JFrame {
public FirstFrame(){
	setTitle("Patient Moinitor System");
	setSize(600,600); // default size is 0,0
	setLocation(10,200); // default is 0,0 (top left corner)
}

  public static void main(String[] args) {
    JFrame f = new FirstFrame();
    JPanel mainPanel =new MainPanel();
    f.add(mainPanel);
    JMenuBar menuBar = new JMenuBar();
    JMenu menu = new JMenu("File");
    menuBar.add(menu);
    JMenuItem save,open;
    save=new JMenuItem("Save");
    open=new JMenuItem("Open");
    menu.add(save);
    menu.add(open);
    f.setJMenuBar(menuBar);
    f.setVisible(true);
  }

}
