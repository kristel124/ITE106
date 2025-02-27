import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuExample {
	public static void main(String[] args){
		JFrame frame = new JFrame("My Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenu fileMenu = new JMenu("File");
		fileMenu.add(new JMenuItem("New"));
		fileMenu.add(new JMenuItem("Open"));
		fileMenu.add(new JMenuItem("Close"));
		
		JMenu editMenu = new JMenu("Edit");
		editMenu.add(new JMenuItem("Undo"));
		editMenu.add(new JMenuItem("Redo"));
		editMenu.add(new JMenuItem("Cut"));
		
		JMenuBar menubar = new JMenuBar();
		menubar.add(fileMenu);
		menubar.add(editMenu);
		
		frame.setJMenuBar(menubar);
		frame.setVisible(true);
	}
}
