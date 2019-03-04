package codingExercises;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class simpleDrawer {

	
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("This is my program");
		JPanel[] panel = new JPanel[12];
		JPanel panelF = new JPanel();
		JButton[] button = new JButton[12];
		boolean[][] arr = new boolean[12][10];
		
		frame.setSize(1200, 1000);
		frame.setResizable(false);
		panelF.setLayout(new GridLayout(5,5,0,0));
		frame.add(panelF);
		
		
		
		for(int i = 0; i < arr.length; i++) {
			panel[i] = new JPanel();
			panel[i].setSize(100, 100);
			button[i] = new JButton("hello");
		}
		
		
		
		
		
		
		
		
		
		for(int x = 0; x < arr.length; x++) {
			
				panelF.add(panel[x]);
				
				if(x % 2 == 0)
					panel[x].setBackground(Color.CYAN);
				panel[x].add(button[x]);
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	
}
