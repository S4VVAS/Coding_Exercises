package codingExercises;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleCalculator {
	JFrame frame = new JFrame("Savvas's BOOTLEG yeetculator");

	GridLayout mainL = new GridLayout(6, 1, 30, 30);
	GridLayout bLayout = new GridLayout(1, 4, 30, 30);

	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine = new JButton("9");
	JButton zero = new JButton("0");

	JButton plus = new JButton("+");
	JButton minus = new JButton("_");
	JButton times = new JButton("x");
	JButton devided = new JButton("/");
	JButton cl = new JButton("CL");
	JButton dot = new JButton(".");
	JButton equals = new JButton("=");
	JButton square = new JButton("^");
	JButton negative = new JButton("(-)");
	JButton del = new JButton("Del");

	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	JPanel p6 = new JPanel();

	JLabel label = new JLabel();

	private String result = "";
	private int textFontSize = 40;
	private double storedValue = 0;

	private void updateResult(String s) {
		label.setFont(new Font("", Font.BOLD, textFontSize));
		label.setText(s);
	}
	

	public SimpleCalculator() {
		
		//SETS COLOR OF BUTTONS
		
		one.setBackground(Color.LIGHT_GRAY);
		two.setBackground(Color.LIGHT_GRAY);
		three.setBackground(Color.LIGHT_GRAY);
		four.setBackground(Color.LIGHT_GRAY);
		five.setBackground(Color.LIGHT_GRAY);
		six.setBackground(Color.LIGHT_GRAY);
		seven.setBackground(Color.LIGHT_GRAY);
		eight.setBackground(Color.LIGHT_GRAY);
		nine.setBackground(Color.LIGHT_GRAY);
		zero.setBackground(Color.LIGHT_GRAY);

		plus.setBackground(Color.LIGHT_GRAY);
		minus.setBackground(Color.LIGHT_GRAY);
		times.setBackground(Color.LIGHT_GRAY);
		devided.setBackground(Color.LIGHT_GRAY);
		cl.setBackground(Color.ORANGE);
		dot.setBackground(Color.LIGHT_GRAY);
		
		equals.setBackground(Color.cyan);
		square.setBackground(Color.LIGHT_GRAY);
		negative.setBackground(Color.LIGHT_GRAY);
		del.setBackground(Color.LIGHT_GRAY);

		//SETS LAYOUT OF PANELS
		
		frame.setLayout(mainL);
		p2.setLayout(bLayout);
		p3.setLayout(bLayout);
		p4.setLayout(bLayout);
		p5.setLayout(bLayout);
		p6.setLayout(bLayout);

		//ADDS PANELS TO FRAME
		
		frame.add(p1);
		frame.add(p2);
		frame.add(p3);
		frame.add(p4);
		frame.add(p5);
		frame.add(p6);

		//ADDS ELEMENTS TO PANELS
		
		label.setFont(new Font("", Font.BOLD, textFontSize));
		updateResult("hello and welcom");
		p1.add(label);

		p2.add(one);
		p2.add(two);
		p2.add(three);
		p2.add(plus);

		p3.add(four);
		p3.add(five);
		p3.add(six);
		p3.add(minus);

		p4.add(seven);
		p4.add(eight);
		p4.add(nine);
		p4.add(times);

		p5.add(dot);
		p5.add(zero);
		p5.add(cl);
		p5.add(devided);

		p6.add(del);
		p6.add(negative);
		p6.add(square);
		p6.add(equals);

		//NUMBER ACTION EVENTS
		
		one.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (result.length() < 14) {
					result = result + "1";
					updateResult(result);
				}
				else {
					textFontSize-=2;
					result = result + "1";
					updateResult(result);
				}
			}
		});
		
		two.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (result.length() < 14) {
					result = result + "2";
					updateResult(result);
				}
				else {
					textFontSize-=2;
					result = result + "2";
					updateResult(result);
				}
			}
		});
		
		three.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (result.length() < 14) {
					result = result + "3";
					updateResult(result);
				}
				else {
					textFontSize-=2;
					result = result + "3";
					updateResult(result);
				}
			}
		});
		
		four.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (result.length() < 14) {
					result = result + "4";
					updateResult(result);
				}
				else {
					textFontSize-=2;
					result = result + "4";
					updateResult(result);
				}
			}
		});
		
		five.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (result.length() < 14) {
					result = result + "5";
					updateResult(result);
				}
				else {
					textFontSize-=2;
					result = result + "5";
					updateResult(result);
				}
			}
		});
		
		six.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (result.length() < 14) {
					result = result + "6";
					updateResult(result);
				}
				else {
					textFontSize-=2;
					result = result + "6";
					updateResult(result);
				}
			}
		});
		
		seven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (result.length() < 14) {
					result = result + "7";
					updateResult(result);
				}
				else {
					textFontSize-=2;
					result = result + "7";
					updateResult(result);
				}
			}
		});
		
		eight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (result.length() < 14) {
					result = result + "8";
					updateResult(result);
				}
				else {
					textFontSize-=2;
					result = result + "8";
					updateResult(result);
				}
			}
		});
		
		nine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (result.length() < 14) {
					result = result + "9";
					updateResult(result);
				}
				else {
					textFontSize-=2;
					result = result + "9";
					updateResult(result);
				}
			}
		});
		
		zero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (result.length() < 14) {
					result = result + "0";
					updateResult(result);
				}
				else {
					textFontSize-=2;
					result = result + "0";
					updateResult(result);
				}
			}
		});
		
		dot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (result.length() < 14) {
					result = result + ".";
					updateResult(result);
				}
				else {
					textFontSize-=2;
					result = result + ".";
					updateResult(result);
				}
			}
		});
		
		//MATH OPERATIONS
		
		plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				storedValue = storedValue + Double.parseDouble(result);
				result = "";
				updateResult(result);
			}
		});
		
		minus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				storedValue = storedValue - Double.parseDouble(result);
				result = "";
				updateResult(result);
			}
		});
		
		times.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				storedValue = (storedValue * Double.parseDouble(result));
				result = "";
				updateResult(result);
			}
		});
		
		devided.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				storedValue = (storedValue / Double.parseDouble(result));
				result = "";
				updateResult(result);
			}
		});

		negative.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				storedValue = (storedValue - (storedValue * 2));
				result = "";
				updateResult(result);
			}
		});
		
		square.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				storedValue = (storedValue * storedValue);
				result = "";
				updateResult(result);
			}
		});
		
		//EQUALS AND CLEAR OPERATIONS
		
		equals.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateResult(Double.toString(storedValue));
			}
		});
		
		cl.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textFontSize = 40;
				updateResult("");
				result = "";
				storedValue = 0;
			}
		});
		
		del.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				result = "";
				updateResult(result);
			}
		});
		
		
		
		
		

		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setSize(350, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		SimpleCalculator s = new SimpleCalculator();
	}

}
