import java.awt.*;
import java.awt.event.*;
import java.swing.*;

public class MenuActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e){
		JoptionPane.showMessageDiaglog(MenuExample.frame, "Got an ActionEvent at " + new Date(e.getWhen()) + "from" + e.getSource().getClass());
	}
}
