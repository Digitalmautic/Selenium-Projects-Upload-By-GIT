package gridlayoutcreation;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class grid_layout {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new GridLayout(3,3,0,0));
		      // 1st & 2nd positions are number of rows & columns.
		      // The 3rd position is Horizontal spacing & 4th position is vertical spacing between components.
		
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));

		
		frame.setVisible(true);

	}

}
