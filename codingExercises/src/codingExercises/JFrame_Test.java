package codingExercises;

import java.awt.event.ActionEvent;

import javax.swing.*;

public class JFrame_Test {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Frame title");
		JButton button = new JButton("Button text");
		JPanel panel = new JPanel();
		
		frame.getContentPane().add(panel);
		panel.add(button);
		frame.setLocationRelativeTo(null);
		frame.setSize(400, 200);
		
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
	
}
